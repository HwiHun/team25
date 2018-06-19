package TF;
//Human 클래스를 상속받았음
public class Duck extends Human {
	//오버라이딩된 메소드들
	//String play(String word)메소드에 미리 값을 넣고 하려고 시도를 했지만 만족할만한 성과를 얻지 못해서 노선 변경
	@Override
	public String play(String word) {
		String a = word;
		return a;
	}

	@Override
	public String sleep() {
		String a = "밤에 잠을 자다";
		return a;
	}

	@Override
	public String Today() {
		String b = "하루에";
		return b;
	}
	//Duck클래스의 일반 메소드
	public String play2() {
		String c = "낮에 놀고";
		return c;
	}

}
