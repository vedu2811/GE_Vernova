package employeeWage;

public class Main {
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.calculateAttendance();
        e1.dailyWage("GE Vernova", 300,20,800);
        e1.dailyWage("Flipkart", 200,22,820);
    }
}
