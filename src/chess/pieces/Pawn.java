package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {
    public Pawn(Board board, Color color, ChessMatch chessMatch) {
        super(board, color, chessMatch);
    }

    @Override
    public String toString() {
        return "P";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        int moveTo = getColor() == Color.WHITE ? -1 : 1;

        p.setValues(position.getRow() + moveTo, position.getColumn());
        if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        p.setValues(position.getRow() + (moveTo * 2), position.getColumn());
        Position p2 = new Position(position.getRow() + moveTo, position.getColumn());
        if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        p.setValues(position.getRow() + moveTo, position.getColumn() - 1);
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        p.setValues(position.getRow() + moveTo, position.getColumn() + 1);
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // En passant
        if ((getColor() == Color.WHITE && position.getRow() == 3) || (getColor() == Color.BLACK && position.getRow() == 4)) {

            Position left = new Position(position.getRow(), position.getColumn() - 1);
            if (getBoard().positionExists(left) && isThereOpponentPiece(left) && getBoard().piece(left) == chessMatch.getEnPassanVulnerable()) {
                mat[left.getRow() + moveTo][left.getColumn()] = true;
            }

            Position right = new Position(position.getRow(), position.getColumn() + 1);
            if (getBoard().positionExists(right) && isThereOpponentPiece(right) && getBoard().piece(right) == chessMatch.getEnPassanVulnerable()) {
                mat[right.getRow() + moveTo][right.getColumn()] = true;
            }
        }

        return mat;
    }
}
