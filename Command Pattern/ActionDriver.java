public class ActionDriver implements ActionCommand{
    private Restaurant restu;
    public ActionDriver(Restaurant restu) {
        this.restu = restu;
    }
    @Override

    public void execute() {
        restu.Driver();
    }
}