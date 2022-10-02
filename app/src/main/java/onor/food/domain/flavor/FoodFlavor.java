package onor.food.domain.flavor;

public enum FoodFlavor implements Flavor {
    FRUITY("fruity") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return false;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return false;
        }
    },
    BERRY("berry") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == FRUITY;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == FLORAL || flavor == SPICE;
        }
    },
    CITRUS("citrus") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == FRUITY;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == ALCOHOL || flavor == MEDICINAL
                    || flavor == MELON || flavor == SPICE
                    || flavor == SULPHUR || flavor == TREE_FRUIT
                    || flavor == WOOD || flavor == NUTTY;
        }
    },
    DRIED_FRUIT("dried fruit") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == FRUITY;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == MEATY || flavor == PHENOL;
        }
    },
    MELON("melon") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == FRUITY;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == CITRUS || flavor == FRUIT_LIKE
                    || flavor == GREEN || flavor == SULPHUR
                    || flavor == SAVORY;
        }
    },
    TREE_FRUIT("tree fruit") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == FRUITY;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == CITRUS || flavor == DAIRY
                    || flavor == FLORAL || flavor == FRUIT_LIKE
                    || flavor == PETROL || flavor == ROASTED
                    || flavor == SAVORY;
        }
    },
    TROPICAL("tropical") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == FRUITY;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == DAIRY || flavor == FLORAL
                    || flavor == SAVORY || flavor == SPICE
                    || flavor == WOOD;
        }
    },
    PHENOL("phenol") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return false;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == CHOCOLATE || flavor == DRIED_FRUIT || flavor == SMOKE;
        }
    },
    PUNGENT("pungent") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return false;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == FLORAL || flavor == SOUR;
        }
    },
    MAILLARD("maillard") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return false;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return false;
        }
    },
    CARAMEL("caramel") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == MAILLARD;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == ALCOHOL || flavor == FRUIT_LIKE || flavor == NUTTY
                    || flavor == SAVORY || flavor == SPICE;
        }
    },
    CHOCOLATE("chocolate") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == MAILLARD;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == ALCOHOL || flavor == DAIRY || flavor == EARTHY || flavor == FRUIT_LIKE
                    || flavor == MEATY || flavor == NUTTY || flavor == PHENOL;
        }
    },
    MEATY("meaty") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == MAILLARD;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == ALCOHOL || flavor == CHOCOLATE || flavor == DRIED_FRUIT || flavor == EARTHY
                    || flavor == FRUIT_LIKE || flavor == SAVORY || flavor == SMOKE;
        }
    },
    NUTTY("nutty") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == MAILLARD;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == CARAMEL || flavor == CHOCOLATE || flavor == FRUIT_LIKE
                    || flavor == SULPHUR || flavor == WOOD || flavor == CITRUS;
        }
    },
    ROASTED("roasted") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == MAILLARD;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == FRUIT_LIKE || flavor == MARINE || flavor == PETROL
                    || flavor == SULPHUR || flavor == TREE_FRUIT;
        }
    },
    TOASTED("toasted") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == MAILLARD;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == DAIRY || flavor == FRUIT_LIKE;
        }
    },
    TERPENE("terpene") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return false;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return false;
        }
    },
    MEDICINAL("medicinal") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == TERPENE;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == CITRUS || flavor == GREEN || flavor == HERBACEOUS || flavor == SOUR;
        }
    },
    SPICE("spice") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == TERPENE;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == BERRY || flavor == CARAMEL || flavor == CITRUS
                    || flavor == SMOKE || flavor == TROPICAL || flavor == WOOD;
        }
    },
    SMOKE("smoke") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == TERPENE;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == MEATY || flavor == PHENOL || flavor == SOUR || flavor == SPICE;
        }
    },
    PETROL("petrol") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == TERPENE;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == ROASTED || flavor == TREE_FRUIT;
        }
    },
    WOOD("wood") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == TERPENE;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == CITRUS || flavor == HERBACEOUS
                    || flavor == NUTTY || flavor == SPICE || flavor == TROPICAL;
        }
    },
    MARINE("marine") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return false;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == ROASTED || flavor == SAVORY || flavor == SOUR;
        }
    },
    SOUR("sour") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return false;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == MARINE || flavor == MEDICINAL || flavor == PUNGENT || flavor == SMOKE;
        }
    },
    SAVORY("savory") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return false;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == ALCOHOL || flavor == CARAMEL || flavor == MARINE || flavor == MELON
                    || flavor == MEATY || flavor == TREE_FRUIT || flavor == TROPICAL;
        }
    },
    VEGETAL("vegetal") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return false;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return false;
        }
    },
    EARTHY("earthy") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == VEGETAL;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == CHOCOLATE || flavor == DAIRY || flavor == FLORAL || flavor == MEATY;
        }
    },
    FRUIT_LIKE("fruit like") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == VEGETAL;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == CARAMEL || flavor == CHOCOLATE || flavor == MEATY || flavor == MELON
                    || flavor == NUTTY || flavor == ROASTED || flavor == TOASTED || flavor == TREE_FRUIT;
        }
    },
    GREEN("green") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == VEGETAL;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == MEDICINAL || flavor == MELON || flavor == HERBACEOUS;
        }
    },
    HERBACEOUS("herbaceous") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return flavor == VEGETAL;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == GREEN || flavor == MEDICINAL || flavor == WOOD;
        }
    },
    ALCOHOL("alcohol") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return false;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == CARAMEL || flavor == CHOCOLATE || flavor == CITRUS
                    || flavor == DAIRY || flavor == MEATY || flavor == SAVORY;
        }
    },
    SULPHUR("sulphur") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return false;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == CITRUS || flavor == MELON || flavor == NUTTY || flavor == ROASTED;
        }
    },
    DAIRY("dairy") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return false;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == ALCOHOL || flavor == CHOCOLATE || flavor == EARTHY || flavor == FLORAL
                    || flavor == TREE_FRUIT || flavor == TROPICAL || flavor == TOASTED;
        }
    },
    FLORAL("floral") {
        @Override
        public boolean isSubFlavorOf(Flavor flavor) {
            return false;
        }

        @Override
        public boolean isCompatibleWith(Flavor flavor) {
            return flavor == BERRY || flavor == DAIRY || flavor == EARTHY || flavor == PUNGENT
                    || flavor == TREE_FRUIT || flavor == TROPICAL;
        }
    };

    private final String flavorName;

    FoodFlavor(String flavorName) {
        this.flavorName = flavorName;
    }

    @Override
    public String getFlavorName() {
        return flavorName;
    }
}
