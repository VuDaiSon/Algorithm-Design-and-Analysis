package branchAndBound;
//Bài toán chia thưởng: Có m phần thưởng được thưởng cho n học sinh giỏi có xếp hạng theo thứ tự từ 1 đến n.
// Hỏi có bao nhiêu cách chia các phần thưởng thoả mãn các điều kiện sau:
//(i) Học sinh giỏi hơn có số phần thưởng không ít hơn bạn kém hơn;
//(ii) m phần thưởng phải chia hết cho các học sinh.

//The award distribution problem: There are m awards given to n outstanding students ranked in order from 1 to n.
// Determine how many ways there are to distribute the awards satisfying the following conditions:
//(i) A student with a higher rank receives no fewer awards than a lower-ranked student.
//(ii) The total number of awards must be divisible among the students.
import java.util.Scanner;

public class Award {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số phần thưởng: ");
        int m = sc.nextInt();
        System.out.print("Nhập vào số học sinh: ");
        int n = sc.nextInt();

        if (m <= 0 || n <= 0 || m < n) {
            System.out.println("Không thể chia thưởng!");
        }
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            rank[i] = i + 1;
        }

        int[] awards = new int[n];
        distributeAwards(rank, awards, m, n, 0, 1);

    }

    public static void distributeAwards(int[] rank, int[] awards, int m, int n, int index, int minAward) {
        if (n == 0) {
            if (m == 0) { // Kiểm tra xem m có bằng 0 không
                printDistribution(rank, awards);
            }
            return;
        }

        for (int i = minAward; i <= m; i++) {
            awards[index] = i;
            distributeAwards(rank, awards, m - i, n - 1, index + 1, i);
        }
    }

    public static void printDistribution(int[] rank, int[] awards) {
        count++;
        System.out.print("Cách " + count + ": ");
        for (int i = 0; i < awards.length - 1; i++) {
            System.out.print(rank[i] + ":" + awards[i] + ", ");
        }
        System.out.println(rank[awards.length - 1] + ":" + awards[awards.length - 1]);
    }
}
