package code;

public class for_each_01 {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		
		for (int i=0 ; i < arr.length ; i++) {
			arr[i] = 2*(i+1);
		}
		
		for (int i=0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("=====================");
		
//		배열 안에 있는 내용물을 꺼내볼때 쓰는 향상된 for문.
//		arr배열의 내용물을 순서대로 num변수에 담아서 뽑는 반복문.
		for (int num : arr) {
			System.out.println(num);
		}
	}

}
