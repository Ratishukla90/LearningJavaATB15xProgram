package Feb2026.ex_10022016;

public class OPPs_challange7 {

        public static void main(String[] args) {

            Employee1 e1 = new Manager(60000, 10000);
            Employee1 e2 = new Developer(50, 160);

            System.out.println("Manager Salary: " + e1.calculateSalary());
            System.out.println("Developer Salary: " + e2.calculateSalary());
        }
    }

    // Base Class
    class Employee1 {

        double calculateSalary() {
            return 0;
        }
    }

    // Manager Subclass
    class Manager extends Employee1 {

        private double baseSalary;
        private double bonus;

        Manager(double baseSalary, double bonus) {
            this.baseSalary = baseSalary;
            this.bonus = bonus;
        }

        @Override
        double calculateSalary() {
            return baseSalary + bonus;
        }
    }

    // Developer Subclass
    class Developer extends Employee1 {

        private double hourlyRate;
        private int hoursWorked;

        Developer(double hourlyRate, int hoursWorked) {
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        @Override
        double calculateSalary() {
            return hourlyRate * hoursWorked;
        }
    }


