package ex04controlstatement;

/*
[ 문제4 ]
다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.

실행결과)
*
**
***
****
*****
****
***
**
*

*/

public class QuPyramid04 {

	public static void main(String[] args) {

		for(int x=1; x<=5; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int x=4; x>0; x--) {
			for(int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
