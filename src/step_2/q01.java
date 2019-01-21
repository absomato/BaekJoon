package step_2;

import java.util.Scanner;

public class q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int min=9999;
		int i,j;
			for(j=0;j<=a/5;j++) {
				System.out.println((a-(j*5))/3);
				if((a-(j*5))/3==0) {
					if(min>j+(a-(j*5))/3)min=j+(a-(j*5))/3;
				
				
			}
		}
		if(min==9999)System.out.println("-1");
		else System.out.println(min);
	}

}
