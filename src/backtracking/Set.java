package backtracking;
//Cho tập S = {1, 2, ..., n}.
//• Liệt kê tất cả các tập con có k phần tử của tập S

// Given a set S = {1, 2, ..., n}.
// list all subsets of size k from the set S.

import java.util.Scanner;


public class Set {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử của tập S: ");
        int n = sc.nextInt();
        int[] S = new int[n];
        System.out.print("Nhập vào giá trị các phần tử của tập S: ");
        for(int i = 0; i<n; i++){
            S[i] = sc.nextInt();
        }
        System.out.print("Nhập vào số phần tử của tập con: ");
        int k = sc.nextInt();
        int[] subSets = new int[k];
        generateSubsets(S, subSets, k, 0, 0);

    }
    public static void generateSubsets(int[] S, int[] subSets, int k, int index, int start){
        if(index == k){
            for(int i = 0; i<k; i++){
                System.out.print(subSets[i] + " ");
            }
            System.out.println();
            return;

        }
        for(int i = 0; i<S.length; i++){
            subSets[index] = S[i];
            generateSubsets(S, subSets, k, index +1, i+1);
        }
    }
}
