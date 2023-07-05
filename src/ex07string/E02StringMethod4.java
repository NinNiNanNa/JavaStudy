package ex07string;

import java.util.Scanner;

public class E02StringMethod4 {

	public static void main(String[] args) {
		/*
		[ 시나리오1 ]
		주민등록번호를 이용하여 성별을 판단하는 프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		System.out.println("########### 시나리오1 ###########");
		
		System.out.println("주민번호 입력(예 => 970000-0000000) : ");
		Scanner scan1 = new Scanner(System.in);
		String jumin = scan1.next();
		char ch = jumin.charAt(7);
		if(ch=='1' || ch=='3') {
			System.out.println(jumin+" => 남자");
		}
		else if(ch=='2' || ch=='4') {
			System.out.println(jumin+" => 여자");
		}
		else if(ch=='5' || ch=='6' || ch=='7' || ch=='8') {
			System.out.println(jumin+" => 외국인");
		}
		else {
			System.out.println("What?...Who are you....?");
		}
		
		
		/*
		[ 시나리오2 ]
		해당 문자열이 이메일 형식인지 검사하는 프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		System.out.println("########### 시나리오2 ###########");
		
		System.out.println("이메일 입력 : ");
		Scanner scan2 = new Scanner(System.in);
		String email = scan2.next();
		if(email.contains("@") && email.contains(".")) {
			System.out.println(email+" => 이메일형식임");
		}
		else {
			System.out.println(email+" => 이메일형식이아님");
		}
		
		
		/*
		[ 시나리오3 ]
		주민등록번호로 성별을 구분하는 프로그램을 indexOf()를 이용해서 작성하시오.
		*/
		System.out.println("########### 시나리오3 ###########");
		
		System.out.println("주민번호 입력 : ");
		Scanner scan3 = new Scanner(System.in);
		String jumins = scan3.next();
//		char cha = jumins.indexOf("-");
//		if()
		
		
		/*
		[ 시나리오4 ]
		다음 파일명에서 확장자를 잘라내는 프로그램을 작성하시오. 
		파일명 : my.file.images.jpg
		*/
		System.out.println("########### 시나리오4 ###########");


	}

}
