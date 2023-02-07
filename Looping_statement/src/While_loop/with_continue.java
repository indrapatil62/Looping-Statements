package While_loop;

public class with_continue {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			if(i==7) {
				continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
