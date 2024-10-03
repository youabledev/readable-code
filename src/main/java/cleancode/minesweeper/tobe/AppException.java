package cleancode.minesweeper.tobe;

// 의도된 에러임을 표시함
public class AppException extends RuntimeException {
    public AppException(String message) {
        super(message);
    }
}
