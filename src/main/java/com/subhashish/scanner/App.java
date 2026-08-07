package com.subhashish.scanner;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try {

            // Step 1: Get HTTP Method
            String method = getHttpMethod();

            // Step 2: Get URL
            String url = getUserUrl();

            // Step 3: Get JSON Body (Only for POST and PUT)
            String requestBody = "";

            if (method.equals("POST") || method.equals("PUT")) {
                requestBody = getRequestBody();
            }

            // Step 4: Create HTTP Client
            HttpClient client = createClient();

            // Step 5: Create HTTP Request
            HttpRequest request = createRequest(url, method, requestBody);

            // Step 6: Send HTTP Request
            HttpResponse<String> response = sendRequest(client, request);

            // Step 7: Print Response
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

    // Get JSON Body
    public static String getRequestBody() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter JSON Body: ");

        return scanner.nextLine();
    }

    // Create HTTP Client
    public static HttpClient createClient() {

        return HttpClient.newHttpClient();
    }

    // Create HTTP Request
    public static HttpRequest createRequest(String url, String method, String requestBody) {

        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .uri(URI.create(url));

        if (method.equals("GET")) {

            return builder.GET().build();

        } else if (method.equals("POST")) {

    return builder
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString(requestBody))
            .build();

} else if (method.equals("PUT")) {

    return builder
            .header("Content-Type", "application/json")
            .PUT(HttpRequest.BodyPublishers.ofString(requestBody))
            .build();

} else {

    System.out.println(method + " will be implemented later.");
    return builder.GET().build();
}
    }

    // Send HTTP Request
    public static HttpResponse<String> sendRequest(
            HttpClient client,
            HttpRequest request) throws Exception {

        return client.send(request,
                HttpResponse.BodyHandlers.ofString());
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

    // Get HTTP Method
    public static String getHttpMethod() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose HTTP Method:");
        System.out.println("1. GET");
        System.out.println("2. POST");
        System.out.println("3. PUT");
        System.out.println("4. DELETE");

        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                return "GET";

            case 2:
                return "POST";

            case 3:
                return "PUT";

            case 4:
                return "DELETE";

            default:
                System.out.println("Invalid choice. Using GET.");
                return "GET";
        }
    }
}