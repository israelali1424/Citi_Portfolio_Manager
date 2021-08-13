package com.citi.Portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StockController {
    @RequestMapping(value = "/stocks")
    public String index() {
        return "index";
    }
}
