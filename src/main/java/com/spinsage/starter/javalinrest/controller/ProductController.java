package com.spinsage.starter.javalinrest.controller;

import com.spinsage.starter.javalinrest.dao.ProductDao;
import com.spinsage.starter.javalinrest.model.Product;
import io.javalin.http.BadRequestResponse;
import io.javalin.http.Handler;

import java.util.List;

public class ProductController {

    private ProductDao productDao = ProductDao.instance();

    public Handler getById = ctx -> {
        Product product = productDao.getById(ctx.pathParam("id", Long.class).get());
        if (product != null) {
            ctx.json(product);
        } else {
            throw new BadRequestResponse("Not found");
        }
    };

    public Handler getAllProducts = ctx -> {
        List<Product> products = productDao.getAllProducts();
        ctx.json(products);
    };

    public Handler addProduct = ctx -> {
        Product product = ctx.bodyAsClass(Product.class);
        productDao.addProduct(product);
        ctx.json(product);
    };
}
