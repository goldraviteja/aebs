import { Component, OnInit } from '@angular/core';
import { CallcForm }    from './callcForm';
import { Router } from '@angular/router';

@Component({
  moduleId: module.id,
  selector: 'callc-form',
  templateUrl: './callc-form.component.html',
  styleUrls: ['./callc-form.component.css']
})

export class CallcFormComponent implements OnInit {

  constructor(private router : Router) { }

  searchCriteria =  ['ATN', 'WTN', 'USOC'];
  sortByValues = ['ATN,USOC', 'USOC,WTN'];
  monthList = [1,2,3,4,5,6,7,8,9,10,11,12];
  yearList = [2017,2016,2015,2014,2013,2012];
  isSearchByATN = false;
  isSearchByUSOC = false;
  isChecked = false;

  model = new CallcForm(1, 2017, '', '', '','');

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
      this.router.navigate(['/callc-details']);
  }
}
