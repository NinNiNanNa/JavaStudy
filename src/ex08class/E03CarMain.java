package ex08class;

class Car {
	// 멤버변수 : 자동차모델명, 소유주
	String carModel;
	// 소유주를 표현한 멤버변수는 Human타입으로 정의되었다.
	Human owner;
	/*
	우리가 직접 작성한 클래스는 객체를 표현하기 위한 용도로 생성하지만 Java에서는 하나의 자료형으로 사용된다.
	즉 객체를 표현하는 또 하나의 자료형을 생성하는것이 class를 작성하는 목적이 된다.
	*/
	
	/*
	초기화메서드1
	: 매개변수가 없는 형태로 항상 고정된 값으로만 인스턴스를 초기화할 수 있다.
	  따라서 확장성이 없는 형태의 메서드이다.
	*/
	void initialize() {
		// Car클래스의 멤버변수를 초기화한다.
		carModel = "람보르기니";
		/*
		자동차 소유주를 표현할 Human타입의 멤버변수는 아직 객체가 생성되지 않은 상태이므로,
		초기화를 위해 객체를 생성한 후 초기화를 진행하고 있다.
		*/
		owner = new Human();
		owner.name = "스티브로져스";
		owner.age = 30;
		owner.energy = 10;
	}
	/*
	초기화메서드2
	: 위와 동일한 이름의 메서드로 오버로딩에 의해 정의되어있다.
	  초기화를 진행하는 역할은 동일하나, 매개변수를 통해 다양한 값으로 초기화할 수 있다.
	*/
	void initialize(String model, String name, int age, int energy) {
		carModel = model;
		owner = new Human();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}
	
	void drive() {
		System.out.println(owner.name + "이(가) "+ carModel + "을 운전한다.");
	}
	
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.printf("모델명:%s\n", carModel);
		owner.showState();
	}
} // end of Car class

public class E03CarMain {

	public static void main(String[] args) {

		//자동차1 객체 생성
		Car car1 = new Car();
		car1.initialize();
		car1.showCarInfo();
		
		// 자동차2 객체 생성
		Car car2 = new Car();
		car2.carModel = "밴틀리";
		car2.owner = new Human();
		car2.owner.name = "토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		car2.showCarInfo();
		
		// 자동차3 객체 생성
		Car car3 = new Car();
		car3.initialize("스포츠카", "성유겸", 8, 10);
		car3.showCarInfo();
		
		// 자동차4 객체 생성
		Car car4 = new Car();
		car4.showCarInfo();
		
		

	}

}
