package boardgame;

public class Piece {
    protected Position position;

    protected Board getBoard() {
        return board;
    }

    protected Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }
}
