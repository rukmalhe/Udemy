public class Jobs {
    public Jobs () {
        try {
            throw new MyException();
        } catch (Exception e) {
            e.toString();
        }
    }
    
//    public static void main (String[] args) {
//        Jobs a1 = new Jobs();
//        Jobs b1 = new Jobs();
//        Jobs c1 = a1;

}
class MyException extends Exception {
    //Post increment
    int x = 5;
    int y = x++; // y gets the value 5, then x is incremented to 6

    //Pre increment
    //int x = 5;
    //int y = ++x; // x is incremented to 6, then y gets the value 6

        }


