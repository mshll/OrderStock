package com.meshal.orderstock.controller;

import com.meshal.orderstock.bo.CreateStockRequest;
import com.meshal.orderstock.bo.UpdateStockResponse;
import com.meshal.orderstock.service.StockService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {
    private final StockService stockService;

    public OrderController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping("/orders")
    public UpdateStockResponse doOrder(@RequestBody CreateStockRequest customerOrder) {

        UpdateStockResponse response = stockService.updateStock(customerOrder);
        return response;
    }
}