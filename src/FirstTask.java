import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int robotPositionG = 0;
        int robotPositionV = 0;
        boolean check = false;
        System.out.println("Jadvalni chizib chiqishingiz mumkin:");
        for (int i = 0; i < 7; i++) {
            String text = scanner.next();
            char[] chars = text.toCharArray();
            if (chars.length == 7) {
                for (int j = 0; j < chars.length; j++) {
                    int n = Integer.parseInt(""+chars[j]);
                    if (n == 1) {
                        robotPositionV = i;
                        robotPositionG = j;
                    }
                }
                check = true;
            } else {
                check = false;
                break;
            }
        }
        if (check) {
            int distance = Math.abs(3 - robotPositionV) + Math.abs(3 - robotPositionG);
            System.out.println("Eng yaqin masofa = " + distance);
        } else {
            System.out.println("Siz jadvalni xato to'ldirdingiz!!!");
        }
    }
}