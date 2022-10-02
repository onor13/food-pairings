package onor.food.domain.taste;

import onor.food.domain.Ingredient;
import onor.food.domain.Pair;

import java.util.Arrays;
import java.util.Collection;

public class TastePairing {

   private static Collection<Pair<Taste>> balancingTastes = Arrays.asList(
           new Pair<>(Taste.UMAMI, Taste.BITTER),
           new Pair<>(Taste.BITTER, Taste.SWEET),
           new Pair<>(Taste.SWEET, Taste.SOUR),
           new Pair<>(Taste.SOUR, Taste.FAT),
           new Pair<>(Taste.FAT, Taste.SPICY));

   private static Collection<Pair<Taste>> complementaryTastes = Arrays.asList(
           new Pair<>(Taste.UMAMI, Taste.FAT),
           new Pair<>(Taste.UMAMI, Taste.SALTY),
           new Pair<>(Taste.SWEET, Taste.FAT),
           new Pair<>(Taste.SWEET, Taste.SPICY),
           new Pair<>(Taste.SWEET, Taste.SALTY),
           new Pair<>(Taste.SALTY, Taste.FAT),
           new Pair<>(Taste.SOUR, Taste.SPICY)

   );

   public boolean areCompatible(Ingredient ingredient1, Ingredient ingredient2) {
      return areBalancing(ingredient1.getTaste(), ingredient2.getTaste())
              || areComplementary(ingredient1.getTaste(), ingredient2.getTaste());
   }

   private boolean areBalancing(Taste taste1, Taste taste2) {
      return areInCollection(taste1, taste2, balancingTastes);
   }

   private boolean areComplementary(Taste taste1, Taste taste2) {
      return areInCollection(taste1, taste2, complementaryTastes);
   }

   private boolean areInCollection(Taste taste1, Taste taste2, Collection<Pair<Taste>> collection) {
      return collection.stream().filter(pair -> pair.contains(taste1, taste2)).findAny().isPresent();
   }

}
