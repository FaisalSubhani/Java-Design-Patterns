import java.util.Hashtable;
public class BurgerCache {
    private static Hashtable<String, Burger> burgerMap = new Hashtable<String, Burger>();
    public static Burger getBurger(String burgerName) {
        Burger cachedBurger = burgerMap.get(burgerName);
        return (Burger) cachedBurger.clone();

    }
    // for each shape run database query and create shape
// shapeMap.put(shapeKey, shape);
// for example, we are adding three shapes
    public static void loadCache() {
        Burger VegBurger = new VegBurger();
        VegBurger.setName("VegBurger1");
        burgerMap.put("Veg", VegBurger);

        Burger ChickenBurger = new ChickenBurger();
        ChickenBurger.setName("ChickenBurger1");
        burgerMap.put("Chick", ChickenBurger);

    }
}