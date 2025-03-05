package pkgs.servers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BasicServer {
    private final int port;

    public BasicServer(int port) {
        this.port = port;
    }

    public void init() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port);
            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

                    System.out.println("Client connected: " + clientSocket.getInetAddress());

                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        System.out.println("Received: " + inputLine);
                        if (inputLine.isEmpty()) break;
                    }

                    String template = """
                            <!DOCTYPE html />
                            <html lang="en">
                                <head>
                                    <title>Java Sandbox</title>
                                    <meta charset="UTF-8">
                                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                                    <style>
                                        * {
                                            margin: 0;
                                            padding: 0;
                                        }
                                        body {
                                            width: 100%;
                                            height: 100vh;
                                            min-height: 800px;
                                        }
                                        .header-container {
                                            display: flex;
                                            align-items: center;
                                            justify-content: center;
                                            height: 300px;
                                        }
                                        .header {
                                            font-size: 5rem;
                                            color: blue;
                                        }
                                        .content-container {
                                            display: flex;
                                            align-items: center;
                                            justify-content: center;
                                            height: 300px;
                                        }
                                        .description {
                                            font-size: 1rem;
                                            color: green;
                                        }
                                        .footer-container {
                                            display: flex;
                                            align-items: center;
                                            justify-content: center;
                                            height: 50px;
                                        }
                                        .legal {
                                            font-size: 1rem;
                                            color: grey;
                                        }
                                    </style>
                                </head>
                                <body>
                                    <header class="header-container">
                                        <h1 class="header">Java Sandbox</h1>
                                    </header>
                                    <section class="content-container">
                                        <p class="description">This web page has be served to you from the Java Sandbox server</p>
                                    </section>
                                    <footer class="footer-container">
                                        <p class="legal">All rights reserved to Java Sandbox</p>
                                    </footer>
                                </body>
                            </html>
                            """;

                    out.println("HTTP/1.1 200 OK");
                    out.println("Content-Type: text/html");
                    out.println("Content-Length: " + template.length());
                    out.println();
                    out.println(template);

                } catch (IOException e) {
                    System.err.println("Error handling client: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.err.println("Could not start server: " + e.getMessage());
        }
    }
}

