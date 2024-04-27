package com.conversordemoedas.menu;

import java.util.Scanner;

import com.conversordemoedas.system.Data;

public class Menu {
    public static void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            String firstCoin;
            String secondCoin;

            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Real -> Dólar");
            System.out.println("2 - Dólar -> Real");
            System.out.println("3 - Peso Argentino -> Real");
            System.out.println("4 - Peso Argentino -> Dólar");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    firstCoin = "Real";
                    secondCoin = "Dólar";

                    processConversion("BRL", "USD", firstCoin, secondCoin);
                    break;

                case "2":
                    firstCoin = "Dólar";
                    secondCoin = "Real";

                    processConversion("USD", "BRL", firstCoin, secondCoin);
                    break;

                case "3":
                    firstCoin = "Peso Argentino";
                    secondCoin = "Real";

                    processConversion("ARS", "BRL", firstCoin, secondCoin);
                    break;

                case "4":
                    firstCoin = "Peso Argentino";
                    secondCoin = "Dólar";

                    processConversion("ARS", "USD", firstCoin, secondCoin);
                    break;

                default:
                    System.out.println("Escolha uma opção válida");
            }
        }
    }

    private static void processConversion(String originCurrency, String destinationCurrency, 
                                            String firstCoin, String secondCoin) {
        double value = Data.getData(originCurrency, destinationCurrency);
        double convertedValue = MenuValor.escolheValor(value);
        System.out.println("Valor convertido de " + firstCoin + " para " + secondCoin + " é: " + convertedValue);
    }
}
