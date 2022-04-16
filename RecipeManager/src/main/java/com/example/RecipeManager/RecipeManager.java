package com.example.RecipeManager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecipeManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String recipe;
    private String ingredients;
    private String instructions;
    private String image;

    public RecipeManager() {
    }

    public RecipeManager(String name, String recipe, String ingredients, String instructions, String image) {
        this.name = name;
        this.recipe = recipe;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRecipe() {
        return recipe;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getImage() {
        return image;
    }
}
