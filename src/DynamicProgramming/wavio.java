package DynamicProgramming;
//(Dãy số WAVIO) Dãy số Wavio là dãy số nguyên thỏa mãn các tính chất: các
//phần tử đầu sắp xếp thành 1 dãy tăng dần đến 1 phần tử đỉnh sau đó giảm dần. Ví dụ dãy số
//1 2 3 4 5 2 1 là 1 dãy Wavio độ dài 7. Cho 1 dãy gồm N số nguyên, hãy chỉ ra một dãy con
//Wavio có độ dài lớn nhất trích ra từ dãy đó.

//(WAVIO Sequence) A WAVIO sequence is an integer sequence that satisfies the following properties:
// the initial elements form an increasing sequence until a peak element, followed by a decreasing sequence.
// For example, the sequence 1 2 3 4 5 2 1 is a WAVIO sequence of length 7.
// Given a sequence of N integers, identify the longest WAVIO subsequence from that sequence.

import java.util.Scanner;


public class wavio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào độ dài giá trị của dãy: ");
        int n = sc.nextInt();
        System.out.print("Nhập vào phần tử đỉnh");
        int i = sc.nextInt();
        generate(n, i);

    }

    public static void generate(int n, int i) {
        if (i == 1) {
            return;
        }
        for (int j = 1; j <= i; j++) {
            System.out.print(j +" ");
        }
        for (int c = i - 1; c >= 1; c--) {
            System.out.print(c + " ");
        }
    }
}
