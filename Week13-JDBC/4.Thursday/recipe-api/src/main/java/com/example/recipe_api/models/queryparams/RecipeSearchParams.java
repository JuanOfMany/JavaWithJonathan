package com.example.recipe_api.models.queryparams;

public class RecipeSearchParams {
    private String name;
    private String instructions;
    private Integer minCookingTime;
    private Integer maxCookingTime;
    private Boolean isVegan;
    private Boolean isNutFree;
    private Boolean isGlutenFree;

    public RecipeSearchParams(){

    }

    public RecipeSearchParams(String name, String instructions, Integer minCookingTime, Integer maxCookingTime, Boolean isVegan, Boolean isNutFree, Boolean isGlutenFree) {
        this.name = name;
        this.instructions = instructions;
        this.minCookingTime = minCookingTime;
        this.maxCookingTime = maxCookingTime;
        this.isVegan = isVegan;
        this.isNutFree = isNutFree;
        this.isGlutenFree = isGlutenFree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Integer getMinCookingTime() {
        return minCookingTime;
    }

    public void setMinCookingTime(Integer minCookingTime) {
        this.minCookingTime = minCookingTime;
    }

    public Integer getMaxCookingTime() {
        return maxCookingTime;
    }

    public void setMaxCookingTime(Integer maxCookingTime) {
        this.maxCookingTime = maxCookingTime;
    }

    public Boolean getVegan() {
        return isVegan;
    }

    public void setVegan(Boolean vegan) {
        isVegan = vegan;
    }

    public Boolean getNutFree() {
        return isNutFree;
    }

    public void setNutFree(Boolean nutFree) {
        isNutFree = nutFree;
    }

    public Boolean getGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(Boolean glutenFree) {
        isGlutenFree = glutenFree;
    }
}
