import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Cho phương trình có dạng 'a * x + b = 0', Nhập vào các tham số:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("Phương trình có nghiệm: " + solution);
        } else {
            if (b == 0) {
                System.out.print("Phương trình vô số nghiệm !");
            } else {
                System.out.print("Phương trình vô nghiệm!");
            }
        }
    }
}