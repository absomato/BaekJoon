package no12400구글한스;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,n=sc.nextInt(),j;
        char[] p = new char[27];


        for(i=0;i<=n;i++) {
            String a = sc.nextLine();
            String s = " ";
            for (j = 0; j < a.length(); j++) {
                if(s.equals(a.charAt(j))) System.out.print(" ");
                else System.out.print(a.charAt(j)-'a');
            }
            System.out.println();
        }
    }
}
