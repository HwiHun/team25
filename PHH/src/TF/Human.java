package TF;
//�߻�Ŭ���� ��� ���⿡ �������̽��� ����
public abstract class Human implements Animal {
	//�������̵� �� �޼ҵ��
	@Override
	public String play() {
		String a ="�㿡 ���";
		return a;
	}

	@Override
	public String play(String word) {
		String b ="�����";
		return b;
	}
	//�߻�ȭŬ�������� �Ϲݸ޼ҵ� ��밡�� �ϹǷ� �Ϲݸ޼ҵ� ����
	public String sleep1() {
		String c = "���� ���� �ڴ�";
		return c;
	}

}
