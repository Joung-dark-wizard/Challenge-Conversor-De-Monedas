package com.example.currencyconverter;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateService {
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/";

    public double getExchangeRate(String fromCurrency, String toCurrency) {
        try {
            // Construir la URL completa
            String url = API_URL + fromCurrency;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parsear la respuesta de la API
            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

            // Verificar si la respuesta es válida
            if (!jsonObject.has("rates")) {
                System.out.println("Error: No se encontraron tasas de cambio para " + fromCurrency);
                return 0.0;
            }

            // Obtener las tasas de cambio
            JsonObject rates = jsonObject.getAsJsonObject("rates");

            // Verificar si el campo de la moneda destino existe
            if (!rates.has(toCurrency)) {
                System.out.println("Error: No se encontró la tasa de cambio para " + toCurrency);
                return 0.0;
            }

            // Retornar la tasa de cambio
            return rates.get(toCurrency).getAsDouble();
        } catch (Exception e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
            return 0.0;
        }
    }
}
