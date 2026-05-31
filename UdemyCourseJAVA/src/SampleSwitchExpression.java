//interface

import org.w3c.dom.ls.LSOutput;

import javax.naming.PartialResultException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

//Abstract classes -
abstract class Animal {
    abstract void speak ();
    public void sleep() {

    }
}
abstract class Mamal extends Animal {
    abstract void walk ();
}

//concrete class
class Cat extends Mamal {
    @Override
    void speak (){
        System.out.println("cat");
    }
    @Override
    void walk () {
        System.out.println("walking");
    }

}

class Human extends Mamal implements Live {
    @Override
    public void speak(){
        System.out.println("English");
    }

    @Override
    void walk () {
        System.out.println("running");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("snoring!!");
    }
}
public class SampleSwitchExpression<C> {

    public void greetings() {

    int a = 2;
    String greeting = switch (a) {
        case 0, 1, 2 -> "HI";
        case 3, 4 -> "Bye";
        default -> "Hello";
    };
    System.out.println("The switch expression "+greeting);
    }
}

class SampleSwithStatment {

    public void greetings (int x) {

        switch (x) {
            case 0 :
                System.out.println("This is case 1.");
                break;
            default:
                System.out.println("default statement ");
                break;
            case 1:
                System.out.println("This is case 2");

        }
    }
}

class SampleWhileLoop {
int [][] arry1 = new int[11][11];
    public void testWhileLoop () {
        int i =0,  j =0;
        OUTER_LOOP: while (i < 10) {
            i ++;
            j = 0; // j set to 0 after the inner loop finishes.

            INNER_LOOP: while (j < 10) {
                j++;
                arry1[i][j]=j;
                //arry1[i][j]=j;
                if ( i > 3){
                    break OUTER_LOOP;
                }
                System.out.println("("+i +" , "  +j+") " + "arry1(%d, %d)".formatted( i, j, arry1[i][j]));

            }
        }
    }
}