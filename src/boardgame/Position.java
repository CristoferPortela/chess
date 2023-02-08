package boardgame;

public class Position {

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    private int row;

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    private int column;

    @Override
    public String toString() {
        return row + ", " + column;
    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
}
