package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
    public Color getColor() {
        return color;
    }

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
}
