import java.util.Arrays;
import java.util.Scanner;

public class sequence_sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력받을 배열
		int p[]=new int[51];
		//입력받을 배열을 인덱스로 1씩 추가시키는 배열
		int q[]=new int [1001];
		//중복됐을 경우 1씩 추가하면서 넣어진 순서대로 더한다.
		int k[]=new int [1001];
		int n=sc.nextInt();
		int i,j,cnt=0;
		for(i=0;i<n;i++) {
			p[i]=sc.nextInt();
			q[p[i]]++;
			
		}
		for(i=0;i<n;i++) {
			for(j=1;j<=p[i];j++){
				//j가 끝 방일 때 중복할 경우
				if(j==p[i] && q[j]>1)cnt+=k[j]++;
				//그렇지 않을 경우
				else if(j!=p[i] && q[j]!=0)cnt+=q[j];
			}
			System.out.print(cnt+" ");
			cnt=0;
		}
	}
}
