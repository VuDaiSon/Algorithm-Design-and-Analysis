package DynamicProgramming;

import java.util.Scanner;
//Cho dãy số a gồm n phần tử. Tìm dãy con đơn điệu tăng dài nhất của a.
//Given a sequence of numbers a consisting of n elements. Find the longest increasing subsequence of a.

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử của dãy:");
        int a = sc.nextInt();
        System.out.print("Nhập vào các giá trị phần tử của dãy: ");
        int[] n = new int [a];
        for(int i = 0; i<a;i++){
            n[i] = sc.nextInt();
        }
        System.out.print(_lis(a,n));
    }
    public static int _lis(int a, int[] n){
        int[] L = new int[a];
        int max = 1;
        for(int i = 0; i<a; i++){
        L[i] = 1;
        }
        for(int i = 1; i<a; i++){
            for(int j = 0; j<i; j++){
                if(n[i] > n[j] && L[i] < L[j] + 1){
                    L[i] = L[j] + 1;
                }
            }
        }
        for(int i=0; i<a; i++){
            if(max<L[i]){
                max = L[i];
            }
        }
        return max;
    }


}
