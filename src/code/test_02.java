package code;

import java.util.Scanner;

public class test_02 {

	public static void main(String[] args) {
		int[] userInputNumbers = new int[6];
		Scanner scan = new Scanner(System.in);
		
		for (int i=0 ; i < userInputNumbers.length ; i++) {
			while (true) {
				System.out.print((i+1) + "번째 숫자 입력 : ");
				int tempInput = scan.nextInt();
				
				boolean isRangeOk = false;
				
				if (1<=tempInput && tempInput <= 45) {
					isRangeOk = true;
				}
				else {
					isRangeOk = false;
					System.out.println("1~45의 숫자만 입력 가능합니다.");
					System.out.println("다시 입력해주세요.");
				}
				
				boolean isDuplOk = true; // 중복검사를 통과했다고 전제.
				
//				실제 중복 검사.
				for (int num : userInputNumbers) {
					if (num == tempInput) {
						isDuplOk = false;
						System.out.println("이미 입력한 값입니다.");
						System.out.println("다시 입력해주세요.");
						break; //중복값을 하나라도 찾으면 뒤는 볼 필요가 없다.
						
					}
				}
				
				if (isRangeOk && isDuplOk) {
					userInputNumbers[i] = tempInput;
					break;
				}
				
			}
			
		}
		
		for (int num : userInputNumbers) {
			System.out.println(num);
		}
		

	}

}
