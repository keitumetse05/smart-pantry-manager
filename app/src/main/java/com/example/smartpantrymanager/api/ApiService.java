package com.example.smartpantrymanager.api;

import com.example.smartpantrymanager.model.PantryItem;
import com.example.smartpantrymanager.model.Recipe;
import com.example.smartpantrymanager.model.RecipeIngredient;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    // READ
    @GET("pantry_items?order=name.asc")
    Call<List<PantryItem>> getPantryItems();

    @GET("recipes?order=id.asc")
    Call<List<Recipe>> getRecipes();

    @GET("recipe_ingredients")
    Call<List<RecipeIngredient>> getRecipeIngredients();

    // CREATE
    @POST("pantry_items")
    Call<List<PantryItem>> addPantryItem(@Body PantryItem item);

    // UPDATE (idFilter looks like "eq.5")
    @PATCH("pantry_items")
    Call<List<PantryItem>> updatePantryItem(@Query("id") String idFilter, @Body PantryItem item);

    // DELETE
    @DELETE("pantry_items")
    Call<Void> deletePantryItem(@Query("id") String idFilter);
}