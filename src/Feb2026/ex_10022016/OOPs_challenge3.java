package Feb2026.ex_10022016;

public class OOPs_challenge3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(1);
        e.setName("John Doe");
        e.setSalary(50000);
        // Getting values using getters
        System.out.println("Employee ID: " + e.getId());
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Employee Salary: " + e.getSalary());

    }
}

    class Employee {
        private String name;
        private int id;
        private int salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

}