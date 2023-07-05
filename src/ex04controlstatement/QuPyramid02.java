package ex04controlstatement;

/*
[ 문제2 ]
다음과 같은 모양을 출력하는 프로그램을 do~while문으로 작성하시오.

실행결과)
*****
****
***
**
*

*/

public class QuPyramid02 {

	public static void main(String[] args) {
		
		int x = 5;
		do {
			int y = 1;
			do {
				System.out.print("*");
				y++;
			} while(y<=x);
			System.out.println();
			x--;
		} while(x>0);

	}

}
