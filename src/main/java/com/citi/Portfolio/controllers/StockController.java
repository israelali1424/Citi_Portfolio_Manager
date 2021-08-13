package com.citi.Portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.citi.Portfolio.entities.Stock;
import com.citi.Portfolio.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
@CrossOrigin // allows requests from all domains
@RestController
@RequestMapping(value = "/stocks")
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping
    public Collection<Stock> getStocks() {
        return stockService.getAllStocks();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{symbol}")
    public Stock getStockBySymbol(@PathVariable("symbol") String symbol) {
        return  stockService.getStockBySymbol(symbol);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCd(@RequestBody Stock stock) {
        stockService.addNewStock(stock);
    }

}









