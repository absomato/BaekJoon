package no12400구글한스;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        int n=sc.nextInt();
        sc.nextLine();
        String[] a = new String[n+1];
        int[] change = {25,8,5,19,15,3,22,24,4,21,9,7,12,2,11,18,26,20,14,23,10,16,6,13,1,17};

for(i=1;i<=n;i++) {
    a[i] = sc.nextLine();
}
for(i=1;i<=n;i++){
    System.out.print("Case #"+i+": ");
    for (j = 0; j < a[i].length(); j++) {
        if ((a[i].charAt(j) - 'a') >= 0 && (a[i].charAt(j) - 'a') <= 26)
            System.out.print((char) (change[(a[i].charAt(j) - 'a')] + 96));
        else System.out.print(" ");
    }
    System.out.println();
}
    }
}
