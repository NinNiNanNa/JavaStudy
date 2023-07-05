package ex04controlstatement;

/*
[ 문제3 ]
다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.

실행결과)
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *

*/

public class QuPyramid03 {

	public static void main(String[] args) {

		for(int x=0; x<5; x++) {
			for(int y=0; y<4-x; y++) {
				System.out.print(" ");
			}
			for(int y=0; y<2*x+1; y++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
