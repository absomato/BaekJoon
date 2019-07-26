package no2292벌집;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i,cnt=0,m=1;
        for(i=1;;i++){
            m+=i*6;
            if(m>=n)break;
        }
        if(n==1) System.out.println(1);
        else System.out.println(i+1);
    }
}
