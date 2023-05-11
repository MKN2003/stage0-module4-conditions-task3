package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(float salary) {
        if (salary > 0) {
            if (salary <= 10000) {
                salary = salary - (salary * 15 / 100);
                System.out.println(salary);
            }
            if (salary > 10000 && salary <= 20000) {
                salary = salary - (salary * 18 / 100);
                System.out.println(salary);
            }
            if (salary > 20000) {
                salary = salary - (salary * 20 / 100);
                System.out.println(salary);
            }
        }
        else
            System.out.println("wrong input!");
    }
}
