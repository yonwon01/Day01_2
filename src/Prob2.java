import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]=new int [5];
		double sum=0;
		int i=0;
		System.out.println("5개의 숫자를 입력하세요 ");
		
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("평균은 "+sum/arr.length+"입니다.");
		
	}

}
