package com.mongodb;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		get("/", (req, res) -> "Hello World!");
	}
}