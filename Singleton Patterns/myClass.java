public class myClass2{

    private static myClass2 instance = null;

    private myClass2() {
    }
    public static myClass2 getInstance() {
        if (instance == null) {
            System.out.println("NULL Returned form the instance");
            return null;
        }
        System.out.println("Instance Returned");
        return instance;
    }

    public static void printMessage(String a) {

        System.out.println("The Message is : "+ a);
    }
}
