public class GetLoopy {
    public static void main(String[] args) {
        System.out.println("Task 5:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}