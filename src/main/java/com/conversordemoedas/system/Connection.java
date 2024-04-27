package com.conversordemoedas.system;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connection {
    public static String connect(String c1, String c2) {
        try{
            // URL da Api com variáveis
            String url = "https://v6.exchangerate-api.com/v6/45c2293a35e073f4061bec71/pair/"+c1+"/"+c2;
    
            // Criação da conexão
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            
            // Configuração da requisição
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
    
            // Leitura da resposta
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String linha;
            StringBuilder resposta = new StringBuilder();
    
            while ((linha = reader.readLine()) != null) {
                resposta.append(linha);
            }
            reader.close();
    
            // Fechamento da conexão
            connection.disconnect();

            // Retorna a resposta
            return resposta.toString();
            
        }catch (Exception e) {
            e.printStackTrace();
            return null; // Retorno em caso de erro
        }
    }
}
