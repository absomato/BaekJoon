package no9012;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),j,i;
        String s;
        for(j=0;j<n;j++) {
            s = sc.nextLine();
            int cnt = 0;
            for (i = 0; i < s.length(); i++) {
                if (s.indexOf(i) == '(') cnt++;
                else if (s.indexOf(i) == ')') {
                    if (cnt == 0) {
                        System.out.println("NO");
                    } else cnt--;
                }

            }
            if (cnt == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
