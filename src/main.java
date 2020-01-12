import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// 가위바위보 만들기
		
		Scanner sc = new Scanner(System.in);
		// 가위바위보
		// 숫자 1: 가위, 2: 바위, 3: 보
		System.out.println("가위바위보 시작");
		//승수
		int victory = 0;
		int inputRps = 0;
		while(victory<3) {
			System.out.println("숫자를 입력해주세요");
			System.out.println("1: 가위, 2: 바위, 3: 보");
			System.out.print("입력 : ");
			String inputStr = sc.nextLine();
			
			if(inputStr.equals("가위")) {
				inputRps=1;
			}else if(inputStr.equals("바위")) {
				inputRps=2;
			}else if(inputStr.equals("보")) {
				inputRps=3;
			}
			
			
			
			int cpuRps = (int) (Math.random() * 3 + 1);
			System.out.println("컴퓨터 : " + cpuRps);
			System.out.println("");

			if (inputRps == cpuRps) {
				System.out.println("비겼다");
			} else {
				// 비기지 않은경우 => 이기거나, 지거나
				if ((inputRps == 1 && cpuRps == 2) || (inputRps == 2 && cpuRps == 3)
						|| (inputRps == 3 && cpuRps == 1)) {
					System.out.println("졌다");
				} else {
					System.out.println("이겼다");
					victory++;
				}
			}
		}
	}
}
