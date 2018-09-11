package ru.sayakhov;

public class Food {
    private String name;
    private boolean compatibility;

    public Food(String name, boolean compatibility) {
        this.name = name;
        this.compatibility = compatibility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompatibility() {
        return compatibility;
    }

    public void setCompatibility(boolean compatibility) {
        this.compatibility = compatibility;
    }
}
