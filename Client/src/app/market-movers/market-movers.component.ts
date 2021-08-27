import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-market-movers',
  templateUrl: './market-movers.component.html',
  styleUrls: ['./market-movers.component.css']
})
export class MarketMoversComponent implements OnInit {

  constructor() { }
  // we can declare data models for use within this component

  changedStocks = [
    { ticker: 'APPL', delta: 12.3},
    { ticker: 'AMZN', delta: 10.6},
    { ticker: 'TSLA', delta: 5.8},

  ]

  LoserStocks = [
    { ticker: 'WMT', delta: -15.9},
    { ticker: 'DIS', delta: -10.2},
    { ticker: 'AZO', delta: -5.5},

  ]
  ngOnInit(): void {
  }

}
