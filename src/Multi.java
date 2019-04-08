import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		Scanner lo= new Scanner(System.in);
		System.out.println("숫자 입력이dl요");
		int num =lo.nextInt();
		
		for(int i=0;i<=9;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
	

}
