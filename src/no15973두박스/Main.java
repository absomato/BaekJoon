package no15973두박스;

import java.util.Scanner;

public class Main {

    static int[][] p = new int[5][5];

    public static int point() {
        if (p[1][1] == p[4][1] && p[1][2] == p[4][2] ||
                p[2][1] == p[3][1] && p[2][2] == p[3][2] ||
                p[1][1] == p[4][1] && p[2][2] == p[3][1] ||
                p[2][1] == p[3][1] && p[1][2] == p[4][2]) return 1;

        else return 0;
    }
    public static int face(){
        if(p[1][1]<= p[3][1] && p[2][1] >=p[4][1])
    }
    public static int line(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 2; j++) {
                p[i][j] = sc.nextInt();
            }


        }
        if(point()==1) System.out.println("POINT");

    }
}
