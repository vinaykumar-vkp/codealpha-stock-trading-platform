package com.codealpha.stocktrading;

import java.util.ArrayList;

public class Portfolio {

    private ArrayList<Stock> stocks = new ArrayList<>();

    // Buy Stock
    public void buyStock(Stock stock) {
        stocks.add(stock);
        System.out.println("Stock Purchased Successfully!");
    }

    // View Portfolio
    public void viewPortfolio() {

        if (stocks.isEmpty()) {
            System.out.println("Portfolio is Empty.");
            return;
        }

        System.out.println("\n===== YOUR PORTFOLIO =====");

        for (Stock stock : stocks) {
            stock.display();
        }
    }

    // Calculate Total Portfolio Value
    public void showPortfolioValue() {

        double total = 0;

        for (Stock stock : stocks) {
            total += stock.getTotalValue();
        }

        System.out.println("Total Portfolio Value : ₹" + total);
    }
}