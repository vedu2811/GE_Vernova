package employeeWage;

public class Employee {
    int dailyAttendance;
    int workPerDay=8;
    int halfDay=4;
    int hourlyPay=20;
    int dailySalary = 0;
    int monthlyWage=0;
    int workingDays=20;
    int workingHours = 100;
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
    public void dailyWage(){
        switch(dailyAttendance){
            case 1:
                dailySalary=halfDay*hourlyPay;
                System.out.println(dailySalary);
                break;
            case 2:
                dailySalary=workPerDay*hourlyPay;
                System.out.println(dailySalary);
                break;
            default:
                System.out.println("No Pay");
                break;
        }
    }
    public void monthlyWage(){
        int workingHoursNew=0;
        if(dailyAttendance==1){
            workingHoursNew=4*20;
        }else if(dailyAttendance==2){
            workingHoursNew=8*20;
        }else if(dailyAttendance==0){
            workingHoursNew=0;
        }
        monthlyWage=workingHoursNew>workingHours ? workingHours*hourlyPay : workingDays*dailySalary;
        System.out.println(monthlyWage);
    }
}
