import java.util.function.Predicate;

@FunctionalInterface
public interface Checker {
    public abstract boolean check(int i, int i2, Predicate<Integer> checker);
}

class TestPredicate {
    public void CheckerImpl () {
        Checker myChecker = new Checker() {
            @Override
            public boolean check(int i, int i2, Predicate<Integer> checker) {
                checker = x1 -> x1 < i2; // predicate test method is overriden
                if (checker.test(i)) {
                    System.out.println("Value is lager than  variable 1 " + i);
                }
                return checker.test(i);
            }
        };
    }
}

class ValueChecker {

    public void tester(int n, int n1, Predicate<Integer> x) {
        if (x.test(n)) {
            System.out.println("Test 1 Pass");
        } else {
            System.out.println("Test 1 Fail");
        }
        if (x.test(n1)) {
            System.out.println("Test 2 Pass");
        } else {
            System.out.println("Test 2 Fail");
        }
    }

    public void messageTester(String actual, Predicate<String> expected) {
        if (expected.test(actual)) {
            System.out.println("Test 1 Pass ");
        } else {
            System.out.println("Test 1 Fail " + "Expected " + expected + " Actual " + actual);
        }
    }
}
