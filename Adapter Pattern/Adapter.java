public class Adapter implements Laptop {
    AdvanceLaptop advacneConnector;

    public Adapter(String connectortype) {
        if (connectortype.equalsIgnoreCase("Type-c")) {
            advacneConnector = new TypeC();
        }
    }
        @Override
        public void TypeAConnect (String connectortype){
        if(connectortype.equalsIgnoreCase("Type-c")){
            advacneConnector.TypeCConnect(connectortype);
        }
        }
    }

