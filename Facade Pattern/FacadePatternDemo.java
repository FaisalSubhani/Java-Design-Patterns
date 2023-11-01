public class FacadePatternDemo {
    public static void main(String[] args) {
        ShoppingCartFacade shapeMaker = new ShoppingCartFacade();

        shapeMaker.ProductCatalog();
        shapeMaker.AuthenticationSystem();
        shapeMaker.OrderProcessing();
        shapeMaker.PaymentGateway();
    }
}