 public class CommandPatternClient {
 public static void main(String[] args) {
         Restaurant restu = new Restaurant();

         ActionCommand clickOrder = new ActionOrder(restu);
         ActionCommand clickDriver = new ActionDriver(restu);
         ActionCommand clickDelivery = new ActionDelivery(restu);
         ActionCommand clickUndoRedo = new ActionUndoRedo(restu);
         MenuOptions menu = new MenuOptions(clickOrder, clickDriver, clickDelivery, clickUndoRedo);

         menu.clickOrder();
         menu.clickDriver();
         menu.clickDelivery();
         menu.clickUndoRedo();
         }
 }