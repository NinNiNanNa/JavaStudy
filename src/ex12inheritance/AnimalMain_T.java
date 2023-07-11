package ex12inheritance;

public class AnimalMain_T {
	
	public static void main(String[] args) {
		//강아지 객체생성
		AnimalDog_T dog = new AnimalDog_T("포유류",2,"수컷","포매라니안","뽀미");
		
		dog.showAnimal();
		System.out.println("====================");
		dog.bark();
		System.out.println("====================");
		dog.showDog();
	}
}
