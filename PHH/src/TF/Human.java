package TF;
//추상클래스 사용 여기에 인터페이스를 구현
public abstract class Human implements Animal {
	//오버라이딩 된 메소드들
	@Override
	public String play() {
		String a ="밤에 놀고";
		return a;
	}

	@Override
	public String play(String word) {
		String b ="사람은";
		return b;
	}
	//추상화클래스에서 일반메소드 사용가능 하므로 일반메소드 생성
	public String sleep1() {
		String c = "낮에 잠을 자다";
		return c;
	}

}
