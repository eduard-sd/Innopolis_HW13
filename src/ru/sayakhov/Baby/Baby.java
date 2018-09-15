package ru.sayakhov.Baby;

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

    public void timeToEat(Food food) throws CompatibilityException {
        if(food.isCompatibility()) {
            System.out.println("Спасибо мама целую. Люблю "+food.getName());

        }else {
            //throw new RuntimeException();
            throw new CompatibilityException("Это не ем");
        }
    }
}
