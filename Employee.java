public class Employee{
    String name;
    int id;
    double salary;
    public Employee(String name,int id,double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);

    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(name:"ABC",id:092,salary:50000.0);
        emp1.displayinfo();
    }
}