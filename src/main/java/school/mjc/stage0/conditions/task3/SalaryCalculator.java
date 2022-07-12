package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary >=0 && salary <= 10000){
            double newSalary = salary * 0.85;
            System.out.println(newSalary);
        }
        if (salary > 10000 && salary <= 20000){
            double newSalary = salary * 0.82;
            System.out.println(newSalary);
        }
        if (salary > 20000){
            double newSalary = salary * 0.8;
            System.out.println(newSalary);
        }
        if (salary < 0){
            System.out.println("wrong input!");
        }
    }
}
