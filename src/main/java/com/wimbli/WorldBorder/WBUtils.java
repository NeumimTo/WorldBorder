package com.wimbli.WorldBorder;

public class WBUtils {
    public enum Direction {
        N(180f),
        S(0f),
        W(90f),
        E(-90f);
        public final float defaultYaw;
        Direction(float i) {
            this.defaultYaw = i;
        }
    }

    public static Direction opposite(Direction c) {
        switch (c) {
            case E:
                return Direction.W;
            case N:
                return Direction.S;
            case W:
                return Direction.E;
            default:
                return Direction.N;
        }
    }

}
