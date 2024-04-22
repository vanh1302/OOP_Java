package employees;

public class Employee {
    protected int Id;
    protected String Name;
    protected int Age;
    protected String Department;
    protected String Code;
    protected double SalaryRate;

    public Employee(int Id, String Name, int Age, String Department, String Code, double SalaryRate) {
        this.Id = Id;
        this.Name = Name;
        this.Age = Age;
        this.Department = Department;
        this.Code = Code;
        this.SalaryRate = SalaryRate;
    }

    @Override
    public String toString() {
        return 
                "id=" + Id +
                ", name='" + Name + '\'' +
                ", age=" + Age +
                ", department='" + Department + '\'' +
                ", code='" + Code + '\'' +
                ", salaryRate=" + SalaryRate 
                ;
    }


    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getDepartment() {
        return Department;
    }

    public String getCode() {
        return Code;
    }

    public double getSalaryRate() {
        return SalaryRate;
    }

}
