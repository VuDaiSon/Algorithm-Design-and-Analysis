package recursiveAndRecursionElimination;

import java.util.Scanner;

public class BinaryRepresentationIntegerUsingRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên: ");
        int n = sc.nextInt();
        System.out.print(Change(n));
    }
    public static String Change(int n){
        if(n==0){
            return "0";
        }else {
            return Change(n / 2) + n % 2;
        }
    }
}
