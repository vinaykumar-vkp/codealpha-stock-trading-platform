package com.codealpha.stocktrading;

public class Stock {

    private String stockName;
    private double price;
    private int quantity;

    public Stock(String stockName, double price, int quantity) {
        this.stockName = stockName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getStockName() {
        return stockName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Stock Name : " + stockName);
        System.out.println("Price      : ₹" + price);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total      : ₹" + getTotalValue());
        System.out.println("----------------------------");
    }
}