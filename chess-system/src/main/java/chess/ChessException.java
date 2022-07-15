package chess;

public class ChessException extends RuntimeException {

    private static final Long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
