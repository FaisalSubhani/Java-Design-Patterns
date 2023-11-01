public class ActionUndoRedo implements ActionCommand{
    private Restaurant restu;
    public ActionUndoRedo(Restaurant restu) {
        this.restu = restu;
    }
    @Override

    public void execute() {
        restu.UndoRedo();
    }
}