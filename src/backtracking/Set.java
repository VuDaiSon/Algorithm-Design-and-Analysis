package backtracking;
//Cho tập S = {1, 2, ..., n}.
//• Liệt kê tất cả các tập con có k phần tử của tập S
//• Liệt kê các chỉnh hợp không lặp chập k của tập S

// Given a set S = {1, 2, ..., n}.
// list all subsets of size k from the set S.
// list all permutations of size k without repetition from the set S

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

    }
    public static void SubList(){

    }
}
