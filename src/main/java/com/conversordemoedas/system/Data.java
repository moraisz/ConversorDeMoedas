package com.conversordemoedas.system;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Data {
    public static double compare(String c1, String c2) {
        String json = Connection.connect(c1, c2);
        Gson gson = new Gson();

        // Convertendo o JSON em um objeto Java
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

        // Acessando o valor de conversão para o USD
        double conversionRate = jsonObject.get("conversion_rate").getAsDouble();

        // Imprimindo o valor de conversão para o USD
        return conversionRate;
    }
}