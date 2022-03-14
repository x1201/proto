package com.example.demo.service;

import com.example.demo.Recipe;

public interface RecipeService {
	public Recipe getRecipeDetail(String id) throws Exception;
	public String getContents(String id)throws Exception;
	public String deleteRecipe(String id) throws Exception;
	public String insertRecipe(Recipe recipe) throws Exception;
}


