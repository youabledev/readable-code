package cleancode.minesweeper.tobe.cell;

public class EmptyCell extends Cell {
    private static final String EMPTY_SIGN = "■";

    @Override
    public boolean hasLandMineCount() {
        return false;
    }

    @Override
    public boolean isLandMind() {
        return false;
    }

    @Override
    public String getSign() {
        if (isOpend) {
            return EMPTY_SIGN;
        }
        if (isFlaged) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;
    }
}
