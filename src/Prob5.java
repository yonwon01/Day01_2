import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		//System.out.println(k);
		int i = 1;
		int num = 0;
		int min = 0, max = 100;
		System.out.println(min + "-" + max);
		while (true) {

			System.out.print(i + ">>");
			i++;
			num = sc.nextInt();

			if (k == num) {
				System.out.println("맞았습니다.");
				System.out.print("다시 하겠습니까?(y/n)>>");
				String answer = sc.next();
				if (answer.equals("y")) {
					main(args);
				} else if (answer.equals("n")) {
					break;
				}
			} else if (k < num) {
				System.out.println("더 낮게");
				System.out.println(min + "-" + num);
				max = num;
			} else if (k > num) {
				System.out.println("더 높게");
				System.out.println(num + "-" + max);
				min = num;
			}

		}

	}

}
