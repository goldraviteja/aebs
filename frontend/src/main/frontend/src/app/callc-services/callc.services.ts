import {Injectable} from '@angular/core';
import {Observable}     from 'rxjs/Observable';
import { CallcForm }    from '../model/callcForm';
import {Http, RequestOptions, Headers} from '@angular/http';
import {Response} from '../response_status/response-status';


import 'rxjs/add/operator/map';
import 'rxjs/add/operator/mergeMap';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/finally';


@Injectable()
export class CallcService {
	url:string;
    controller: string;
    method: string;
    constructor(private http: Http) {
    }

     post(newCallcForm: CallcForm): Observable<Response> {
        this.controller = "aebs";
        this.method="getDetails";
        this.url = "http://localhost:8080/aebs/getDetails";
       
        let body = JSON.stringify(newCallcForm);

        let headers = new Headers({ 'Content-Type': 'application/json' });
        let options = new RequestOptions({ headers: headers });
       
        return this.http.post(this.url, body, options).map((res) => res.json())
         .catch(res => {
 
            return res;

        }).finally(() =>{
        
        });
    }
}