package ex04controlstatement;

/*
[ 문제1 ]
다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.

실행결과)
*
**
***
****
*****

*/

public class QuPyramid01 {

	public static void main(String[] args) {

		int x = 1;
		while(x<=5) {
			int y = 1;
			while(y<=x) {
				System.out.print("*");
				y++;
			}
			System.out.println();
			x++;
		}

	}

}
