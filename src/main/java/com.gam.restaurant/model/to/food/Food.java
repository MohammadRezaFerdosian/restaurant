package com.gam.restaurant.model.to.food;

public class Food {
    private long id;
    private long food_id;
    private long price;
    private String description;

    public static enum Type {
        APPETIZER,
        MAIN_COURCE
    }
    public static enum Cuisine{
        IRANIN,
        ARABIC,
        INDIAN;
    }
    public static enum Cook{
        Raw,
        MEDIUM,
        BAKE;
    }
}
