package it.develhope.staticstuff;

public class Employee {
    public String name;
    public String surname;
    public String address;

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee details: name "+ name + ", surname: " + surname + ", address: " + address);
    }
}
