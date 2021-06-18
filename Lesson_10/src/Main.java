import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


// ----------------------- Задание 1
        Set<String> fruits = new TreeSet<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Pineapple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Mango");

//        System.out.println(fruits);
//        countFrequencies();


// ----------------------  Задание 3 (Вызов)
        Contacts contacts = new Contacts();

//        Для добавления контакта с двумя номерами
        contacts.addContact("Michael", Arrays.asList("+3333333333333", "+3333333333356"));
        contacts.addContact("Angela", Arrays.asList("+7877844453", "+7877844454"));

//        Для добавления контакта с одним номером
        contacts.addContact("Pam", Collections.singletonList("+44444555558"));
        contacts.addContact("Jim", Collections.singletonList("+44444555557"));
        contacts.addContact("Dwight", Collections.singletonList("+44444555556"));

//      Поиск контакта по имени
        contacts.getNumber("Jim");
    }


// ----------------------- Задание 2
    public static void countFrequencies() {
        ArrayList<String> bowl = new ArrayList<>();
        bowl.add("Banana");
        bowl.add("Banana");
        bowl.add("Orange");
        bowl.add("Orange");
        bowl.add("Kiwi");
        bowl.add("Kiwi");
        bowl.add("Apple");
        bowl.add("Apple");


        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for(String fruit : bowl) {
            if(frequencyMap.containsKey(fruit)) {
                frequencyMap.put(fruit, frequencyMap.get(fruit)+1);
            }
            else{ frequencyMap.put(fruit, 1); }
        }
        System.out.println(frequencyMap);
    }






}
