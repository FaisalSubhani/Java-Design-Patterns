public class ActionDelivery implements ActionCommand{
    private Restaurant restu;
    public ActionDelivery(Restaurant restu) {
        this.restu = restu;
    }
    @Override

    public void execute() {
        restu.Delivery();
    }
}