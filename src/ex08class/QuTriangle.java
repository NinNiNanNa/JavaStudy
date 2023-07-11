package ex08class;
/*
[ 문제2 ]
밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의해보자.
init메소드를 통해 밑변과 높이를 초기화한다.
그리고 밑변과 높이를 변경시킬 수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의해보자.


실행결과 )
삼각형의 넓이 : 85.0
삼각형의 넓이 : 350.0
*/
class Triangle {
	double Bottom;
	double Height;
	
	double getArea() {
		double result = (Bottom * Height) / 2.0;
		return result;
	}
	
	void setBottom(double bottom) {
		this.Bottom = bottom;
	}
	
	void setHeight(double height) {
		this.Height = height;
	}
	
	void init(double bottom, double height) {
		this.Bottom = bottom;
		this.Height = height;
	}
}
public class QuTriangle {
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());
	}
}
