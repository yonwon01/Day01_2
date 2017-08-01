
public class Prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
		
	}

	public static void printCharArray(char a[]) {
		System.out.println(a);

	}
	
	public static void replaceSpace(char a[]) {
		
		int i=0;
		for(i=0;i<a.length;i++) {
			if(a[i]==' ') {
				a[i]=',';
			}
		}
		//System.out.println(a);
	}
	
}
