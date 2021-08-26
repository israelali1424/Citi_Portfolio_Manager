package com.citi.Portfolio.service;
import  com.citi.Portfolio.entities.Stock;
import  com.citi.Portfolio.repos.StockRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @Override
    public void updateStock(String symbol,String type, Integer amount){
        Stock temp = stockRepository.findBySymbol(symbol).iterator().next();

        /*
        if (type.toLowerCase().equals("buy")) {
            temp.setVolume(temp.getVolume() + amount);
            temp.setSymbol("WWWW");
            stockRepository.save(temp);
        } else if (type.toLowerCase().equals("sell")) {
            temp.setVolume(temp.getVolume() - amount);
            // if the user sells more share than they own.
            if (temp.getVolume()<0){
                temp.setVolume(0);
            }
            stockRepository.save(temp);
        }
        */


    }

    @Override
	public void deleteStockBySymbol(String symbol) {
		Stock toBeDeleted = stockRepository.findBySymbol(symbol).iterator().next();
        deleteStock(toBeDeleted);
	}

	@Override
	public void deleteStock(Stock stock) {
		stockRepository.delete(stock);
	}

    @Override
    public Stock getStockBySymbol(String symbol) {
        Iterable<Stock> StockOptional =  stockRepository.findBySymbol(symbol);
           return   StockOptional.iterator().next();

    }
}