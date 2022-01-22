package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Recipe;
import com.example.demo.service.RecipeService;

@RestController

public class RecipeController {
	@Autowired
    RecipeService recipeService;
	@GetMapping("/getRecipeDetail")

    public Recipe getRecipeDetail(@RequestParam String id) throws Exception {
          return recipeService.getRecipeDetail(id);
    }
	@GetMapping("/getContents")
	public String getContens(@RequestParam String id)throws Exception{
		return recipeService.getContents(id);
	}
	
	
}
