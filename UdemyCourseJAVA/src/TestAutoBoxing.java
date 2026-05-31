public class TestAutoBoxing {
    public static void  testInst (Integer a, int b) {
        a = b++;    // -> a = b; b = b + 1
        System.out.println("print obj 1 " +a);
        a ++;   //  -> a = a + 1
        System.out.println("print obj 2 " +a);
    }

}
