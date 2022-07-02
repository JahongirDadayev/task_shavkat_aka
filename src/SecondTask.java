import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        long multiply = 1;
        first:
        for (int i = 2; i <= n; i++) {
            if (i == 2) {
                multiply *= i;
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue first;
                }
            }
            multiply *= i;
        }
        int count = 0;
        while (multiply / 10 > 0 && multiply % (10L * (count + 1)) == 0) {
            multiply /= 10;
            count++;
        }
        System.out.println("Siz kiritgan son " + count + " ta nol raqami bilan tugaydi.");
    }
}
