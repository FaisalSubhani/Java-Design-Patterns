public class ShoppingCartFacade {
    private ProductCatalog catalog;
    private AuthenticationSystem authentication;
    private OrderProcessing order;

    private PaymentGateway payment;
    public ShoppingCartFacade() {
        catalog = new ProductCatalog();

        authentication = new AuthenticationSystem();
        order = new OrderProcessing();

        payment = new PaymentGateway();
    }

    public void ProductCatalog(){
        catalog.draw();
    }
    public void AuthenticationSystem(){
        authentication.draw();
    }
    public void OrderProcessing(){
        order.draw();
    }
    public void PaymentGateway(){
        payment.draw();
    }
}