package onor.food.flavor;

import onor.food.domain.flavor.Flavor;
import onor.food.domain.flavor.FoodFlavor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodFlavorTest {

    @Test
    public void symmetryCheck() {
        for(Flavor flavor1 : FoodFlavor.values()) {
            for(Flavor flavor2 : FoodFlavor.values()) {
                assertEquals(flavor1.isCompatibleWith(flavor2),
                        flavor2.isCompatibleWith(flavor1),
                        String.format("%s and %s", flavor1.getFlavorName(), flavor2.getFlavorName()));
            }
        }
    }
}
