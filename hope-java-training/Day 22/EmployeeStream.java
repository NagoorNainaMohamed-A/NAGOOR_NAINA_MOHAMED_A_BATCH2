import java.util.List;

class Employees {
    String name;
    String dept;
    int salary;
    int age;

    Employees(String name, String dept, int salary, int age) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + dept + " " + salary + " " + age;
    }
}

public class task {
    public static void main(String[] args) {

        List<Employees> emp = List.of(
                new Employees("Emp1", "Dev", 60000, 25),
                new Employees("Emp2", "HR", 40000, 30),
                new Employees("Emp3", "Dev", 80000, 28),
                new Employees("Emp4", "Support", 55000, 35),
                new Employees("Emp5", "Dev", 45000, 22));

        // 1. Filter by Department Dev
        List<Employees> devList = emp.stream().filter(e -> e.getDept().equals("Dev")).toList();
        System.out.println("Dev Employees: " + devList);

        // 2. Salary > 50k
        List<Employees> greatSalary = emp.stream().filter(e -> e.getSalary() > 50000).toList();
        System.out.println("Salary > 50k: " + greatSalary);

        // 3. Total Salary
        int sum = emp.stream().mapToInt(e -> e.getSalary()).sum();
        System.out.println("Total Salary: " + sum);

        // 4. Average Salary
        double avg = emp.stream().mapToInt(e -> e.getSalary()).average().orElse(0);
        System.out.println("Average Salary: " + avg);

        // 5. Employee count
        long count = emp.stream().count();
        System.out.println("Count: " + count);
    }
}