import { Component, OnInit  } from '@angular/core';
import { CallcForm }    from '../model/callcForm';
import { Router } from '@angular/router';
import {CallcService} from '../callc-services/callc.services';
import {Response} from '../response_status/response-status';
import {CallcDetails} from '../model/callcDetails';
import { Ng2SmartTableModule, LocalDataSource } from 'ng2-smart-table';

@Component({
  moduleId: module.id,
  selector: 'callc-form',
  templateUrl: './callc-form.component.html',
  styleUrls: ['./callc-form.component.css']
})

export class CallcFormComponent implements OnInit {

  constructor(private router : Router, private callcService : CallcService) { }

  searchCriteria =  ['ATN', 'WTN', 'USOC'];
  sortByValues = ['ATN,USOC', 'USOC,WTN'];
  monthList = [1,2,3,4,5,6,7,8,9,10,11,12];
  yearList = [2017,2016,2015,2014,2013,2012];
  states = ['IL','IN','MI','WI','OH','ALL'];
  isSearchByATN = false;
  isSearchByUSOC = false;
  isChecked = false;
  _response: Response;
  displayError = false;
  errorMessage: string;
  callcDetailsList : CallcDetails[];
  
  isForm = true;

  model = new CallcForm(1, 2017, '', '', false,false,false,false,'', '');

   settings = {
    columns: {
      usoc: {
        title: 'USOC'
      },
      qty: {
        title: 'Qty'
      },
      cost: {
        title: 'Cost'
      },
      amount: {
        title: 'Amount'
      },
      occ: {
        title: 'Type'
      }
    },
     actions: false,
     filter : false,
     hideSubHeader : true
  };

  onSelectSearchBy(searchBySelectValue : String, filterByATN, filterByUSOC, filterByZero, filterByMRC) : void {

    this.isSearchByATN = false;
    this.isSearchByUSOC = false;
  	if(searchBySelectValue === "ATN" || searchBySelectValue === "WTN") {
      this.isSearchByUSOC = true;
    }

    if(searchBySelectValue === "USOC") {
      this.isSearchByATN = true;
    }
    
    filterByATN.checked = false;
    filterByUSOC.checked = false;
    filterByZero.checked = false;
    filterByMRC.checked = false;
   }

    ngOnInit() {
  }

    onSubmit() {
      
      this.callcService.post(this.model).subscribe(
        res => {this._response = res;        
        if (this._response != undefined && this._response.success ) {
          this.isForm = false;
          this.callcDetailsList = this._response.body;
          
          console.log(this._response);
          console.log(this.callcDetailsList);
          
          }
        },
          err => {
                this.displayError = true;
                this.errorMessage = "Something went wrong! Please check with Administrator.";
            }
      );
  }
}
