import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    private static final int A;
    private static final int B;
    private static final int D;


    static {
        A = 1;
        B = 2;
        D = 3;
    }
    static int a = 2;
    static int b = a++;
    static int c = ++b;

    public int test (int x) {
        if (x < 0) {
            return 1;
        } else if ( x > 0) {
            return 0;
        } else {
            return 0;
        }

    }

    public static <variableStat> void main(String[] args) {

        String greeting = switch (c) {
            case 0, 1, 2 -> "HI";
            case 3, 4 -> "Bye";
            default -> "Hello";
        };
        System.out.println("greetings " + greeting);

        int C = 6;
        //shot circuits
        int x = (A > B) ? D : ++C;
        System.out.println(" xxx " + x);

        int[] ia = new int[]{1, 2, 3};
        System.out.println(ia[1]);

        Cat ct1 = new Cat();
        ct1.speak();
        ct1.walk();

        Human rh = new Human();
        rh.sleep();

        System.out.println("Sum of 5 + 10 is " + Addition.add(5, 10));
        System.out.println("Substracts of 100 - 50 is " + Subtraction.sub(100, 50));

        //Predicate Test
        ValueChecker vc = new ValueChecker();
        vc.tester( 10, 15, p1 -> p1 == 15 );

        Predicate<String> myOutput = p2 -> p2 == "Error while Saving";
        vc.messageTester("Error while Saving", myOutput );

        TestPredicate tp1 = new TestPredicate();
        //tp1.myChecker();

        int[] testArry1 = {1,3,15};
        int[] testArry2 = {1,3,20};
        int[][] multiArray1 = {{1,2,5},{3,5,10},{1}};
        System.out.println("My array is "+ Arrays.toString(testArry1));
        System.out.println("Comparison " + Arrays.compare(testArry1,testArry2 ));
        System.out.println("Mismatch " + Arrays.mismatch(testArry1, testArry2));
        Arrays.sort(testArry1);
        System.out.println("Binary Search " + Arrays.binarySearch(testArry1, 15));

        for (int i = 0; i < multiArray1.length; i++){
            for (int j = 0; j < multiArray1[i].length; j++ ) {
                System.out.println("Multi dimentional Array Printing " + "multiArray1(%d,%d".formatted(i, j, multiArray1[i][j]));

            }
        }

        TestAutoBoxing tb1 = new TestAutoBoxing();
        Integer val1 = new Integer(5);
        int val2 = 9;
        tb1.testInst(val1++, ++val2); // testInst(5, 10); | val1 =11, val2 =11
        System.out.println("Values of val1 and val2 are " + val1 +" " +val2);

        SampleSwitchExpression ssx1 = new SampleSwitchExpression();
        ssx1.greetings();

        SampleSwithStatment ss1 = new SampleSwithStatment();
        ss1.greetings(10);

        SampleWhileLoop swl1 = new SampleWhileLoop();
        swl1.testWhileLoop();





    }
}
