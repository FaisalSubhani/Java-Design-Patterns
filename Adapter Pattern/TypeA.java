public class TypeA implements Laptop {
    Adapter typeCAdapter;

    @Override
    public void TypeAConnect(String usbTypeA) {
        if (usbTypeA.equalsIgnoreCase("Type-a")) {
            System.out.println("Connecting Connector typeA. Name : " + usbTypeA);
        } else if (usbTypeA.equalsIgnoreCase("Type-c")) {
            typeCAdapter = new Adapter(usbTypeA);
            typeCAdapter.TypeAConnect(usbTypeA);
        }
    }
}
