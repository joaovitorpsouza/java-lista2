package Lista2ex01;

public class Employee {
    
    private double salary;

    public Employee(double salary){
        this.salary = salary;
    }

    public void applyRaise(double pcRaise) {
        if (pcRaise < 0 || pcRaise > 25) {
            return;
        }

        this.salary = this.salary * (1 + (pcRaise/100));
    }

    public double getSalary() {
        return salary;        
    }
}
