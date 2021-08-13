package com.citi.Portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.citi.Portfolio.entities.Stock;
import com.citi.Portfolio.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

@RestController
@RequestMapping(value = "/stocks")
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping
    public Collection<Stock> getStocks() {
        return stockService.getAllStocks();
    }
}









