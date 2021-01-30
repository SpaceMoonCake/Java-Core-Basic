package HomeWork4;

public class Employee {
    private String fio;
    private String position;
    private int phoneNumber;
    private int salary;
    private int age;
    private int idEmployee;
    private static int lastID;

    public Employee(String fio, String position, int phoneNumber, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        this.idEmployee = idEmployee();
    }

    private int idEmployee (){
        return(this.lastID = this.lastID + 1);
    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void getAllInfo(){
        System.out.println("ID: " + idEmployee);
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + position);
        System.out.println("Возраст: " + age);
        System.out.println("Зарплата: " + salary);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println();
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
