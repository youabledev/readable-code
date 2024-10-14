package cleancode.minesweeper.tobe;

//public class AnotherGame implements Game {
//    @Override
//    public void initialize() {
//        // AnotherGame에 필요 없는 로직 -> ISP에 위반
//    }
//
//    @Override
//    public void run() {
//        // game start
//    }
//}

import cleancode.minesweeper.tobe.game.GameRunnable;

public class AnotherGame implements GameRunnable {
    @Override
    public void run() {
        // game start
    }
}
