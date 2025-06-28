import java.util.ArrayList;
import java.util.Scanner;

public class Cau1 {

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) { 
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        
        // Nhập mảng số nguyên
        System.out.print("Nhap so phan tu mang (<=50): ");
        int n = sc.nextInt();
        
        // Kiểm tra số phần tử có vượt quá 50 không
        if (n > 50) {
            System.out.println("So phan tu vuot qua 50!");
            return;
        }
        
        // Nhập phần tử vào mảng a
        System.out.println("Nhap cac phan tu cua mang :");
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        
        // Hiển thị mảng gốc
        System.out.println("Mang goc: ");
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println(); 

        // Lọc ra các số nguyên tố và cho vào mảng b
        for (int num : a) {
            if (isPrime(num)) {
                b.add(num);
            }
        }

        // Hiển thị mảng các số nguyên tố
        System.out.println("Mang cac so nguyen : ");
        for (int i = 0; i < b.size(); i++) {
            System.out.print(b.get(i) + " ");
        }
        System.out.println(); 
    }
}
