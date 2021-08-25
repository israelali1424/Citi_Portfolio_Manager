import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-market-movers',
  templateUrl: './market-movers.component.html',
  styleUrls: ['./market-movers.component.css']
})
export class MarketMoversComponent implements OnInit {

  constructor() { }
  // we can declare data models for use within this component
  people = [
    { f: 'Grace', l: 'Hopper' },
    { f: 'Catherine', l: 'Johnson' },
    { f: 'Lisa', l: 'Su' },
    { f: 'Ada', l: 'Lovelace' },
    { f: 'Timnit', l: 'Gebru' },
    { f: 'Meng', l: 'Wanzhou' }
  ]

  changedStocks = [
    { ticker: 'APPL', delta: -12},
    { ticker: 'AMZN', delta: 10},
    { ticker: 'TSLA', delta: 5},

  ]
  ngOnInit(): void {
  }

}
