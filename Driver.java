/*
Mohammad Mattar, HW1011, 10/16,2018
Program - Create a circular queue of size 10 implemented on a 1D array.
generate a random number x to insert, a numbers to be inserted x times, y to delete,
all from queue, then print queue.
URL(S):
 */
import java.util.Random;

public class Driver {
    public static void main(String[] args) {

        int arrLength = 3, size = 10;
        Queue q = new Queue(size);
        Random ran = new Random(3);

        for (int i = 1; i < arrLength; i++) {
            int ansX = ran.nextInt(5 + 1);
            System.out.println("Insert(X): " + ansX + " number(s)");

            for (i = 0; i < ansX; i++) {
                int ansA = ran.nextInt(99);
                q.insert(ansA);
                q.print();
            }
                int ansY = ran.nextInt(5 + 1);
                System.out.println("Delete(Y): " + ansY + " number(s)");

                for (i = 0; i < ansY; i++) {
                    q.delete();
            }

        }

        System.out.println("Resulting Queue:");
        q.print();

        }
    }
