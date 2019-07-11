package no10828;

import java.util.Scanner;

class stack{
    int top;
    int[] p;
    stack(int n){
        top=-1;
        p=new int[n];
    }
    void push(int n){
        p[++top]=n;
    }
    int pop(){
        if(top==-1)return -1;
        else return p[top--];
    }
    int size(){
        return top+1;
    }
    int top(){
        if(top==-1)return -1;
        else return p[top];
    }
    int empty(){
        if(top==-1)return 1;
        else return 0;
    }


}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        stack st = new stack(n);
        String command = "";
        for(int i=0;i<n;i++){
            command = sc.next();
            switch(command) {
                case "push":
                    int m = sc.nextInt();
                    st.push(m);
                    break;

                case "pop":
                    System.out.println(st.pop());
                    break;

                case "top":
                    System.out.println(st.top);
                    break;

                case "empty":
                    System.out.println(st.empty());
                    break;

                case "size":
                    System.out.println(st.size());
                    break;

            }
        }
    }

}
