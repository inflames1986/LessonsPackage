package Lesson7;

public class Main {

    public static void main(String[] args) {



        Cat[] cats = new Cat[5];//для задания 4 создаем массив котов


        cats[0] = new Cat("Барсик", false, 100 );
        cats[1] = new Cat("Кузя", false, 100 );
        cats[2] = new Cat("Сеня", false, 100 );
        cats[3] = new Cat("Муся", false, 100);
        cats[4] = new Cat("Люся", false, 100);

        Plate plate = new Plate(450, 100);

        System.out.println(plate);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

        System.out.println(plate);
        plate.increase();
    }

}
