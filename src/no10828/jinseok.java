import java.util.Scanner;

public class no10828 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int top=0,i,n;
        int[] p= new int[100000];

        n=sc.nextInt();
        for(i=0;i<n;i++){
            String input=sc.next();
            if(input.equals("push")){
                p[top]=sc.nextInt();
                top++;
            }
            else if(input.equals("pop")){
                if(top==0) System.out.println(-1);
                else {System.out.println(p[top-1]);
                top--;}
            }
            else if(input.equals("size")){
                System.out.println(top);
            }
            else if(input.equals("empty")){
                if(top==0) System.out.println(1);
                else System.out.println(0);
            }
            else if(input.equals("top")){
                if(top==0) System.out.println(-1);
                else System.out.println(p[top-1]);
            }

        }
    }
}
