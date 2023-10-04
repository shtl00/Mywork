package oops.encapsulation;
//SET -TP ASSIGNE VALUE/ get-to get value

public class Employee {
    String name;
    String department;

 int salary;

    public void setname(String employeeName){
        name=employeeName;
    }
    public String getName(){
        return name;

    }public void setDepartment(String team){department= team;}

    public String getDepartment(){
        return department;
    }

    public void setSalary(int employeesalary){salary= employeesalary;}
    public int  getSalary(){return salary;}
}
