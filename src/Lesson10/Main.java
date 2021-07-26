package Lesson10;

import java.util.*;

public class Main {
    private static Object HashSet;

    public static void main(String[] args) {

        /* Задание №1 */

        Map <String, Integer> map = new TreeMap<>(); // зададим мапу в отсортированном виде

        List <String> startList = new ArrayList<>(Arrays.asList("apple", "mango", "grapefruit", "banana", "kiwi", "grape",
                "apple", "apple", "apple", "banana", "kiwi", "mango", "mango", "mango", "apple")); // создаем список из слов
//        System.out.println(startList);// распечатываем исходное значение


        for (int i = 0; i < startList.toArray().length; i++) {//проходим по всей длине списка
                map.put(startList.get(i), map.getOrDefault(startList.get(i), 0) + 1);//помещаем в Мапу ключ - слово
                                                                                          //значение - если нулл - 0, иначе +1
            }
//        }
        System.out.println(map);

        /*=================================================================================================*/

        Subscriber subscriber1 = new Subscriber("Пончиков", new HashSet<>(Arrays.asList("2223344", "2234343", "44334534")));
        Subscriber subscriber2 = new Subscriber("Блинов", new HashSet<>(Arrays.asList("2223344")));
        Subscriber subscriber3 = new Subscriber("Борщев", new HashSet<>(Arrays.asList("26785847", "2488784")));
        Subscriber subscriber4 = new Subscriber("Шаурмин", new HashSet<>(Arrays.asList("67357646", "54562565")));
        Subscriber subscriber5 = new Subscriber("Шашлыкин", new HashSet<>(Arrays.asList("5643466", "75445655")));
        Subscriber subscriber6 = new Subscriber("Бургеров", new HashSet<>(Arrays.asList("5643633", "55573457")));
        Subscriber subscriber7 = new Subscriber("Котлетов", new HashSet<>(Arrays.asList("6345655", "7634676")));

        Map <String, Set<String>> subscribers = new TreeMap<>();
        subscribers.put(subscriber1.getFam(), subscriber1.getNumbers());
        subscribers.put(subscriber2.getFam(), subscriber2.getNumbers());
        subscribers.put(subscriber3.getFam(), subscriber3.getNumbers());
        subscribers.put(subscriber4.getFam(), subscriber4.getNumbers());
        subscribers.put(subscriber5.getFam(), subscriber5.getNumbers());
        subscribers.put(subscriber6.getFam(), subscriber6.getNumbers());
        subscribers.put(subscriber7.getFam(), subscriber7.getNumbers());



        System.out.println(subscriber1.toString());
        System.out.println(subscribers);

    }
}
