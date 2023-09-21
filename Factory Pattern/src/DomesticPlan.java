public class DomesticPlan implements Plan {


    @Override
    public double getRate(int units) {
        System.out.println("\nThe Domestic Plan Rate is : \n");
        return this.rate * units;
    }
}