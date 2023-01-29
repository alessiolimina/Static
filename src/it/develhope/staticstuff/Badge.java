package it.develhope.staticstuff;


import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees += 1;}

    private String generateBadgeIdCode(){
        Random random = new Random();
        String[] randomLetters = {"A","B","C", "D", "E", "F", "G", "H", "I" , "L", "N", "O", "P" , "Q" , "R" , "S" , "T" , "U" , "V" , "W" , "X" , "Y" , "Z"};
        return randomLetters[random.nextInt(randomLetters.length)] + employee.name + employee.surname + randomLetters[random.nextInt(randomLetters.length)];
    }

    public void showBadgeDetails(){
        System.out.println("Total number of employees: " + totalNumberOfEmployees);
        employee.getEmployeeDetails();
        System.out.println("Badge id code " + badgeIdCode);}

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();}

}
