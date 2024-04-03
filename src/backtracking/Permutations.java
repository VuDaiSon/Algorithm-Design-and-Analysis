package backtracking;
//Cho tập S = {1, 2, ..., n}.
//• Liệt kê các chỉnh hợp không lặp chập k của tập S

// Given a set S = {1, 2, ..., n}.
// list all permutations of size k without repetition from the set S

import java.util.Scanner;

public class Permutations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử của tập S: ");
        int n = sc.nextInt();
        int[] S = new int[n];
        System.out.print("Nhập vào giá trị các phần tử của tập S: ");
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }
        System.out.print("Nhập vào số phần tử của tập con: ");
        int k = sc.nextInt();
        int[] permutations = new int[k];
        boolean[] check = new boolean[n];
        generatePermutations(S, permutations, check, n, k, 0);
    }

    public static void generatePermutations(int[] S, int[] permutations, boolean[] check, int n, int k, int index) {
        if (index == k) {
            for (int i = 0; i < k; i++) {
                System.out.print(permutations[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                permutations[index] =  S[i];
                check[i] = true;
                generatePermutations(S,permutations,check,n,k,index+1);
                check[i] = false;
            }
        }
    }

}
