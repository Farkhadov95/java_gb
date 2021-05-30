public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Петя", "CEO",
                "ceo123@gmail.com","+111223344",
                1000, 32);
        Employee employee2 = new Employee("Миша", "CFO",
                "cfo123@gmail.com","+111223355",
                800, 30);
        Employee employee3 = new Employee("Маша", "Маркетолог",
                "cfo123@gmail.com","+111223355",
                700, 25);
        Employee employee4 = new Employee("Саша", "Юрист",
                "cfo123@gmail.com","+111223355",
                600, 37);
        Employee employee5 = new Employee("Даша", "HR",
                "cfo123@gmail.com","+111223355",
                500, 48);

        Employee[] person = new Employee[5];
        person[0] = employee1;
        person[1] = employee2;
        person[2] = employee3;
        person[3] = employee4;
        person[4] = employee5;

        findEmployee(person, 40);
    }

    public static void findEmployee(Employee[] specificEmployee, int age) {
        for (int i = 0; i < specificEmployee.length; i++) {
            if (specificEmployee[i].age > age) {
                Employee.info(specificEmployee[i]);
            } else {
                System.out.println("Сотрудник " + specificEmployee[i].name + " не соответствует критерию поиска");
            }
        }
    }

}
