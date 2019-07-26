package no2565;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),i,j,cnt=0,sw = 0,k;
        int[][] p = new int[n+1][4];

        int[][] q = new int[1][4];

            for (i = 1; i <= n; i++) {
                p[i][1] = sc.nextInt();
                p[i][2] = sc.nextInt();
            }
        for(k=0;;k++) {
            sw=1;
            for (i = 1; i <= n; i++) {
                cnt = 0;
                for (j = 1; j <= n; j++) {
                    if ((p[i][1] < p[j][1] && p[i][2] > p[j][2]) || (p[i][1] > p[j][1] && p[i][2] < p[j][2])) cnt++;

                }
                p[i][3]= cnt;
            }
            for(i=1;i<=n;i++){
                for(j=1;j<=n;j++){
                    if(p[i][3]>p[j][3]){
                        q[0]=p[i];
                        p[i]=p[j];
                        p[j]=q[0];
                    }
                }
            }
            for (i = 1; i <= n; i++) {
                if(p[i][3]!=0)sw=0;
            }
            p[1][1]=0;p[1][2]=0;
            if(sw == 1)break;


        }
        System.out.println(k);
    }
}
