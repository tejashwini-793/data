public class Employee{
    String name;
    int id;
    double salary;
    int experience;
    public Employee(String name,int id,double salary,int experience) {
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
        Employee emp1 = new Employee("ABC",092,50000.0,3);
        emp1.displayinfo();
    }
}
