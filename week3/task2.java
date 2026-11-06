
class Employee{
    int empID;
    String empname;
    String empdept;
    int salary;
    public Employee(){
        this.empID = 1;
        this.empname = "User";
        this.empdept = "Admin";
        this.salary = 100000;
    }
    public Employee(int id,String name,String dept,int sal){
        this.empID = id;
        this.empname = name;
        this.empdept = dept;
        this.salary = sal;

    }
    public void showdetails(){
        System.out.println("- Employee ID   : "+ empID);
        System.out.println("- Employee Name : "+ empname);
        System.out.println("- Department    : "+ empdept);
        System.out.println("- Salary        : "+ salary);

    }
}

public class task2 {
    public static void main(String[] args){
        Employee obj1 = new Employee(2, "Ram", "Engineer", 200000); // Clean parameterized call
        Employee obj2 = new Employee(3,"Suresh","Maintenance",1000000);
        Employee obj3 = new Employee();
        obj3.showdetails();
        obj1.showdetails();
        obj2.showdetails();

    
    }

}
