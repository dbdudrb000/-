import java.util.Scanner;

public class Labong_07_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int num = sc.nextInt();
		int  a = 0;
		for(int i=0; i < num;i++) {
			for(int k = num; k > i; k--) {
				if(a < i) {
					System.out.println(" ");
					a++;
				}
				System.out.println("*");											
			}
			System.out.println("");
		}

	}

}
