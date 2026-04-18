import java.util.Arrays;

public class Main
{
    static void main() {
        // TEST constructor & getter methods
        System.out.println("--- TEST CONSTRUCTOR ---");
        Fibonacci fib0 = new Fibonacci(2);
        int[] seq0 = fib0.getSequence();
        System.out.println(Arrays.toString(seq0));
        if (seq0.length == 2 && seq0[0] == 0 && seq0[1] == 1) {
            System.out.println("-- test pass");
        } else {
            System.out.println("-- TEST FAILS!!!!!!!!!!");
        }
        Fibonacci fib1 = new Fibonacci(6);
        int[] seq1 = fib1.getSequence();
        System.out.println(Arrays.toString(seq1));
        if (seq1.length == 6 && seq1[0] == 0 && seq1[1] == 1 && seq1[2] == 1 && seq1[3] == 2 && seq1[4] == 3 && seq1[5] == 5) {
            System.out.println("-- test pass");
        } else {
            System.out.println("-- TEST FAILS!!!!!!!!!!");
        }
        Fibonacci fib2 = new Fibonacci(15);
        int[] seq2 = fib2.getSequence();
        System.out.println(Arrays.toString(seq2));
        if (seq2.length == 15 && seq2[12] == 144 && seq2[13] == 233 && seq2[14] == 377) {
            System.out.println("-- test pass");
        } else {
            System.out.println("-- TEST FAILS!!!!!!!!!!");
        }
// TEST getIndexOf method
        System.out.println("\n--- TEST getIndexOf ---");
        int idx = fib2.getIndexOf(1);
        System.out.println(idx);
        if (idx == 1) {
            System.out.println("-- test pass");
        } else {
            System.out.println("-- TEST FAILS!!!!!!!!!!");
        }
        idx = fib2.getIndexOf(13);
        System.out.println(idx);
        if (idx == 7) {
            System.out.println("-- test pass");
        } else {
            System.out.println("-- TEST FAILS!!!!!!!!!!");
        }
        idx = fib2.getIndexOf(144);
        System.out.println(idx);
        if (idx == 12) {
            System.out.println("-- test pass");
        } else {
            System.out.println("-- TEST FAILS!!!!!!!!!!");
        }
        idx = fib2.getIndexOf(987);
        System.out.println(idx);
        if (idx == -1) {
            System.out.println("-- test pass");
        } else {
            System.out.println("-- TEST FAILS!!!!!!!!!!");
        }
        idx = fib2.getIndexOf(100);
        System.out.println(idx);
        if (idx == -1) {
            System.out.println("-- test pass");
        } else {
            System.out.println("-- TEST FAILS!!!!!!!!!!");
        }
        idx = fib2.getIndexOf(600);
        System.out.println(idx);
        if (idx == -1) {
            System.out.println("-- test pass");
        } else {
            System.out.println("-- TEST FAILS!!!!!!!!!!");
        }
// TEST extendBy method
        System.out.println("\n--- TEST extendBy ---");
        fib0.extendBy(3);
        int[] updatedSeq = fib0.getSequence();
        System.out.println(Arrays.toString(updatedSeq));
        if (updatedSeq.length == 5 && updatedSeq[0] == 0 && updatedSeq[1] == 1 && updatedSeq[2] == 1 && updatedSeq[3] == 2 && updatedSeq[4] == 3) {
            System.out.println("-- test pass");
        } else {
            System.out.println("-- TEST FAILS!!!!!!!!!!");
        }
        fib1.extendBy(5);
        updatedSeq = fib1.getSequence();
        System.out.println(Arrays.toString(updatedSeq));
        if (updatedSeq.length == 11 && updatedSeq[0] == 0 && updatedSeq[1] == 1 && updatedSeq[8] == 21 && updatedSeq[9] == 34 && updatedSeq[10] == 55) {
            System.out.println("-- test pass");
        } else {
            System.out.println("-- TEST FAILS!!!!!!!!!!");
        }
        fib2.extendBy(2);
        updatedSeq = fib2.getSequence();
        System.out.println(Arrays.toString(updatedSeq));
        if (updatedSeq.length == 17 && updatedSeq[0] == 0 && updatedSeq[1] == 1 && updatedSeq[14] == 377 && updatedSeq[15] == 610 && updatedSeq[16] == 987) {
            System.out.println("-- test pass");
        } else {
            System.out.println("-- TEST FAILS!!!!!!!!!!");
        }
        fib2.extendBy(3);
        updatedSeq = fib2.getSequence();
        System.out.println(Arrays.toString(updatedSeq));
        if (updatedSeq.length == 20 && updatedSeq[0] == 0 && updatedSeq[1] == 1 && updatedSeq[16] == 987 && updatedSeq[17] == 1597 && updatedSeq[18] == 2584 && updatedSeq[19] == 4181) {
            System.out.println("-- test pass");
        } else {
            System.out.println("-- TEST FAILS!!!!!!!!!!");
        }
        Fibonacci fib3 = new Fibonacci(5);
        System.out.println(Arrays.toString(fib3.getSequence()));

        int[] seq3 = fib3.getSequence();
        seq3[0] = 100;

        System.out.println(Arrays.toString(fib3.getSequence()));

    }
}
