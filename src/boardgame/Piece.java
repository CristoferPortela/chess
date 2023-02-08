package boardgame;

public abstract class Piece {
    protected Position position;

    public Board getBoard() {
        return board;
    }

    protected Board board;

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (boolean[] booleans : mat) {
            for (int j = 0; j < mat.length; j++) {
                if (booleans[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public Piece(Board board) {
        this.board = board;
        position = null;
    }
}
