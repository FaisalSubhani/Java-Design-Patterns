public class CommercialPlan implements Plan {

    public double getRate(){
        return rate;
    }
    @Override
    public double getRate(int units) {
        System.out.println("\nThe Commercial Plan Rate is : \n");
        return this.rate * units;
    }
}