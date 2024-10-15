package com.example.currencyconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la moneda de origen (por ejemplo, USD): ");
        String fromCurrency = scanner.nextLine();

        System.out.println("Ingrese la moneda de destino (por ejemplo, CRC): ");
        String toCurrency = scanner.nextLine();

        System.out.println("Ingrese el monto a convertir: ");
        double amount = scanner.nextDouble();

        // Instanciar el servicio y hacer la conversión
        ExchangeRateService exchangeRateService = new ExchangeRateService();
        CurrencyConverter converter = new CurrencyConverter(exchangeRateService);

        double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
        System.out.println("Monto convertido: " + convertedAmount);
    }
}

