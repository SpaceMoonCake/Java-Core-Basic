package HomeWork4;

public class Main {
    public static void main (String[] arg){
        Employee employee1 = new Employee("Тюлень Красавчик", "Менеджер", 12345678, 45000, 35);
        Employee employee2 = new Employee("Кот Супер", "Менеджер", 12345678, 45000, 35);
        Employee employee3 = new Employee("Хомяк Хома", "Самый главный", 12345678, 45000, 45);
        Employee employee4 = new Employee("Кирилл Иванович", "Менеджер", 12345678, 45000, 35);
        Employee employee5 = new Employee("Клавдия Ивановна Сурикова", "Менеджер", 12345678, 45000, 50);

        System.out.println("employee3: ФИО - " + employee3.getFio() + "; Должность -  " + employee3.getPosition());

        Employee employees [] = {employee1, employee2, employee3, employee4, employee5};

        int age1 = 40;

        raiseSalary(employees, 35, 10000);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > age1) {
               employees[i].getAllInfo();
            }
        }
    }

    public static void raiseSalary(Employee[] employees, int age, int increase ){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > age){
                employees[i].setSalary(employees[i].getSalary() + increase);
            }
        }
    }
}
