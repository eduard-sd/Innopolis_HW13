package ru.sayakhov.Baby;


import ru.sayakhov.Baby.baby.Baby;
import ru.sayakhov.Baby.exceptions.CompatibilityException;
import ru.sayakhov.Baby.food.Food;

public class Main {

    public static void main(String[] args) {


        Baby baby1 = new Baby("Peter");

        Food banan = new Food("Banan");
        Food potato = new Food("Potato");
        Food wiskas = new Food("Wi");
        Food chocolate = new Food("Chocolate");


        try {
            baby1.eat(chocolate);
            baby1.eat(banan);
            baby1.eat(potato);
            baby1.eat(wiskas);
        } catch (CompatibilityException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Спасибо мама, целую.");
        }

        try {

            baby1.eat(potato);
            baby1.eat(wiskas);
        } catch (CompatibilityException ex) {
            System.out.println(ex.getMessage());

        } finally {
            System.out.println("Спасибо мама, целую.");
        }


    }
}
