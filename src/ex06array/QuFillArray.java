package ex06array;
/*
[ 문제3 ]
길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장한다.(첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)


실행결과 )
1번째 정수를 입력하세요:2
2번째 정수를 입력하세요:4
3번째 정수를 입력하세요:5
4번째 정수를 입력하세요:3
5번째 정수를 입력하세요:2
6번째 정수를 입력하세요:9
7번째 정수를 입력하세요:7
8번째 정수를 입력하세요:8
9번째 정수를 입력하세요:5
10번째 정수를 입력하세요:1
순서대로입력된결과
2 4 5 3 2 9 7 8 5 1
홀수/짝수 구분입력결과
5 3 9 7 5 1 8 2 4 2
*/
import java.util.Scanner;
public class QuFillArray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[10];
		int[] inputNum = new int[10];
		
		for(int i=0; i<num.length; i++) {
			System.out.printf("%d번째 정수를 입력하세요:", i+1);
			num[i] = scan.nextInt();
		}
		
		System.out.println("순서대로입력된결과");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		System.out.println("홀수/짝수 구분입력결과");
		int even = 0;
		int odd = num.length - 1;
		for(int i=0; i<num.length; i++) {
			if(num[i]%2==0) {
				inputNum[odd] = num[i];
				odd--;
			}
			else {
				inputNum[even] = num[i];
				even++;
			}
		}
		
		for(int i=0; i<inputNum.length; i++) {
			System.out.print(inputNum[i]+ " ");
		}
	}
}
