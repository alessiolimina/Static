package it.develhope.staticstuff;


public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;
    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees += 1;
        }
    private String generateBadgeIdCode(){
        return "ZXY" + employee.name + employee.surname + "YXZ";
    }
    public void showBadgeDetails(){
        System.out.println("Total number of employees: " + totalNumberOfEmployees);//the total number of employee tracked by the badges
        employee.getEmployeeDetails();
        System.out.println("Badge id code " + badgeIdCode);//the badgeIdCode
    }
    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }

}
