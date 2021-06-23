package model.boardgame;

public class Position {

    private int row;
    private int column;

    public Position(int row, int collumn) {
        this.row = row;
        this.column = collumn;
    }

    //Inicio Getters and Setters
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    //Inicio Getters and Setters

    @Override
    public String toString(){
        return row + ", " + column;
    }
}
