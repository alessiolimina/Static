package it.develhope.staticstuff;


public class Tester {
    public static void main(String[] args) {
        System.out.println("--------------Starting-------------------");

        Employee employee1 = new Employee("Ale", "Lim", "Via Di Leo");
        Employee employee2 = new Employee("Fab", "Gig", "Via Lolli");

        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        badge1.showBadgeDetails();
        badge2.showBadgeDetails();

        System.out.println("-------------------------------------------");

    }



}

