public class PrototypeBurgerDemo {
    public static void main(String[] args) {
        BurgerCache.loadCache();
        Burger clonedBurger1 = (Burger) BurgerCache.getBurger("Veg");
        System.out.println("Burger Name is : " + clonedBurger1.getName());
        Burger clonedBurger2 = (Burger) BurgerCache.getBurger("Chick");
        System.out.println("Burger Name is : " + clonedBurger2.getName());
    }
}