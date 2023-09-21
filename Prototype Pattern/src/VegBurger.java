import jdk.jfr.Description;

public class VegBurger extends Burger {
    public VegBurger(){
        Name = "Burger1";
        Description="Vegetable Burger";
    }

    @Override
    public void draw() {
        System.out.println("Inside VegBurger::draw() method.");
    }
}