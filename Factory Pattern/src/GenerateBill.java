public class GenerateBill {
    public static void main(String[] args) {
        GetPlanFactory getplanFactory = new GetPlanFactory();

//get an object of Circle and call its draw method.
        Plan shape1 = getplanFactory.getPlan("DOMESTIC PLAN");
//call draw method of Circle
        System.out.print(shape1.getRate(1));
        Plan shape2 = getplanFactory.getPlan("COMMERCIAL PLAN");
//call draw method of Circle
        System.out.print(shape2.getRate(2));
//get an object of Square and call its draw method.
        Plan shape3 = getplanFactory.getPlan("INSTITUTIONAL PLAN");
//call draw method of circle
        System.out.print(shape3.getRate(3));
    }
}