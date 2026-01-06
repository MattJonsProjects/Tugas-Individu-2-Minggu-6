abstract class Employee {
    protected String name;

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 5000000;
    }
}

class PartTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 2000000;
    }
}
