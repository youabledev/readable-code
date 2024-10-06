package cleancode.minesweeper.tobe.cell;

public class NumberCell extends Cell {
    private final int nearbyLandMindCount;

    public NumberCell(int nearbyLandMindCount) {
        this.nearbyLandMindCount = nearbyLandMindCount;
    }

    @Override
    public boolean hasLandMineCount() {
        return true;
    }

    @Override
    public boolean isLandMind() {
        return false;
    }

    @Override
    public String getSign() {
        if (isOpend) {
            return String.valueOf(nearbyLandMindCount);
        }
        if (isFlaged) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;
    }
}
