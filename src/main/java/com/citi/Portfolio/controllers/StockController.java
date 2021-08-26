package com.citi.Portfolio.controllers;


import com.citi.Portfolio.repos.StockRepository;
import io.swagger.models.auth.In;
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

    private StockRepository stockRepository;

    @GetMapping
    public Collection<Stock> getStocks() {
        return stockService.getAllStocks();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{symbol}")
    public Stock getStockBySymbol(@PathVariable("symbol") String symbol) {
        return  stockService.getStockBySymbol(symbol);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addStock(@RequestBody Stock stock) {
        stockService.addNewStock(stock);
    }

    @PutMapping("/update/{symbol}")
    public void updateVolume(
    @PathVariable String symbol,
    @RequestBody Integer amount) {
        Stock temp = new Stock();

        stockRepository.save()


    }
/*
    @RequestMapping(method = RequestMethod.PUT)
    public void updateStockVolume(@RequestBody String symbol,String type, Integer amount) {
        System.out.println(amount);
        if (amount != null) {

            stockService.updateStock(symbol, type, (int)amount);
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{update}")
    public void update(@PathVariable("symbol") String symbol) {
    //public void updateStock(@PathVariable("amount") Integer amount) {
        stockService.updateStock(symbol, "buy", 12);

    }
    */

    @RequestMapping(method = RequestMethod.DELETE, value = "/{symbol}")
    public void deleteS(@PathVariable("symbol") String symbol) {
        stockService.deleteStockBySymbol(symbol);
    }




}









