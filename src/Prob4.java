import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = null;
		char[] array;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		array = reverse(str);
		printCharArray(array);

	}

	public static char[] reverse(String str) {
		// System.out.println(str.length());
		char[] arr = new char[str.length()];
		int i = 0, k = 0;
		for (i = str.length() - 1; i >= 0; i--) {
			arr[k] = str.charAt(i);
			k++;
			// System.out.print(arr[i]);
		}

		return arr;

	}

	public static void printCharArray(char[] array) {

		System.out.println(array);
	}
}
