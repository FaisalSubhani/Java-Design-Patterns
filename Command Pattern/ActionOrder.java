public class ActionOrder implements ActionCommand{
 private Restaurant restu;
 public ActionOrder(Restaurant restu) {
         this.restu = restu;
         }
 @Override

 public void execute() {
         restu.Order();
         }
 }