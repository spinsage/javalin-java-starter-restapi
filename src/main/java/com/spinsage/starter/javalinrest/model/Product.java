package com.spinsage.starter.javalinrest.model;

public class Product {
    private Long id;
    private String name;
    private String description;
    private Double amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public static class ProductBuilder {
        private Product product;

        public ProductBuilder() {
            product = new Product();
        }

        public ProductBuilder amount(Double amount) {
            product.setAmount(amount);
            return this;
        }

        public ProductBuilder id(Long id) {
            product.setId(id);
            return this;
        }

        public ProductBuilder name(String name) {
            product.setName(name);
            return this;
        }

        public ProductBuilder description(String description) {
            product.setDescription(description);
            return this;
        }

        public Product build() {
            return product;
        }
    }
}
