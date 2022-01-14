package com.spinsage.starter.javalinrest;

import com.spinsage.starter.javalinrest.controller.ProductController;
import io.javalin.Javalin;

public class RestApi {
    public static void main(String[] args) {
        ProductController productController = new ProductController();

        int port = System.getenv("SERVER_PORT") != null? Integer.parseInt(System.getenv("SERVER_PORT")) : 8080;
        Javalin app = Javalin.create().start(port);
        app.get("/product", productController.getAllProducts);
        app.get("/product/:id", productController.getById);
        app.post("/product", productController.addProduct);
    }
}
