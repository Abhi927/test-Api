package com.example.task.DTO;

import jakarta.validation.constraints.*;

public class ModelDTO {

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 3, max = 50)
    private String name;

    @NotBlank(message = "Description cannot be empty")
    @Size(max = 200)
    private String description;

    @Min(value = 1, message = "Price must be greater than 0")
    private double price;

    @NotNull(message = "Category cannot be null")
    private String category;

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
