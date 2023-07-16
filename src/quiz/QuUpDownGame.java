package quiz;

import java.util.Scanner;

/*
[ 업다운게임(Up Down Game) ]
게임설명 : 업다운게임을 메소드를 이용해 구현한다.
1. 컴퓨터는 1~100사이의 숫자 하나를 생성한다.
2. 총 시도횟수는 7번을 부여한다.
3. 사용자는 7번의 시도안에 숫자를 맞춰야 한다.
4. 사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
5. 7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
6. 성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
7. 함수를 사용하여 구현한다.
8. 무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.

*/
public class QuUpDownGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean result = false;
		
		while(true) {
			int com = (int)(Math.random()*100+1);
			System.out.println("컴퓨터 : "+ com);
			
			for(int i=1; i<=7; i++) {
				System.out.println("1~100까지 숫자를 입력하세요: ");
				int user = scan.nextInt();
				
				if(user>com) {
					System.out.println("Down!");
				}
				else if(user<com) {
					System.out.println("Up!");
				}
				else {
					System.out.println(i + "번 안에 성공했습니다.");
					result = true;
					break;
				}
			}
			
			if(result==false) {
				System.err.println("실패했습니다.");
			}
			
			while(true) {
				System.out.println("재시작(1), 종료(0)중에 입력하세요: ");
				int reGame = scan.nextInt();
				
				if(reGame==0) {
					return;
				}
				else if (reGame==1) {
					System.out.println("게임을 재시작합니다.");
				}
				else {
					System.out.println("잘못입력하셨습니다.");
				}
			}
		}

	}

}
