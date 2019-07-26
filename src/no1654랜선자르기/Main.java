package no1654랜선자르기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt(),n=sc.nextInt();
        int i;
        long[] p = new long[10001];
        long max=-999;
        for(i=0;i<k;i++){
            p[i]=sc.nextLong();
            if(max<p[i])max=p[i];
        }
        long left=1,right=max,mid,dab=0;
        int su=0;

        while(left<=right){
            su=0;
            mid=(left+right)/2;
            for(i=0;i<k;i++){
                su+=p[i]/mid;
            }
            if(su>=n){
                if(dab<mid)dab=mid;
                left=mid+1;
            }
            else right=mid-1;
        }
        System.out.println(dab);
    }
}
