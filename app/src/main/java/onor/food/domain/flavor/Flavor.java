package onor.food.domain.flavor;

public interface Flavor {

    String getFlavorName();
    boolean isSubFlavorOf(Flavor flavor);
    boolean isCompatibleWith(Flavor flavor);

}
