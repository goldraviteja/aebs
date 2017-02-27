import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { CallcFormComponent } from './callc-form/callc-form.component';
import {CallcService} from './callc-services/callc.services';

import { Ng2SmartTableModule, LocalDataSource } from 'ng2-smart-table';

const appRoutes : Routes =[
{ path: '', component: CallcFormComponent }
];



@NgModule({
  declarations: [
    AppComponent,
    CallcFormComponent
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
