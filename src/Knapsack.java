import java.util.Scanner;

public class Knapsack {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int weights[] = new int[n];
        int values[] = new int[n];
        int M = sc.nextInt();
        input(weights, values, n, sc);
        System.out.print(knapsack(weights, values, n, M, 0, 0,0));
    }
    public static void input(int weights[], int values[], int n, Scanner sc){
        System.out.print("Nhập vào khối lượng của từng đồ vật theo thứ tự: ");
        for(int i =0; i<n; i++){
            weights[i] = sc.nextInt();
        }
        System.out.print("Nhập vào giá trị của từng đồ vật theo thứ tự: ");
        for(int i=0; i<n; i++){
            values[i] = sc.nextInt();
        }
    }
    public static void sort(int weights[], int value[]){

        for(int i = 0; i<weights.length - 1; i ++){
            for(int j=i+1; j< weights.length; j++){
                double ratio1 = (double) value[j]/weights[j];
                double ratio2 = (double) value[i]/weights[i];
                if(ratio1>ratio2){
                    int temp = weights[i];
                    weights[i] = weights[j];
                    weights[j] = temp;

                    temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }
            }

        }
    }
    public static int knapsack(int weights[], int values[], int n, int M, int index, int currentWeight, int currentValue){
        if(index == n || currentWeight + weights[index] > M){
            return currentWeight;
        }
        int valueWithItem = knapsack(weights, values, n, M, index + 1, currentWeight + weights[index], currentValue + values[index]);
        int valueWithoutItem = knapsack(weights, values, n, M, index +1, currentWeight, currentValue);
        return Math.max(valueWithItem, valueWithoutItem);
    }

}

