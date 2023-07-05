package ex04controlstatement;

/*
[ 문제4 ]
1~100까지의 숫자중 3의 배수 이거나 7의 배수인 숫자의 합을 구하는 프로그램을 while문으로 작성하시오.
단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 출력의 결과는 누적되는 모든 수를 콘솔에 print한다.
*/

public class Qu3Or7Sum {

	public static void main(String[] args) {

		int result = 0;
		int a = 1;
		while(a<=100) {
			if((a%3)==0 || (a%7)==0) {
				if(a%(3*7) != 0) {
					result += a;
					System.out.println("a = "+ a);
				}
			}
			a++;
		}
		System.out.println("정답 : "+ result);

	}

}
