package code;

import java.util.Scanner;

public class array_01 {

	public static void main(String[] args) {
		int[] numbers = new int[10]; // 정수 10개를 저장할 배열 numbers를 생성.
	
		numbers[0] = 1; // 맨 앞칸에는 1대입 
		numbers[9] = 10; // 마지막칸에는 10을 대입
		
//		각각의 칸에 1~10까지의 값을 대입.
		for (int i=0; i < 10 ; i++) {
			numbers[i] = i+1;
		}
		System.out.println(numbers[5]); //5번칸 (여섯번째) 에 들어있는 데이터 출력
//		numbers에 들어있는 모든 값들을 출력.
		for (int i=0 ; i < 10 ; i++) {
			System.out.println(numbers[i]);
		}
		
		int[] arr1 = new int[50];
		
		for (int i=0 ; i < arr1.length ; i++) {
			arr1[i] = i*2;
		}
		System.out.println("배열 크기 값 : " + arr1.length);	
		
		int[] arr = {2,4,6,8,10}; //2,4,6,8,10이 들어있는 다섯칸짜리 배열을 초기화.
		
		System.out.println(arr[arr.length-1]); //마지막칸에 들어있는 값
		System.out.println(arr.length); // 배열의 크기
		
//		arr의 값을 바꾸려고 할때, arr = {1,3,5,7,9};는 할수없음! => 초기화 할때만 사용 가능한 문법
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("만들 배열의 칸 수 입력 : ");
		int arraySize = scan.nextInt();
		
		int[] array2 = new int[arraySize];
		
		System.out.println("array2의 길이 : " + array2.length);		
	}

}
