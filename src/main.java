import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// ���������� �����
		
		Scanner sc = new Scanner(System.in);
		// ����������
		// ���� 1: ����, 2: ����, 3: ��
		System.out.println("���������� ����");
		//�¼�
		int victory = 0;
		int inputRps = 0;
		while(victory<3) {
			System.out.println("���ڸ� �Է����ּ���");
			System.out.println("1: ����, 2: ����, 3: ��");
			System.out.print("�Է� : ");
			String inputStr = sc.nextLine();
			
			if(inputStr.equals("����")) {
				inputRps=1;
			}else if(inputStr.equals("����")) {
				inputRps=2;
			}else if(inputStr.equals("��")) {
				inputRps=3;
			}
			
			
			
			int cpuRps = (int) (Math.random() * 3 + 1);
			System.out.println("��ǻ�� : " + cpuRps);
			System.out.println("");

			if (inputRps == cpuRps) {
				System.out.println("����");
			} else {
				// ����� ������� => �̱�ų�, ���ų�
				if ((inputRps == 1 && cpuRps == 2) || (inputRps == 2 && cpuRps == 3)
						|| (inputRps == 3 && cpuRps == 1)) {
					System.out.println("����");
				} else {
					System.out.println("�̰��");
					victory++;
				}
			}
		}
	}
}
