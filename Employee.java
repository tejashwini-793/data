public class Employee{
    String name;
    int id;
    double salary;
    int experience;
    public Employee(String name,int id,double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.experience=experience;
    }
    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(name:"ABC",id:092,salary:50000.0,experience:3);
        emp1.displayinfo();
    }
}
