package ru.sayakhov;


public class Main {

    public static void main(String[] args) {


        Baby baby1 = new Baby("Peter");

        Food banan = new Food("Banan", false);
        Food potato = new Food("Potato", true);
        Food wiskas = new Food("Wiskas",false);


        try{
            baby1.timeToEat(banan);
            baby1.timeToEat(potato);
            baby1.timeToEat(wiskas);
        }catch (RuntimeException ex){
            System.out.println("Ребенок это не ест");
            System.err.println("Ребенок это не ест - err обогнал out");
            ex.printStackTrace();
        }


    }
}
