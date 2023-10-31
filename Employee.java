class Employee{
    String name;
    int age;
    String department;
    double salary;
    Employee(){
        this.name="Keerthivasan";
        this.age=21;
        this.department="Full stack development";
        this.salary=27000;
        this.printInfo();
    }
    public void printEmployeeInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(department);
        System.out.println(salary);
    }
}
public class Main
{
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="guru";
		e1.age=25;
		e1.department="Developer";
		e1.salary=40000;
		e1.printInfo();
	}
}
