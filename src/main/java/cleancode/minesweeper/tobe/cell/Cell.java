package cleancode.minesweeper.tobe.cell;

public abstract class Cell {
    protected static final String FLAG_SIGN = "⚑";
    protected static final String UNCHECKED_SIGN = "□";

    protected boolean isFlaged; // 하위에서 접근할 수 있도록 protected로 변경
    protected boolean isOpend;


    // 각 자식마다 다르게 구현해야 하는 부분은 abstract로
    public abstract boolean hasLandMineCount();
    public abstract boolean isLandMind();
    public abstract String getSign();

    // 공통적으로 사용하는 로직
    public void flag() {
        this.isFlaged = true;
    }

    public void open() {
        this.isOpend = true;
    }

    public boolean isChecked() {
        return isFlaged || isOpend;
    }

    public boolean isOpend() {
        return isOpend;
    }

}
