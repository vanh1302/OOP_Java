package employees;

import java.util.Scanner;

public class Main{
    
    static Scanner s = new Scanner(System.in);

    static int ch;

    static int Id ;
    static String Name;
    static int Age ;
    static String Department ;
    static String Code ;
    static double SalaryRate ;

    public static void main(String[] args){
        EmployeeManager manager = new EmployeeManager();
        
        manager.addEmployee(new Employee(1, "Vanh", 20, "IT", "IT00", 1));
        manager.addEmployee(new Employee(2, "Nguyen", 22, "BA", "BA00", 1));
        manager.addEmployee(new Employee(3, "Kien", 21, "IT", "IT00", 1));
        manager.addEmployee(new Employee(4, "Huy", 30, "BA", "BA00", 1));
        manager.addEmployee(new Employee(5, "Bao", 20, "IT", "IT00", 1));
        manager.addEmployee(new Employee(6, "Khanh", 22, "BA", "BA00", 1));
        manager.addEmployee(new Employee(7, "Hieu", 20, "IT", "IT00", 1));
        manager.addEmployee(new Employee(8, "Minh", 22, "BA", "BA00", 1));
        manager.addEmployee(new Employee(9, "Tra", 20, "IT", "IT00", 1));
        manager.addEmployee(new Employee(10, "Giang", 22, "BA", "BA00", 1));

  
        do{
            System.out.println("1.Insert Employee");
            System.out.println("2.Show list of Employees ");
            System.out.println("3.Delete Employee");
            System.out.print("Enter your choice: ");
            ch = s.nextInt();

            switch (ch) {
                case 1 : 
                    EnterDetailEmployeeToAdd();

                    manager.addEmployee(new Employee(Id, Name, Age, Department, Code, SalaryRate));
                break;

                case 2: 
                    System.out.println("List Employee");
                    manager.displayAllEmployees();
                    System.out.println(" ");
                break;

                case 3: 
                    System.out.print("ID Employee to Delete: ");
                    int Id_to_del = s.nextInt();

                    boolean result = manager.removeEmployee(Id_to_del);
                    
                    if(result == true){
                        manager.displayAllEmployees();
                        System.out.println("Deleted Success");
                        
                    }
                    else{
                        manager.displayAllEmployees();
                        System.out.println("No have ID " + Id_to_del + " to delete");
                    }
                    
                break;
            
                default:
                    break;
            }
        }while(ch != 0);
        s.close();

    }

    private static void EnterDetailEmployeeToAdd(){
        System.out.print("ID : ");
        Id = s.nextInt();

        s.nextLine();

        System.out.print("Name : ");
        Name = s.nextLine();

        System.out.print("Age : ");
        Age = s.nextInt();

        s.nextLine();

        System.out.print("Department : ");
        Department = s.nextLine();

        System.out.print("Code : ");
        Code = s.nextLine();

        System.out.print("SalaryRate : ");
        SalaryRate = s.nextDouble();
    }

}


    

