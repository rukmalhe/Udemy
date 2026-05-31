@FunctionalInterface
public interface Calculator {
    public abstract int cal (int x, int y);
}

class Addition {

    public static int add(int i, int i1) {
        Calculator add1 = (x, y) -> { return x + y; };
        return add1.cal(i,i1);
    }
}

class Subtraction {

    public static int sub(int i, int i1) {
        Calculator sub1 = (x, y) -> { return x - y; };
        return sub1.cal(i, i1);
    }
}

