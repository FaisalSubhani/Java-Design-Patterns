public class Logger {
    private static Logger instance = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            System.out.println("NULL Returned form the instance");
            return null;
        }
        System.out.println("Instance Returned");
        return instance;
    }

    public static Logger showMessage() {
        System.out.println("Print call from Demo class");
        return null;
    }
}

