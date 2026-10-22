package com.example.smartpantrymanager.model;
import com.google.gson.annotations.SerializedName;
public class RecipeIngredient {
    private Long id;
    @SerializedName("recipe_id")
    private Long recipeId;
    @SerializedName("ingredient_name")
    private String ingredientName;
    private double quantity;
    private String unit;

    public Long getId() { return id; }
    public Long getRecipeId() { return recipeId; }
    public String getIngredientName() { return ingredientName; }
    public double getQuantity() { return quantity; }
    public String getUnit() { return unit; }
}
