import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money = 0;
		System.out.print("금액 :");
		money = sc.nextInt();
		int m50000 = 0, m10000 = 0, m5000 = 0, m1000 = 0, m500 = 0, m100 = 0, m50 = 0, m10 = 0, m5 = 0, m1 = 0;
		while (money - 50000 > 0) {

			money = money - 50000;
			m50000++;

		}

		while (money - 10000 > 0) {
			money = money - 10000;
			m10000++;
			
		}
		while(money-5000>0) {
			
			money=money-5000;
			m5000++;
		}
		while(money-1000>0) {
			money=money-1000;
			m1000++;
		}
		while(money-500>0) {
			money=money-500;
			m500++;
		}
		while(money-100>0) {
			money=money-100;
			m100++;
		}
		while(money-50>0) {
			money=money-50;
			m50++;
		}
		while(money-10>0) {
			money=money-10;
			m10++;
		}
		while(money-5>0) {
			money=money-5;
			m5++;
		}
		while(money-1>=0) {
			money=money-1;
			m1++;
		}
		System.out.println("50000원: "+m50000+"개");
		System.out.println("10000원: "+m10000+"개");
		System.out.println("5000원: "+m5000+"개");
		System.out.println("1000원: "+m1000+"개");
		System.out.println("500원: "+m500+"개");
		System.out.println("100원: "+m100+"개");
		System.out.println("50원: "+m50+"개");
		System.out.println("10원: "+m10+"개");
		System.out.println("5원: "+m5+"개");
		System.out.println("1원: "+m1+"개");
		

	}

}
