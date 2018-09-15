package ru.sayakhov.Baby;


public class Main {

    public static void main(String[] args) {


        Baby baby1 = new Baby("Peter");

        Food banan = new Food("Banan", false);
        Food potato = new Food("Potato", true);
        Food wiskas = new Food("Wiskas",false);
        Food chocolate = new Food("Chocolate",true);


        try{
            baby1.timeToEat(chocolate);
            baby1.timeToEat(banan);
            baby1.timeToEat(potato);
            baby1.timeToEat(wiskas);
        }catch (CompatibilityException ex){
            System.out.println(ex.getMessage());

        }try{

            baby1.timeToEat(potato);
            baby1.timeToEat(wiskas);
        }catch (CompatibilityException ex){
            System.out.println(ex.getMessage());

        }finally {
            System.out.println("Спасибо мама, целую.");
        }


    }
}
