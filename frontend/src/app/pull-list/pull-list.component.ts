import {Component, Input, OnInit} from '@angular/core';
import {PullListService} from "./pull-list.service";
import {Pull} from "../model/pull";

@Component({
  selector: 'app-pull-list',
  templateUrl: './pull-list.component.html',
  styleUrls: ['./pull-list.component.scss']
})
export class PullListComponent implements OnInit {

  @Input() pulls: Pull[] = [];

  //displayedColumns: string[] = ['Titre', 'Repository', 'UserStory', 'TestEnv', 'Actions'];
  displayedColumns: string[] = ['Titre', 'Repository', 'UserStory', 'TestEnv'];


  constructor(
    private pullListService: PullListService
  ) { }



  ngOnInit(): void {
    this.pullListService
      .listPulls()
      .subscribe(result => {
        this.pulls = result;
      })
  }

}
