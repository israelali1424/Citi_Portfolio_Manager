package com.citi.Portfolio.service;
import  com.citi.Portfolio.entities.Stock;
import  com.citi.Portfolio.repos.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockRepository stockRepository;
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Collection<Stock> getAllStocks() {
        return  stockRepository.findAll();
}

    @Override
    public Stock addNewStock(Stock stock) {
        stock.setId(0); // assume it is not in the db
        return stockRepository.save(stock);
    }


}