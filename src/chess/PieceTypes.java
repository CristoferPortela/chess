package chess;

public enum PieceTypes {
    PAWN('P'),
    ROOK('R'),
    KNIGHT('N'),
    BISHOP('B'),
    QUEEN('Q'),
    KING('K');

    private final char letter;

    PieceTypes(char letter) {
        this.letter = letter;
    }

    public char getChar() {
        return letter;
    }

    @Override
    public String toString() {
        return Character.toString(letter);
    }
}
