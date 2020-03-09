package code;

public class test_01 {

	public static void main(String[] args) {
//		1~200사이의 홀수 저장 
		int[] array = new int[100];
		
		for (int i=0 ; i < array.length ; i++) {
			array[i] = 2*i + 1;
		}
		for (int num : array) {
			System.out.println(num);
		}
	}

}
