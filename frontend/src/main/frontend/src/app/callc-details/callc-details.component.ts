import { Component, OnInit  } from '@angular/core';
import {CallcDetails} from '../callc-details/callcDetails'
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-callc-details',
  templateUrl: './callc-details.component.html',
  styleUrls: ['./callc-details.component.css']
})

export class CallcDetailsComponent implements OnInit {

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
    }
  };

  data = [
  {
    usoc: "JZNDC",
    qty: "10",
    cost: "24",
    amount: "240",
    occ: "JZNDC"
  },
   {
    usoc: "JZNDC",
    qty: "10",
    cost: "24",
    amount: "240",
    occ: "JZNDC"
  }
];

 constructor(private route: ActivatedRoute) {}
 
 callcDetailsList : CallcDetails[];
 

  ngOnInit() {
  	
  }

 // setCallcDetailsList(callcDetailsList : CallcDetails[]) {
 // 	CallcDetailsComponent.callcDetailsList = callcDetailsList;
 // 	console.log(JSON.stringify(CallcDetailsComponent.callcDetailsList));
 // }
}
