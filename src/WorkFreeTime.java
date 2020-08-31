import java.util.Scanner;

public class WorkFreeTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        if (time >= 12 && time <= 13) {
            System.out.println("It's lunch break.");
        } else if (time >= 8 && time <= 16) {
            System.out.println("It's work time.");
        } else {
            System.out.println("It's free time.");
        }
    }
}
