package Fruits;

import java.util.ArrayList;

    public class Box <F extends Fruits> {
        private ArrayList<F> fruitList = new ArrayList<>();
        private ArrayList<F> returnList = new ArrayList<>();

        public void addFruit(F obj){
            fruitList.add(obj);
            System.out.println("Добавили " + obj + " в " + fruitList);
        }

        public void inBox(){
            System.out.println(fruitList);
        }

        public float getWeight(Object element){
            if (element instanceof Orange) {
                float weight = fruitList.size() * 1.5f;
                System.out.println(weight);
                return weight;
            } else  if (element instanceof Apple){
                float weight = fruitList.size() * 1.0f;
                System.out.println(weight);
                return weight;
            }
            return 0;
        }



        public ArrayList getBoxArrayList() {
            return fruitList;
        }

        public void compare(Box boxToCompare, Object element1, Object element2) {
            ArrayList compareList = boxToCompare.getBoxArrayList();
            float firstWeight = getWeight(element1);
            float compareWeight = boxToCompare.getWeight(element2);
            if(firstWeight == compareWeight){
                System.out.println("Одинаковые по весу");
            } else {
                System.out.println("Разные по весу");
            }

//            ArrayList compareList = boxToCompare.getCurrentBox();
//            if(fruitList.equals(compareList)){
//                System.out.println("Одинаковые");
//            } else {
//                System.out.println("Разные");
//                System.out.println(fruitList);
//                System.out.println(compareList);
//            }
        }

        public ArrayList<F> removeFruits(){
            returnList = fruitList;
            fruitList = null;
            System.out.println("Убрали " + returnList);
            return returnList;
        }
}
