import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		Scanner lo= new Scanner(System.in);
		System.out.println("���� �Է���dl��");
		int num =lo.nextInt();
		if(num<2) {
			System.out.println("���ڰ� ����");	
		}
		else if(num>9) {
			System.out.println("���ڰ� ŭ");
		}
		else {
			for(int i=0;i<=9;i++) {
				System.out.println(num+"*"+i+"="+num*i);
			}
		}
		
	}
	

}
