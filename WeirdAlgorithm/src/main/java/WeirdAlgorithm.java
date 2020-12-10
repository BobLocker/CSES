import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        String result = executeWeirdAlgorithm(val);

        System.out.println(result);
    }

    public static String executeWeirdAlgorithm(int val) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(val);
            if (val == 1)
                break;
            if (val % 2 == 0)
                val /= 2;
            else
                val = val*3 + 1;
            sb.append(" ");
        }

        return sb.toString();
    }
}
