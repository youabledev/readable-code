package cleancode.minesweeper.tobe;

public class Cell {
    private static final String FLAG_SIGN = "⚑";
    private static final String LAND_MINE_SIGN = "☼";
    private static final String UNCHECKED_SIGN = "□";
    private static final String EMPTY_SIGN = "■";

    private int nearbyLandMindCount;
    private boolean isLandMine;
    private boolean isFlaged;
    private boolean isOpend;

    // 일반 생성자는 private
    private Cell(int nearbyLandMindCount, boolean isLandMine, boolean isFlaged, boolean isOpend) {
        this.nearbyLandMindCount = nearbyLandMindCount;
        this.isLandMine = isLandMine;
        this.isFlaged = isFlaged;
        this.isOpend = isOpend;
    }

    // 정적 팩토리 메서드
    public static Cell of(int nearbyLandMindCount, boolean isLandMine, boolean isFlaged, boolean isOpend) {
        return new Cell(nearbyLandMindCount, isLandMine, isFlaged, isOpend);
    }

    public static Cell create() {
        return of(0, false, false, false);
    }

    public void updateNearbyLandMineCount(int count) {
        this.nearbyLandMindCount = count;
    }


    public void turnOnLandMine() {
        this.isLandMine = true;
    }

    public void flag() {
        this.isFlaged = true;
    }

    public void open() {
        this.isOpend = true;
    }

    public boolean isChecked() {
        return isFlaged || isOpend;
    }

    public boolean isLandMind() {
        return isLandMine;
    }

    public boolean isOpend() {
        return isOpend;
    }

    public boolean hasLandMineCount() {
        return this.nearbyLandMindCount != 0;
    }

    public String getSign() {
        if (isOpend) {
            if (isLandMine) {
                return LAND_MINE_SIGN;
            }
            if (hasLandMineCount()) {
                return String.valueOf(nearbyLandMindCount);
            }
            return EMPTY_SIGN;
        }

        if (isFlaged) {
            return FLAG_SIGN;
        }

        return UNCHECKED_SIGN;
    }
}
