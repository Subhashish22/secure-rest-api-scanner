package com.subhashish.scanner;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try {
            // Step 1: Get URL
            String url = getUserUrl();

            // Step 2: Create HTTP Client
            HttpClient client = createClient();

            // Step 3: Create Request
            HttpRequest request = createRequest(url);

            // Step 4: Send Request
            HttpResponse<String> response = sendRequest(client, request);

            // Step 5: Print Response
            printResponse(response);

        } catch (Exception e) {
            handleError(e);
        }
    }

    // Get URL from user
    public static String getUserUrl() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter URL: ");

        return scanner.nextLine();
    }

    // Create HTTP Client
    public static HttpClient createClient() {

        return HttpClient.newHttpClient();
    }

    // Create HTTP Request
    public static HttpRequest createRequest(String url) {

        return HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
    }

    // Send HTTP Request
    public static HttpResponse<String> sendRequest(
            HttpClient client,
            HttpRequest request) throws Exception {

        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    // Print Response
    public static void printResponse(HttpResponse<String> response) {

        System.out.println("\n========== RESPONSE ==========");
        System.out.println("Status Code : " + response.statusCode());
        System.out.println();
        System.out.println(response.body());
    }

    // Handle Errors
    public static void handleError(Exception e) {

        System.out.println("Something went wrong!");
        e.printStackTrace();
    }
}