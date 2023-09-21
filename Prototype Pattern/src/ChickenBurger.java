public class ChickenBurger extends Burger {
    public ChickenBurger(){
        Name = "Burger2";
    }
    @Override
    public void draw() {
        System.out.println("Inside ChickenBurger::draw() method.");
    }
}