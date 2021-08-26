import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

 

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
   
  data!:Array<any>
  total!:0;
  size!:any;
  constructor(private http: HttpClient){}
  // here we can declare our data models
  title = 'citi-portfolio-manager';
  today = new Date()
  user = 'Ada'
  askCookieConsent = true
  fbImage = 'KenojuakAshevak'
  // In ES6 functions that belong to classes are written like this
  agreeCookie(){
    this.askCookieConsent = false
  }
 

  ngOnInit(){
    // this.http.get<any>('http://citi-portfolio-manager-citi-portfolio-manager.namdevops13.conygre.com/stocks').subscribe(data => {
    //   this.data = data.total
    // });
    fetch('http://citi-portfolio-manager-citi-portfolio-manager.namdevops13.conygre.com/stocks')
  .then(response => response.json())
  .then(data => this.data=data);
  
  
    
  }
  

  getData(){
 
  console.log(this.data)
  console.log(this.total)
  console.log(this.size)

  }
  randomColor(){
    console.log(Math.floor(Math.random()*16777215).toString(16))
}
}
