package DynamicProgramming;

import java.util.Scanner;
//Bài toán đếm số tổ hợp.
//The combination counting problem.

public class CombinationCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử cùa tập hợp con: ");
        int r = sc.nextInt();
        System.out.print("Nhập vào số phần tử của tổ hợp: ");
        int n = sc.nextInt();
        System.out.print("Tổng số tổ hợp bằng: ");
        System.out.print(choose(r,n));
    }
    public static int choose(int r, int n){
        int c[][] = new int[r+1][n+1];
        for(int i = 0; i<= r; i++){
            c[i][i] = 1;
        }
        for(int i = 0; i<=n-r; i++){
            c[0][i] = 1;
        }
        for(int i =1; i<=r; i++){
            for(int j = i+1; j<=n - r + i; j++){
                c[i][j] = c[i-1][j-1]+ c[i][j-1];
            }
        }
        return c[r][n];
    }

}
