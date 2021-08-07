package Lesson12;

import java.util.Arrays;

    public class Main {

        static final int ARRSIZE = 10_000_000; // постоянное значение - размер
        static final int HALFARRSIZE = ARRSIZE / 2; // размер делим на 2

        public static void main(String[] args) {
            float[] arr = new float[ARRSIZE];// задаем массив флоатов
            setArr(arr);
            calc1(arr);
            setArr(arr);
            calc2(arr);
        }

        public static void setArr(float[] arr) {
            Arrays.fill(arr, 1);
        }

        public static void calc1(float[] arr) {
            long starting = System.currentTimeMillis();// начальное время = текущее время
            for (int i = 0; i < arr.length; i++) { // проходим по массиву
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2)); //вычисление
            }
            long ending = System.currentTimeMillis();//текущее время = конечное время
            System.out.println("Общее время выполнения, вариант 1: " + (ending - starting) + "мс");// вычисляем время выполнения
            System.out.println(arr[HALFARRSIZE]);//результат 1
        }

        public static void calc2(float[] arr) {
            long startTime = System.currentTimeMillis();// начальное время = текущее время
            float[] a1 = new float[HALFARRSIZE];// 1я половина массива
            float[] a2 = new float[HALFARRSIZE];// 2я половина массива

            System.arraycopy(arr, 0, a1, 0, HALFARRSIZE); // a1 = первая половина
            System.arraycopy(arr, HALFARRSIZE, a2, 0, HALFARRSIZE); // а2 = вторая половина

            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }// в потоке 1 вычисляем первую половину
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < a2.length; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + (i+HALFARRSIZE) / 5) * Math.cos(0.2f + (i+HALFARRSIZE) / 5) * Math.cos(0.4f + (i+HALFARRSIZE) / 2));
                }// в потоке 2 вычисляем вторую половину
            });

            thread1.start();// запуск 1 потока
            thread2.start();// запуск 2 потока

            try {
                thread1.join();// ждем
                thread2.join();// ждем

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.arraycopy(a1, 0, arr, 0, HALFARRSIZE);//добавляем в общий массив итоговую первую половину
            System.arraycopy(a2, 0, arr, HALFARRSIZE, HALFARRSIZE);// итоговую вторую половину

            long ending = System.currentTimeMillis();
            System.out.println("Общее время выполнения, вариант 2: " + (ending - startTime) + "мс");
            System.out.println(arr[HALFARRSIZE]);
        }
    }

