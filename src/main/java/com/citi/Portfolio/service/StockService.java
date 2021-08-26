package com.citi.Portfolio.service;
import  com.citi.Portfolio.entities.Stock;
import java.util.Collection;
public interface StockService {
    Collection<Stock> getAllStocks();
    Stock addNewStock(Stock stock);
    void deleteStockBySymbol(String symbol);
    void deleteStock(Stock stock);
    Stock getStockBySymbol(String symbol);
    void updateStock(String stockSymbol,String type, int amount);

}
