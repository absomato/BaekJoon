package no2798블랙잭;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),i,j,k,max=-9;
        int[] p= new int[n];
        for(i=0;i<n;i++){
            p[i]=sc.nextInt();

        }
        Arrays.sort(p);
        for(i=n-1;i>=2;i--){
            for(j=i-1;j>=1;j--){
                for(k=j-1;k>=0;k--){
                    if(p[i]+p[j]+p[k]<=m) {
                        if(max<p[i]+p[j]+p[k])max=p[i]+p[j]+p[k];
                    }
                }
            }
        }
        System.out.println(max);
    }
}
