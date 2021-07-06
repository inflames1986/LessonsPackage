package Lesson5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


//        Slave slave = new Slave();
//        slave.fio = "Пупкин Василий Иванович";
//        slave.age = 35;
//        slave.position = "Дворник";
//        slave.payday = 20000;
//        slave.tNumber = "+79997008090";

//        Slave slave1 = new Slave();
//        slave1.fio = "Шапкин Афанасий Игоревич";
//        slave1.age = 37;
//        slave1.position = "Старший дворник";
//        slave1.payday = 25000;
//        slave1.tNumber = "+79997008090";
//
//        int[] arr = new Arr[];


        Slave[] slaves = new Slave[5];


        slaves[0] = new Slave("Васильев Василь Василич", "старший дворник", "794658499", 20000, 50);
        slaves[1] = new Slave("Петров Петр Петрович", "старший помощник младшего дворника", "79998880099", 20000, 55);
        slaves[2] = new Slave("Геннадьев Геннадий Василич", "младший дворник", "7934525099", 20000, 56);
        slaves[3] = new Slave("Михайлов Михал Михалыч", "помощник дворника", "7963367099", 20000, 44);
        slaves[4] = new Slave("Зайцев заяц зайцевич", "дворник", "793463749", 20000, 51);

        for (int i = 0; i < slaves.length; i++) {
            if (slaves[i].getAge() > 40) {
                System.out.println(slaves[i]);
            }
        }

    }
}
