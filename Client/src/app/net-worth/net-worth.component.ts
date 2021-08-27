import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-net-worth',
  templateUrl: './net-worth.component.html',
  styleUrls: ['./net-worth.component.css']
})
export class NetWorthComponent implements OnInit {

  // declare model data for this component
  total = 20312.21
  codes = [
    {code:'AMZN', price:42}, // member zero
    {code:'NFLX', price:12}, // member 1
    {code:'GOOGL', price:142},
    {code:'FB', price:82},
    {code:'AAPL', price:11},
    {code:'TSLA', price:30},
  ]

  @Input() dataa:any

  constructor() { }

  ngOnInit(): void {
  }

  // we can declare methods of this class here
  handleSortie(value:number){
    // here we can handle the CUSTOM event from the child component
    this.total += value
  }
  // handleSellEvent(value:number){
  //   this.total -= value
  // }
  // data looks like this [{"id":1,"symbol":"TSLA","volume":200,"price":719.43},{"id":2,"symbol":"AAPL","volume":500,"price":148.91},{"id":3,"symbol":"DIS","volume":1000,"price":142.34}] 

  handleCodeChangeEvent(whichSymbol:any){
    this.dataa[whichSymbol['index']].symbol = whichSymbol['symbol']
  }

}
