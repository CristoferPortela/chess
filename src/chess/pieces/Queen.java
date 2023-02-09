package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;
import chess.PieceTypes;
import chess.SharedMovements;

public class Queen extends ChessPiece {
    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return PieceTypes.QUEEN.toString();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        return SharedMovements.diagonalLine(position, this, SharedMovements.straightLine(position, this, mat));
    }
}
