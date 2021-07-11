package Lesson6;

import Lesson5.Slave;
import Lesson6.animals.Cat;
import Lesson6.animals.Dog;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

                Cat[] cats = new Cat[5];//для задания 4 создаем массив котов


                cats[0] = new Cat("Барсик", "черные", "маленькие", "длинный", 5);
                cats[1] = new Cat("Кузя", "синие", "средние", "средний", 5);
                cats[2] = new Cat("Сеня", "желтые", "большие", "короткий", 5);
                cats[3] = new Cat("Муся", "красные", "толстые", "маленький", 5);
                cats[4] = new Cat("Люся", "белые", "нет усов", "длинный", 5);


                int nCats = 1;// начальное число котов 1
                for (int i = 0; i < cats.length; i++) {// проходим по масссиву котов
                        {
                                nCats = i + 1;//увеличиваем число котов на 1
                        }
                }
                System.out.println("Число котов, учавствующих в забеге - " + nCats);//итоговое число котов


                for (int i = 0; i < cats.length; i++) {

                        System.out.println("Введите дистанцию для забега кота под номером " + (i + 1) + " именуемого " + cats[i].getname());
                        Scanner sc = new Scanner(System.in);
                        int cRun = sc.nextInt();//ввод дистанции для забега кота

                        if (cRun <= cats[i].getMaxRun() && cRun > 0) {//проверяем условия в 3м уроке
                                cats[i].run(cRun);//бежим
                        } else
                                cats[i].norun(cRun);//не бежим
                        cats[i].catcantswim();// не плаваем
                }


                System.out.println();
                System.out.println("Переходим к собаке");

                 //аналогично кошкам

                Dog[] dogs = new Dog[6];


                dogs[0] = new Dog("Шарик", "черные", "маленькие", "длинный", 5);
                dogs[1] = new Dog("Кубик", "синие", "средние", "средний", 6);
                dogs[2] = new Dog("Рубик", "желтые", "большие", "короткий", 6);
                dogs[3] = new Dog("Барбос", "красные", "толстые", "маленький", 7);
                dogs[4] = new Dog("Пес", "белые", "нет усов", "длинный", 5);
                dogs[5] = new Dog("Кокос", "желтые", "нет усов", "длинный", 3);

                int nDogs = 1;
                for (int i = 0; i < dogs.length; i++) {
                        {
                                nDogs = i+1;
                        }
                }
                System.out.println("Число собак, учавствующих в забеге - " + nDogs);

                for (int i = 0; i < dogs.length; i++) {

                        System.out.println("Введите дистанцию для забега собакена под номером " + (i + 1) + " именуемого " + dogs[i].getname());
                        Scanner sc = new Scanner(System.in);

                int dRun = sc.nextInt();

                if (dRun <= dogs[i].getMaxRun() && dRun > 0) {
                        dogs[i].run(dRun);
                } else
                        dogs[i].norun(dRun);

                System.out.println("Введите дистанцию для заплыва собаки");
                int dSwim = sc.nextInt();

                if (dSwim <= dogs[i].getMaxSwim() && dSwim > 0) {
                        dogs[i].swim(dSwim);
                } else
                        dogs[i].noSwim(dSwim);
                }

                System.out.println("Всего в соревнованиях принимало участие " + (nDogs + nCats) + " животных");

        }
}

//        Cat cat = new Cat("Барсик", "черные", "маленькие", "длинный", 5);
//        Dog dog = new Dog("Шарик", "белые", "длинные", "короткий", 5);
//        Cat cat1 = new Cat("Кузя", "синие", "средние", "средний", 5);
//        Dog dog1 = new Dog("Гавкун", "желтые", "огромные", "огромный", 5);