package datatypes;


public class DataTypesExample {
    // INSTANCE VARIABLES (can be used without initialization)
        byte byteValue;
        short shortValue;
        int intValue;
        long longValue;
        float floatValue;
        double doubleValue;
        char charValue;
        boolean booleanValue;
        static final int age=25;      // STATIC VARIABLES
    public static void main(String args[]){
        DataTypesExample dte =new DataTypesExample();   // REFERENCE VARIABLE [REF. TO CLASS (Object Creation)]
        DataTypesExample obj2 = new DataTypesExample();
        System.out.println("Data types in java and its default values:");

        String name="XYZ";    // LOCAL VARIABLE (can not use this without initialization)
        System.out.println("Name "+name);
        System.out.println("Byte: "+dte.byteValue);
        System.out.println(dte.shortValue);
        System.out.println(dte.intValue);
        System.out.println(dte.longValue);
        System.out.println(dte.floatValue);
        System.out.println(dte.doubleValue);
        System.out.println(dte.charValue);
        System.out.println(dte.booleanValue);
    }
}
