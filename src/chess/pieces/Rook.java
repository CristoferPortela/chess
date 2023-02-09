package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;
import chess.PieceTypes;
import chess.SharedMovements;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return PieceTypes.ROOK.toString();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        return SharedMovements.straightLine(position, this, mat);
    }
}
