package TF;

public class Exam {

	public static void main(String[] args) {
		//��ĳ������ ���� ��ü ����
		Human saram = new Duck();
		//��ü������ ����
		String s1 = saram.play("�����"); // �����
		String s2 = saram.play(); // �㿡 ���
		String s3 = saram.sleep1(); // ���� ���� �ڴ�

		String o3 = saram.sleep();// �㿡 ���� �ڴ�
		String o1 = saram.play("������"); // ������

		String t1 = saram.Today(); // �Ϸ翡
		//play2�޼ҵ�� DuckŬ���� �ȿ��� �ִ� �Ϲݸ޼ҵ��̹Ƿ� ���� ��ü������ ���� �ҷ��´�
		Duck ori = new Duck();
		String o2 = ori.play2(); // ���� ���
		
		//�迭 ��� ���Ӱ� ����� ���ϱ� �ʹ� ���̾���
		String aa[] = { "1ȸ�԰�", "3ȸ�԰�" };

		try {
			int i;
			for (i = 1; i <= 3; i++) {
				if (i == 1) {
					System.out.printf("%s %s %s %s %s \n", o1, t1, aa[0], o2, o3);
				//���� ������ ��¹��ȿ� i�� �־ 1ȸ�԰� ,3ȸ�԰� ("%d"+i);�̷������� �Ϸ��� ������ ���Ӱ� ����鼭 continue�� �� �ʿ䰡 ������	
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
