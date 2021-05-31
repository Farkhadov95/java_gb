import java.lang.reflect.Array;

public class Employee {
    private String name;
    private int age;
    private String position;
    private String email;
    private String tel;
    private int salary;


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
        System.out.println();
        System.out.println("Имя сотрудника: " + employee.name);
        System.out.println("Возраст: " + employee.age);
        System.out.println("Должность: " + employee.position);
        System.out.println("Эл.почта: " + employee.email);
        System.out.println("Телефон: " + employee.tel);
        System.out.println("Зарплата: " + employee.salary);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
