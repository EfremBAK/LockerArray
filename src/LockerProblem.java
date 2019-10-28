
/*
Write a program to simulate the following experiment. You have 100 closed lockers.
 Start with the first locker and for every locker open it.
 Now, starting with the second locker, for this locker and every second locker after that,
  if the locker is open, close it; if it is closed, open it.
  Then, starting with the third locker, for this locker and every third locker after that, if the locker is open,
    close it; if it is closed, open it. Continue with the nth locker changing the
    “position” of every nth locker until n = 100. Print out the locker numbers that
    remain open. What do you notice about the lockers that remain open?

    pseudocode
    n = index + 1
  1.  create  boolean array[100], call it locker
  2 initialized boolean all elements in array to fALSE(where closed locker is false
  3 start with nth number(), go upto last, and increment by nth number
  if locker closed, open it. if open, then closed.
  4. repeat the step 3
  }

 */

public class LockerProblem {
    public static void main(String[] args) {

        boolean locker[] = new boolean[101];

        //close all lockers
        for (int i = 0; i < 101; i++)
            locker[i] = false;
        //start from locker 1 go upto locker 100
        for (int i = 1; i<=100; i++){

            //start from the ith locker and increase it by i
            for (int m = i; m<=100; m=m+i ){
                //if it is open, close. if closed, open.
                locker[m] =!locker[m];
            }

        }
for (int i=1; i<=100; i++)
    if (locker[i])
        System.out.println("locker number " + i + " is opened");
    }
}