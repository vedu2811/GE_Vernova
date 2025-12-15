package employeeWage;

public class Employee {
    int dailyAttendance;
    int workPerDay=8;
    int halfDay=4;
//    int hourlyPay=20;
    int dailySalary = 0;
    int monthlyWage=0;
//    int workingDays=20;
//    int workingHours = 100;
    public void calculateAttendance(){
        if(((Math.random()*100)%3)==0){
            dailyAttendance=0;
            System.out.println("Absent");
        }else if(((Math.random()*100)%3)==1){
            dailyAttendance=1;
            System.out.println("Part Time");
        }else{
            dailyAttendance=2;
            System.out.println("Present");
        }
    }
    public void dailyWage(String company,int hourlyPay, int workingDays, int workingHours) {
        int workingHoursNew = 0;
        switch (dailyAttendance) {
            case 1:
                dailySalary = halfDay * hourlyPay;
                workingHoursNew = 4 * 20;
//                System.out.println(dailySalary);
                break;
            case 2:
                dailySalary = workPerDay * hourlyPay;
                workingHoursNew = 8 * 20;
//                System.out.println(dailySalary);
                break;
            default:
//                System.out.println("No Pay");
                workingHoursNew = 0;
                break;
        }
        monthlyWage = workingHoursNew > workingHours ? workingHours * hourlyPay : workingDays * dailySalary;
        System.out.println("Company: "+ company+", Daily Salary: "+dailySalary+", Monthly wage: "+monthlyWage);
    }
}
