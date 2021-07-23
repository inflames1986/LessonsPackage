package Lesson9;

public class Main {

        static int SIZE = 4;

        public static void main(String[] args) {
            String[][] arr = {
                    {"13", "12", "16", "5"},
                    {"22", "23", "25", "29"},
                    {"21", "21", "24", "25"},
                    {"14", "25", "21", "19"}
            };
            try {
                System.out.println(sum(arr));

            } catch (MyArraySizeException e) {
                e.printStackTrace();
            } catch (MyArrayDataException e) {
                e.printStackTrace();
                System.out.println(e.getRow() + " " + e.getCol());
                System.out.println(arr[e.getRow()][e.getCol()]);
            }

            System.out.println("Конец работы");// выводим сообщение если удалось завершить программу
        }

        static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
            if (arr.length != SIZE) {// если количество строк не равна сайз
                throw new MyArraySizeException();//лови АррэйСайз исключение
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != SIZE) {// если длина строки массива не равн сайз
                    throw new MyArraySizeException();// лови АррэйСайз исключение

                }
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {//проходим по всем строчкам
                for (int j = 0; j < arr[i].length; j++) {//и всем столбцам
                    try {
                        sum += Integer.parseInt(arr[i][j]); //вычисляем сумму, пробуем вытащить Int значение
                    } catch (NumberFormatException e) {// ловим исключение
                        throw new MyArrayDataException("Не Int формат в строке " + i + " столбце  " + j, i, j);
                    }
                }
            }
            return sum;
        }
    }

