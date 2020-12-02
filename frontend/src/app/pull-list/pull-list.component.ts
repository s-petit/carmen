import { Component, OnInit } from '@angular/core';
import {PullListService} from "./pull-list.service";
import {Pull} from "../model/pull";

@Component({
  selector: 'app-pull-list',
  templateUrl: './pull-list.component.html',
  styleUrls: ['./pull-list.component.scss']
})
export class PullListComponent implements OnInit {

  constructor(
    private pullListService: PullListService
  ) { }

  pulls: Pull[] = [];

  ngOnInit(): void {
    this.pullListService
      .listPulls()
      .subscribe(result => {
        this.pulls = result;
      })
  }

}
