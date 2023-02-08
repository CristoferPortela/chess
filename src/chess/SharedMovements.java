package chess;

import boardgame.Position;

public class SharedMovements {

    public static boolean[][] straightLine(Position position, ChessPiece chessPiece, boolean[][] mat) {
        Position p = new Position(0, 0);

        // Up
        p.setValues(position.getRow() - 1, position.getColumn());
        while (chessPiece.getBoard().positionExists(p) && !chessPiece.getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() - 1);
        }
        if (chessPiece.getBoard().positionExists(p) && chessPiece.isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Down
        p.setValues(position.getRow() + 1, position.getColumn());
        while (chessPiece.getBoard().positionExists(p) && !chessPiece.getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
        }
        if (chessPiece.getBoard().positionExists(p) && chessPiece.isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Left
        p.setValues(position.getRow(), position.getColumn() - 1);
        while (chessPiece.getBoard().positionExists(p) && !chessPiece.getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }
        if (chessPiece.getBoard().positionExists(p) && chessPiece.isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // Right
        p.setValues(position.getRow(), position.getColumn() + 1);
        while (chessPiece.getBoard().positionExists(p) && !chessPiece.getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() + 1);
        }
        if (chessPiece.getBoard().positionExists(p) && chessPiece.isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }

    public static boolean[][] diagonalLine(Position position, ChessPiece chessPiece, boolean[][] mat) {

        Position p = new Position(0, 0);

        // nw
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        while (chessPiece.getBoard().positionExists(p) && !chessPiece.getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() - 1);
        }
        if (chessPiece.getBoard().positionExists(p) && chessPiece.isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // ne
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        while (chessPiece.getBoard().positionExists(p) && !chessPiece.getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() + 1);
        }
        if (chessPiece.getBoard().positionExists(p) && chessPiece.isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // se
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        while (chessPiece.getBoard().positionExists(p) && !chessPiece.getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1, p.getColumn() + 1);
        }
        if (chessPiece.getBoard().positionExists(p) && chessPiece.isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // sw
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        while (chessPiece.getBoard().positionExists(p) && !chessPiece.getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1, p.getColumn() - 1);
        }
        if (chessPiece.getBoard().positionExists(p) && chessPiece.isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        return mat;
    }
}
