package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;
import chess.PieceTypes;
import chess.SharedMovements;

public class Bishop extends ChessPiece {
    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return PieceTypes.BISHOP.toString();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        return SharedMovements.diagonalLine(position, this, mat);
    }
}
