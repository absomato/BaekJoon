import java.util.Arrays;
import java.util.Scanner;

public class sequence_sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�Է¹��� �迭
		int p[]=new int[51];
		//�Է¹��� �迭�� �ε����� 1�� �߰���Ű�� �迭
		int q[]=new int [1001];
		//�ߺ����� ��� 1�� �߰��ϸ鼭 �־��� ������� ���Ѵ�.
		int k[]=new int [1001];
		int n=sc.nextInt();
		int i,j,cnt=0;
		for(i=0;i<n;i++) {
			p[i]=sc.nextInt();
			q[p[i]]++;
			
		}
		for(i=0;i<n;i++) {
			for(j=1;j<=p[i];j++){
				//j�� �� ���� �� �ߺ��� ���
				if(j==p[i] && q[j]>1)cnt+=k[j]++;
				//�׷��� ���� ���
				else if(j!=p[i] && q[j]!=0)cnt+=q[j];
			}
			System.out.print(cnt+" ");
			cnt=0;
		}
	}
}
