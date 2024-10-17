import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[5];

        for(int i = 0; i<5; i++){
            System.out.println("Digite 5 números: ");
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        System.out.println("Números em ordem crescente: ");
        for (int num : nums){
            System.out.println(num + " ");
        }
    }
}