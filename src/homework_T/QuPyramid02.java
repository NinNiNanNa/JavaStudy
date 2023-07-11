// [ 연습문제 제어문(조건/반복문)2 - 문제2 ]
package homework_T;

public class QuPyramid02 {

    public static void main(String[] args) {

        /*
        for(int i=5 ; i>=1 ; i--) {
            for(int j=1 ; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        int i=5;
        do {
            int j=1;
            do {
                System.out.print("*");
                j++;
            } while(j<=i);
            System.out.println();
            i--;
        } while(i>=1);
    }
}