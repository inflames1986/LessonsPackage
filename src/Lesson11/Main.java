package Lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Integer[] arr = new Integer[]{2,4,5,2,3,4,2,1,2,3,2};

        Apple apple = new Apple();


//        System.out.println(arrToArrayList(arr)); // #1
//        exChangeArray(arr);//№2


    }

//    public static  <T> void exChangeArray(T[] arr) { // Lesson 11.1 меняем местами числа массива V1.0
//
//
//        System.out.println(Arrays.toString(arr));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите номер числа которое вы хотите заменить" );
//        int i1 = scanner.nextInt();
//        System.out.println("Введите номер числа которым вы хотите заменить" );
//        int i2 = scanner.nextInt();
//
//        T temp = arr[i1];
//        arr[i1] = arr[i2];
//        arr[i2] = temp;
//
//        System.out.println(Arrays.toString(arr));
//
//    }
//
//         public static <T> ArrayList <T>  arrToArrayList(T[] arr) {//Lesson 11.2 преобразуем массив в ArrayList
//            return new ArrayList<>(Arrays.asList(arr));


    public class Box<T extends Fruits> {
        private List<T> fruitlist;

        public Box(List<T> fruitlist) {
            this.fruitlist = new ArrayList<>();
        }

        public Box(T... fruits) {
            this.fruitlist = new ArrayList(Arrays.asList(fruits));
        }


        public float getWeight() { // получае вес

            float w = 0.0f; //начальный вес = 0
            for (T fruit : fruitlist) { // для каждого фрукта из фруктлиста,
                w += fruit.getWeight(); //каждый раз плюсуем вес фрукта
            }
            return w;
        }

        public boolean compBox(Box<?> another) { //сравним коробки с фруктами

            return Math.abs(this.getWeight() - another.getWeight()) < 0.0001; //сравниваем через вычитание и модуль
        }

        public void exchFruit(Box<? super T> another) { //перекладываем фрукты из коробки в другую
            if (another == this) {// если текущая коробка равна целевой
                return;
            }
            another.fruitlist.addAll(this.fruitlist);// в другую коробку передаем весь список фруктов из текущей коробки
            this.fruitlist.clear();// очищаем текущую коробку
        }

        public void add(T fruit) { //добавить фрукт для типа Т ограничающего фрукт
            fruitlist.add(fruit); //в список фруктов добавляем фрукт
        }
    }
}
