package Lesson9;

public class Main {

        static int ARRSIZE = 4;

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

    /**
     * Метод вычисления суммы элементов массива
     * @param arr  исходный массив
     * @return возвращает целое число - сумму элементов массива
     * @throws MyArraySizeException если размер массива будет не верный
     * @throws MyArrayDataException если в ячейке будет не целое число
     */

                static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
            if (arr.length != ARRSIZE) {// если количество строк не равна сайз
                throw new MyArraySizeException();//лови АррэйСайз исключение
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != ARRSIZE) {// если длина строки массива не равн сайз
                    throw new MyArraySizeException();// лови АррэйСайз исключение

                }
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {//проходим по всем строчкам
                for (int j = 0; j < arr[i].length; j++) {//и всем столбцам
                    try {
                        sum += Integer.parseInt(arr[i][j]); //вычисляем сумму, пробуем вытащить Int значение из каждой ячейки
                    } catch (NumberFormatException e) {// ловим исключение если преобразовать в инт не удалось
                        throw new MyArrayDataException("Не Int формат в строке " + i + " столбце  " + j, i, j);
                    }
                }
            }
            return sum;
        }
    }

