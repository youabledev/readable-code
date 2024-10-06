package cleancode.minesweeper.tobe.cell;

public class LandMineCell extends Cell {
    private static final String LAND_MINE_SIGN = "☼";

    @Override
    public boolean hasLandMineCount() {
        return false;
    }

    @Override
    public boolean isLandMind() {
        return true;
    }

    @Override
    public String getSign() {
        if (isOpend) {
            return LAND_MINE_SIGN;
        }
        if (isFlaged) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;
    }
}
