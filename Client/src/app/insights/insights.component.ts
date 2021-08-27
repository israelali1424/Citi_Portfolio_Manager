import { Component, OnInit, Input } from '@angular/core';
import {GraficoModel} from "../Model/grafico.model";

@Component({
  selector: 'app-insights',
  templateUrl: './insights.component.html',
  styleUrls: ['./insights.component.css']
})
export class InsightsComponent implements OnInit {
    @Input() data!: Array<any>;
    sizes: Array<any> = [];
    total:number=0

    values:Array<any> = [
        {id: 1, symbol: "TSLA", volume: 200, price: 719.43, color: 'rgb(38, 43, 219)'},
        {id: 2, symbol: "AAPL", volume: 500, price: 148.91, color: 'rgb(240, 98, 215)'},
        {id: 3, symbol: "DIS", volume: 1038, price: 142.34, color: 'rgb(166, 240, 20)'},
        {id: 7, symbol: "WMT", volume: 70, price: 149.54, color: 'rgb(17, 242, 126)'},
        {id: 7, symbol: "GOOG", volume: 12, price: 2842.46, color: 'rgb(161, 43, 19)'},
        {id: 7, symbol: "HOOD", volume: 12, price: 1487.12, color: 'rgb(161, 43, 19)'},
        {id: 7, symbol: "GOOG", volume: 12, price: 1000.46, color: 'rgb(161, 43, 19)'},
        {id: 7, symbol: "GOOG", volume: 12, price: 2212.46, color: 'rgb(161, 43, 19)'},
]

    public maxHeight= 160;
  
    constructor() { }
   
    MontarGrafico(){
      this.values.map(element => element.size = (Math.round((element.price/this.total)*100))+'%')
    }
    
    getSizes(){
            this.data.forEach(element => {
            this.sizes.push(Math.round((element.price*this.maxHeight)/this.total))
        })
        console.log(this.sizes)
    };
      randomColor(){
       return("#" + (Math.floor(Math.random()*16777215).toString(16)))
    }

    showSizes(){
        console.log(this.data)
    }
    createTotal(){
        // this.data.forEach(element => {
        //    this.total+=element.price
        //     });

        for (let i = 0; i < this.values.length; i++) {
            this.total+=this.values[i].price
        }    
      }



    ngOnInit(): void {
        this.createTotal()
        this.MontarGrafico()
        console.log(this.values)
    }
}
