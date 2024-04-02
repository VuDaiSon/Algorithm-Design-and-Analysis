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
