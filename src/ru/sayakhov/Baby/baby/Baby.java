package ru.sayakhov.Baby.baby;

import ru.sayakhov.Baby.exceptions.CompatibilityException;
import ru.sayakhov.Baby.food.Food;

public class Baby {
    private String name;


    public Baby(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Food food) throws CompatibilityException {
        if(food.getName().length() > 3) {
            System.out.println("Ам ам вкусно "+food.getName());

        }else {
            throw new CompatibilityException("Это не ем");
        }
    }
}
