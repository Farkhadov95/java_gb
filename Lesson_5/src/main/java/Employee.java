import java.lang.reflect.Array;

public class Employee {
    public String name;
    public int age;
    public String position;
    public String email;
    public String tel;
    public int salary;


    public Employee(String name, String position,
                    String email, String tel,
                    int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public static void info(Employee employee) {
        System.out.println("Имя сотрудника: " + employee.name);
        System.out.println("Возраст: " + employee.age);
        System.out.println("Должность: " + employee.position);
        System.out.println("Эл.почта: " + employee.email);
        System.out.println("Телефон: " + employee.tel);
        System.out.println("Зарплата: " + employee.salary);
    }


}
