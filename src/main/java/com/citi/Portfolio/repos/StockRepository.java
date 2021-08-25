package com.citi.Portfolio.repos;

import com.citi.Portfolio.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StockRepository extends JpaRepository<Stock, Integer> {
    public Iterable<Stock> findBySymbol( String symbol);
    public void deleteBySymbol( String symbol);
}
