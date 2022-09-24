package Plus;

import java.util.Scanner;

public class Plus {
    public static int main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 0;
        int sum = 0;

        System.out.println("숫자를 입력하세요.");

        n = input.nextInt();

        while (n != 0)
        {
            sum += n/10;
            n /=10;
        }

        return sum;
    }
}
