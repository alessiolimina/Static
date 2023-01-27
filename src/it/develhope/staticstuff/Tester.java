package it.develhope.staticstuff;


public class Tester {
    public static void main(String[] args) {
        System.out.println("--------------Starting--------------------");

        Employee employee1 = new Employee("Ale", "Lim", "Via Di Leo");
        Badge badge1 = new Badge(employee1);
        badge1.showBadgeDetails();

        System.out.println("------------------------------------------");

        Employee employee2 = new Employee("Fab", "Gig", "Via Lolli");
        Badge badge2 = new Badge(employee2);
        badge2.showBadgeDetails();

        System.out.println("------------------------------------------");

    }



}

