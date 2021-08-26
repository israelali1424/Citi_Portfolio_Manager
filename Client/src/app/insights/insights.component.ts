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
    total!:number;

    values:Array<any> = [
        {id: 1, symbol: "TSLA", volume: 200, price: 719.43},
        {id: 2, symbol: "AAPL", volume: 500, price: 148.91},
        {id: 3, symbol: "DIS", volume: 1038, price: 142.34},
        {id: 7, symbol: "WMT", volume: 70, price: 149.54}
]

    public maxHeight= 160;
  
    constructor() { }
   
    MontarGrafico(){
      this.data.forEach(element => {
        this.total += element.price;
        console.log(this.total)
      });
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
        //   this.total+=this.data[i].price
           console.log(i)
          
      }
    }



    ngOnInit(): void {
        this.createTotal()
    }
}
