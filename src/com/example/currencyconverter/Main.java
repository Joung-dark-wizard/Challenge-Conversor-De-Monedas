package com.example.currencyconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("*****************************************");
            System.out.println("1) Dólar (USD) ==> Peso argentino (ARS)");
            System.out.println("2) Peso argentino (ARS) ==> Dólar (USD)");
            System.out.println("3) Dólar (USD) ==> Real brasileño (BRL)");
            System.out.println("4) Real brasileño (BRL) ==> Dólar (USD)");
            System.out.println("5) Dólar (USD) ==> Peso colombiano (COP)");
            System.out.println("6) Peso colombiano (COP) ==> Dólar (USD)");
            System.out.println("7) Salir");
            System.out.println("Seleccione una opción:");
            System.out.println("*****************************************");
            int option = scanner.nextInt();

            String fromCurrency = "";
            String toCurrency = "";
            double amount = 0.0;

            switch (option) {
                case 1:
                    fromCurrency = "USD";
                    toCurrency = "ARS";
                    break;
                case 2:
                    fromCurrency = "ARS";
                    toCurrency = "USD";
                    break;
                case 3:
                    fromCurrency = "USD";
                    toCurrency = "BRL";
                    break;
                case 4:
                    fromCurrency = "BRL";
                    toCurrency = "USD";
                    break;
                case 5:
                    fromCurrency = "USD";
                    toCurrency = "COP";
                    break;
                case 6:
                    fromCurrency = "COP";
                    toCurrency = "USD";
                    break;
                case 7:
                    running = false;
                    System.out.println("Saliendo...");
                    continue;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    continue;
            }

            if (running) {
                System.out.println("Ingrese el monto a convertir: ");
                amount = scanner.nextDouble();

                // Instanciar el servicio y hacer la conversión
                ExchangeRateService exchangeRateService = new ExchangeRateService();
                CurrencyConverter converter = new CurrencyConverter(exchangeRateService);

                double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
                if (convertedAmount > 0) {
                    System.out.println("Monto convertido: " + convertedAmount + " " + toCurrency);
                } else {
                    System.out.println("Error en la conversión.");
                }
            }
        }

        scanner.close();
    }
}
