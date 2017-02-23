import { Component, OnInit,OnDestroy   } from '@angular/core';
import {CallcDetails} from '../callc-details/callcDetails'
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-callc-details',
  templateUrl: './callc-details.component.html',
  styleUrls: ['./callc-details.component.css']
})

export class CallcDetailsComponent implements OnInit {

 constructor(private route: ActivatedRoute) {}

  callcDetailsList : CallcDetails[];
  str : string;
 private sub: any;

  ngOnInit() {
  	this.sub = this.route.params.subscribe(params => {
       this.str = params['str']; 
      // TODO: Need to developer a table to display the result summary
       // In a real app: dispatch action to load the details here.
    });
  }

    ngOnDestroy() {
    this.sub.unsubscribe();
  }

}
