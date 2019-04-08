import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		Scanner lo= new Scanner(System.in);
		System.out.println("숫자 입력이dl요");
		int num =lo.nextInt();
		if(num<2) {
			System.out.println("숫자가 작음");	
		}
		else if(num>9) {
			System.out.println("숫자가 큼");
		}
		else {
			for(int i=0;i<=9;i++) {
				System.out.println(num+"*"+i+"="+num*i);
			}
		}
		
	}
	

}
