package TF;

public class Exam {

	public static void main(String[] args) {
		//업캐스팅을 통한 객체 생성
		Human saram = new Duck();
		//객체변수로 지정
		String s1 = saram.play("사람은"); // 사람은
		String s2 = saram.play(); // 밤에 놀고
		String s3 = saram.sleep1(); // 낮에 잠을 자다

		String o3 = saram.sleep();// 밤에 잘을 자다
		String o1 = saram.play("오리는"); // 오리는

		String t1 = saram.Today(); // 하루에
		//play2메소드는 Duck클래스 안에만 있는 일반메소드이므로 새로 객체생성을 통해 불러온다
		Duck ori = new Duck();
		String o2 = ori.play2(); // 낮에 놀고
		
		//배열 사용 새롭개 만들다 보니까 너무 멋이없음
		String aa[] = { "1회먹고", "3회먹고" };

		try {
			int i;
			for (i = 1; i <= 3; i++) {
				if (i == 1) {
					System.out.printf("%s %s %s %s %s \n", o1, t1, aa[0], o2, o3);
				//원래 목적은 출력문안에 i를 넣어서 1회먹고 ,3회먹고를 ("%d"+i);이런식으로 하려고 했지만 새롭게 만들면서 continue를 쓸 필요가 없어짐	
				} else if (i == 2) {
					continue;
				} else {
					System.out.printf("%s %s %s %s %s \n", s1, t1, aa[1], s2, s3);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
