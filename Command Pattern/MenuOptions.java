public class MenuOptions {
    private ActionCommand OrderCommand;
    private ActionCommand DriverCommand;

    private ActionCommand DeliveryCommand;

    private ActionCommand UndoRedoCommand;
    public MenuOptions(ActionCommand Order, ActionCommand Driver, ActionCommand Delivery, ActionCommand UndoRedo) {
        this.OrderCommand = Order;
        this.DriverCommand = Driver;
        this.DeliveryCommand = Delivery;
        this.UndoRedoCommand = UndoRedo;
    }

    public void clickOrder(){
        OrderCommand.execute();
    }
    public void clickDriver(){
        DriverCommand.execute();
    }
    public void clickDelivery(){
        DeliveryCommand.execute();
    }
    public void clickUndoRedo(){
        UndoRedoCommand.execute();
    }
}