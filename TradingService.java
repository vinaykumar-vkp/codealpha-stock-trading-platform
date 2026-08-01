package com.codealpha.stocktrading;

import java.util.Scanner;

public class TradingService {

    private Portfolio portfolio = new Portfolio();
    private Scanner scanner = new Scanner(System.in);

    public void start() {

        while (true) {

            System.out.println("\n====== STOCK TRADING PLATFORM ======");
            System.out.println("1. Buy Stock");
            System.out.println("2. View Portfolio");
            System.out.println("3. Show Portfolio Value");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    scanner.nextLine();

                    System.out.print("Enter Stock Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Stock Price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();

                    portfolio.buyStock(new Stock(name, price, quantity));

                    break;

                case 2:
                    portfolio.viewPortfolio();
                    break;

                case 3:
                    portfolio.showPortfolioValue();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}