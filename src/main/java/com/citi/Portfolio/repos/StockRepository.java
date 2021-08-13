package com.citi.Portfolio.repos;

import com.citi.Portfolio.entities.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StockRepository extends CrudRepository<Stock, Integer> {
    public Iterable<Stock> findBySymbol(@Param("artist") String artist);
}
