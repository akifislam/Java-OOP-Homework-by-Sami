package Akif;

class Employee {
    String name;
    float salary;

    Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }
    void printSalary() {
        System.out.println("Salary of " + name +" is " + salary);
        System.out.println();
    }

}

class PlatinumEmployee extends Employee {

    PlatinumEmployee(String name, float salary) {
        super(name, salary);
    }

    void printSalary() {
        System.out.println("Platinum Employee Name : " +name);
        System.out.println("Bonus : " +(salary*.15));
        System.out.println("Total Salary with Bonus : "+ (salary+(salary*.15)));
        System.out.println();

    }
}

class SilverEmployee extends Employee {

    SilverEmployee(String name, float salary) {
        super(name, salary);
    }

    void printSalary() {
        System.out.println("Silver Employee Name : " +name);
        System.out.println("Bonus : " +(salary*.07));
        System.out.println("Total Salary with Bonus : "+ (salary+(salary*.07)));
        System.out.println();
    }
}
class EmployeeDemo {
    public static void main(String[] args) {

        Employee employee = new Employee("Akif Islam",100);
        employee.printSalary();

        SilverEmployee silverEmployee = new SilverEmployee("Saifur Rahman Sami",100);
        silverEmployee.printSalary();

        PlatinumEmployee platinumEmployee = new PlatinumEmployee("Riyadh Farhan Khan",100);
        platinumEmployee.printSalary();

    }
}

