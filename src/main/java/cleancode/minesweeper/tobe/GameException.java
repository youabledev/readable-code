package cleancode.minesweeper.tobe;

// 의도된 에러임을 표시함
public class GameException extends RuntimeException {
    public GameException(String message) {
        super(message);
    }
}
