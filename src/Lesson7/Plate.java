package Lesson7;

import java.util.Scanner;

public class Plate {

    private int food;// количество еды
    private int amount;// сколько можно съесть еды

    public Plate(int food, int amount) {
        this.food = food;
        this.amount = amount;
    }

    public int getFood() {
        return food;
    }

    public int getAmount() {
        return amount;
    }

    public void decrease() {
        if ((amount <= food) && (amount > 0)) {// проверяем чтобы количество съеденного не было больше чем есть и
                                               // чтобы количество еды не увеличивалось - "-" на "-" дает плюс
            food -= amount;} else {
            System.out.println("Количество еды не может увеличиваться или быть меньше 0. Действие не выполнено");

        }
    }

    public void increase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько еды вы хотите добавить в тарелку");
        int sc = scanner.nextInt();
        if (sc > 0) {
            food += sc;
            System.out.println("Вы добавили " + sc + " еды в тарелку, теперь в тарелке " + food + " еды");
        }

    }

    @Override
    public String toString() {
        return "Еды в наличии " +
                " = " + food +
                ' ';
    }
}
