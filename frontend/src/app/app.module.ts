import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PullListComponent } from './pull-list/pull-list.component';
import {HttpClientModule} from "@angular/common/http";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CarmenMaterialModule} from "./shared/carmen-material.module";

@NgModule({
  declarations: [
    AppComponent,
    PullListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    CarmenMaterialModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
