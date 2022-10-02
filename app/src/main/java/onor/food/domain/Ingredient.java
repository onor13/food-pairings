package onor.food.domain;

import onor.food.domain.taste.Taste;

public class Ingredient {

    private String name;
    private Taste taste = Taste.UNKNOWN;

    public String getName() {
        return name;
    }

    public Taste getTaste() {
        return taste;
    }
}
