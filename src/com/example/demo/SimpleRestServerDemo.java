package com.example.demo;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleRestServerDemo {

	public static void main(String[] args) throws IOException {
	
		HttpServer server = HttpServer.create(new InetSocketAddress(9091), 0);
		System.out.println("Server started on port 9090");
		
		// REST API Path
		server.createContext("/api/people", new PeopleHandler());
		
		server.setExecutor(null);
		server.start();

	}
	
	static class PeopleHandler implements HttpHandler {

		@Override
		public void handle(HttpExchange exchange) throws IOException {
			
			if("GET".equals(exchange.getRequestMethod())) {
				String response = "This is the people listing";
				
				// Send to client
				exchange.sendResponseHeaders(200, response.getBytes().length);
				
				OutputStream os = exchange.getResponseBody();
				os.write(response.getBytes());
				os.close();
			}
			
		}
		
	}

}
