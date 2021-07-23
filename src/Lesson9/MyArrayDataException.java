package Lesson9;

public class MyArrayDataException extends RuntimeException{
    private int row;
    private int col;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public MyArrayDataException(String mes, int row, int col) {
        super(mes);
        this.row = row;
        this.col = col;
    }
}

