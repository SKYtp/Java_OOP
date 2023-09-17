import java.util.Date;

public class Lab7_64010792_3 {
    public static void main(String[] args) {
        Student student = new Student("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520"
        , "012-345-6789", "somsak@mymail.com", "FRESHMAN");
        System.out.println(student.toString());
        
    }
}
class Person {
    protected String name;
    protected String address;
    protected String phone;
    protected String email;
    public Person() {

    }
    Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public String toString() {
        return "Name : " + name + "\nAddress : " + address + "\nPhone number : " + phone + "\nEmail address : " + email + "\n"
        + "Person{name=" + name + ", address="+address + ",phoneNumber=" + phone + ",email="
        + email + "}" ;
    }
}
class Student extends Person {
    protected String status;
    Student(String name, String address, String phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }
    public String toString() {
        return "\nStuden\n"+super.toString() + "Student{status=" + status + "}";
    }
}
class Employee extends Person{
    //Date date = new Date();
    protected String office;
    protected double salary;
    protected Date dateHired;
    Employee(String name, String address, String phone, String email, String office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }
    public String toString() {
        return "\nEmployee\n" + super.toString() + "Employee{office=" + office +"}";
        //return super.toString() + "Office : " + office + "\nSalary : $" + salary + "\nDate Hired : " + dateHired + "\n";
    }
}
class Faculty extends Employee {
    protected String officeHours;
    protected String rank;

    Faculty(String name, String address, String phone,
     String email, String office, double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString() {
        return super.toString() + "Office Hours : " + officeHours + "\nRank : " + rank + "\n";
    }
}
class Staff extends Employee{
    protected String title;

    Staff(String name, String address, String phone,
     String email, String office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }

    public String toString() {
        return super.toString() + "Title : " + title + "\n";
    }
}
