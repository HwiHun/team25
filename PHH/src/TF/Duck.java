package TF;
//Human Ŭ������ ��ӹ޾���
public class Duck extends Human {
	//�������̵��� �޼ҵ��
	//String play(String word)�޼ҵ忡 �̸� ���� �ְ� �Ϸ��� �õ��� ������ �����Ҹ��� ������ ���� ���ؼ� �뼱 ����
	@Override
	public String play(String word) {
		String a = word;
		return a;
	}

	@Override
	public String sleep() {
		String a = "�㿡 ���� �ڴ�";
		return a;
	}

	@Override
	public String Today() {
		String b = "�Ϸ翡";
		return b;
	}
	//DuckŬ������ �Ϲ� �޼ҵ�
	public String play2() {
		String c = "���� ���";
		return c;
	}

}
