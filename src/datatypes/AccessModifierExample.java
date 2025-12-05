package datatypes;

public class AccessModifierExample {
    public String name; // Public ACCESS
    private double salary; // Only accessible in this Class
    protected int age; // Accessible within class and package, can be used outside package only in case of inheritance
    String dept; // Default (package-private) access

    public double getSalary(){
        return salary;
    }
}

class Example{
    public static void main(String args[]){
        AccessModifierExample obj=new AccessModifierExample();
        obj.name = "Vedant";
//        obj.salary = 100000; //Not Accessible
        obj.getSalary();

        // Loops : for, do-while, while, for-each
        // Branching statements : break, continue, return
    }
}
