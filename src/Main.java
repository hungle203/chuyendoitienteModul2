import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VND = 23.000;
        double USD;
        System.out.println("Nhập tiền bạn muốn đổi");
        USD = scanner.nextDouble();
        double quyDoi = USD * 23000;
        System.out.print("Giá trị quy đổi là: " + quyDoi);
    }
}
