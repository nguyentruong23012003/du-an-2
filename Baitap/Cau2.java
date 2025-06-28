import java.util.Scanner;

public class Cau2 {

    // Hàm kiểm tra 2 phân số có bằng nhau không
    public static boolean areFractionsEqual(int num1, int denom1, int num2, int denom2) {
        // Kiểm tra bằng nhau thông qua phép nhân chéo
        return num1 * denom2 == num2 * denom1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập phân số đầu tiên
        System.out.print("Nhap tu so va mau so cua phan tu thu 1 : ");
        int num1 = sc.nextInt();
        int denom1 = sc.nextInt();
        
        // Nhập phân số thứ hai
        System.out.print("Nhap tu so va mau so cua phan tu thu 2: ");
        int num2 = sc.nextInt();
        int denom2 = sc.nextInt();
        
        // Kiểm tra và hiển thị kết quả
        if (areFractionsEqual(num1, denom1, num2, denom2)) {
            System.out.println("Hai phan so bang nhau.");
        } else {
            System.out.println("Hai phan so khong bang nhau.");
        }
    }
}
