package com.citi.Portfolio.service;
import  com.citi.Portfolio.entities.Stock;
import  com.citi.Portfolio.repos.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockRepository stockRepository;

    @Override
    public Collection<Stock> getAllStocks() {
        return  stockRepository.findAll();
}


}