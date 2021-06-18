import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Contacts {
    HashMap<String, List<String>> phonebook = new HashMap<>();
    String name;
    List<String> number;

    public void addContact(String name, List<String> number) {

        this.name = name;
        this.number = number;

        if(number.size() > 1) {
            phonebook.put(name, Arrays.asList(number.get(0), number.get(1)));
//            System.out.println(number.get(0) + " " + number.get(1));
        } else {
            phonebook.put(name, Collections.singletonList(number.get(0)));
//            System.out.println(number.get(0));
        }
    }

    public void getNumber(String name) {
        if (phonebook.containsKey(name)) {
            List numberFound = phonebook.get(name);
            System.out.println("Номер контакта " + name + ": " + numberFound);
        } else {
            System.out.println("Такого номера в контактах нет");
        }
    }



//    String person1 = "Петя";
//    String person2 = "Коля";
//    String person3 = "Маша";
//    String person4 = "Саша";
//
//    HashMap<String, List<String>> phonebook = new HashMap<>();
//
//        phonebook.put("Петя", Arrays.asList("+440011223344", "+440011223345"));
//        phonebook.put("Саша", Collections.singletonList("+440011223346"));
//        phonebook.put("Маша", Collections.singletonList("+440011223347"));
//        phonebook.put("Коля", Collections.singletonList("+440011223348"));
//
//        System.out.println(phonebook.get("Коля"));
}
