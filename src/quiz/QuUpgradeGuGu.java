package quiz;

/*
[ 업그레이드 구구단 ]
아래와 같은 출력결과를 보이는 업그레이드 구구단 프로그램을 작성하시오.

실행결과 )
2 x 1 = 2
2 X 2 = 4
2 X 2 X 2 = 8
2 X 2 X 2 X 2 = 16
2 X 2 X 2 X 2 X 2 = 32
2 X 2 X 2 X 2 X 2 X 2 = 64
2 X 2 X 2 X 2 X 2 X 2 X 2 = 128
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 256
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 512
3 X 1 = 3
3 X 3 = 9
3 X 3 X 3= 27
………중간 생략………
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 43046721
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 3874204892
*/

public class QuUpgradeGuGu {

//	public static void main(String[] args) {
//		
//		StringBuffer strBuffer = new StringBuffer();
//		
//		for(int base=2; base<=9; base++) {
//			strBuffer.setLength(0);
//			for(int power=1; power<=9; power++) {
//				if(power==1) {
//					strBuffer.append(base);
//					System.out.println(strBuffer + " x 1 = " + base);
//				}
//				else {
//					strBuffer.append(" x " + base);
//					System.out.println(strBuffer + " = " +(int)Math.pow(base,power));
//				}
//			}
//		}
//	}
	
	public static void main(String[] args) {
		
		for(int base=2; base<=9; base++) {
			for(int power=1; power<=9; power++) {
					System.out.println(base + "^" + power + " = " +(int)Math.pow(base,power));
			}
		}
	}
	
	
}