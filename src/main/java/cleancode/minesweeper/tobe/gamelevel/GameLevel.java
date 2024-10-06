package cleancode.minesweeper.tobe.gamelevel;

// 런타임 시점에서 어떤 구현체가 들어올지는 모르지만
// 이 인터페이스 내의 스펙은 알고 있음
public interface GameLevel {

    int getRowSize();
    int getColSize();
    int getLandMineCount();
}
