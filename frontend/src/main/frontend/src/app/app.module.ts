import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { CallcFormComponent } from './callc-form/callc-form.component';
import { CallcDetailsComponent } from './callc-details/callc-details.component';
import {CallcService} from './callc-services/callc.services';

import { Ng2SmartTableModule, LocalDataSource } from 'ng2-smart-table';

const appRoutes : Routes =[
{ path: '', component: CallcFormComponent },
{ path: 'callc-details', component: CallcDetailsComponent }
];



@NgModule({
  declarations: [
    AppComponent,
    CallcFormComponent,
    CallcDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes),
    Ng2SmartTableModule
  ],
  providers: [CallcService],
  bootstrap: [AppComponent]
})




export class AppModule { }
