package no2156;

import java.util.Scanner;

public class Main{
    static int Max(int a,int b,int c){
        if(b>c){
            if(a>b)return a;
            else return b;
        }
        if(a>c)return a;
        else return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int[] a = new int[n+1];
        int[] d = new int[n+1];
        for(i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        d[1]=a[1];
        if(n>1) d[2]=a[1]+a[2];
        for(i=3;i<=n;i++){
            d[i]=Max(d[i-1],d[i-2]+a[i],d[i-3]+a[i-1]+a[i]);
        }
        System.out.println(d[n]);
        sc.close();
    }
}