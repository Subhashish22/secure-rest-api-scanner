package com.subhashish.scanner;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("=================================");
        System.out.println(" Secure REST API Scanner");
        System.out.println(" Version 0.1");
        System.out.println(" Developed by Subhashish");
        System.out.println("=================================");

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com"))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code: " + response.statusCode());
        System.out.println(response.body());
    }  
}