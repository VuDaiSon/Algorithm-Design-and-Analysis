import java.util.*;

public class CoinsChange {
    public static int[] greedy(int[] A, int amount) {
        long startTime = System.nanoTime(); // Lấy thời gian bắt đầu

        Arrays.sort(A);
        List<Integer> S = new ArrayList<>();
        int remainingAmount = amount;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] <= remainingAmount) {
                S.add(A[i]);
                remainingAmount -= A[i];
            }
            if (remainingAmount == 0)
                break;
        }
        int[] result = new int[S.size()];
        for (int i = 0; i < S.size(); i++) {
            result[i] = S.get(i);
        }

        long endTime = System.nanoTime(); // Lấy thời gian kết thúc
        long duration = (endTime - startTime) / 1000000; // Tính thời gian thực hiện (milliseconds)
        System.out.println("Thời gian thực hiện: " + duration + " milliseconds");

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền cần đổi: ");
        int amount = sc.nextInt();
        System.out.println("Nhập vào số phần tử các mệnh giá tiền: ");
        int n = sc.nextInt();
        System.out.println("Nhập vào các giá trị mệnh giá tiền: ");
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int[] result = greedy(A, amount);

        // In ra kết quả bao gồm cả các phép nhân của nó
        System.out.println("Coins needed to make change: ");
        for (int coin : result) {
            int count = amount / coin;
            System.out.println(count + " * " + coin);
            amount %= coin;
        }
    }
}
