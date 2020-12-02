import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Pull} from "../model/pull";

@Injectable({
  providedIn: 'root'
})
export class PullListService {

  constructor(private http: HttpClient) {
  }

  listPulls(): Observable<Pull[]> {
    return this.http.get<Pull[]>('api/pulls/list');
  }

}
