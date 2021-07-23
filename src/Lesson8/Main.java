package Lesson8;

public class Main {

    public static void main(String[] args) {

        Individe[] individes = {
                new Cat(),// исходный кот
                new Human("Петя", 500, 5),//человек с параметрами
                new Cat ("Кузя", 100, 10),// кот с параметрами
                new Cat ("Мурзик", 300, 50),//
                new Robot("Робби",200, 1),

        };

        RunJump[] runjumpes = {

                new Treadmill(200),
                new Wall(6)
        };

        for (Individe i: individes) {
            for (RunJump r: runjumpes) {
                if (!r.go(i)) {
                    break;
                }
            }
        }
    }
}
