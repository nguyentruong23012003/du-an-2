import java.util.ArrayList;
import java.util.Scanner;

class Cau3 {
    String maSo;
    String loaiTietKiem;
    String hoTenKhachHang;
    int cmnd;
    String ngayMoSo;
    double soTienGui;

    // Hàm tạo đối tượng 
    public Cau3(String maSo, String loaiTietKiem, String hoTenKhachHang, int cmnd, String ngayMoSo, double soTienGui) {
        this.maSo = maSo;
        this.loaiTietKiem = loaiTietKiem;
        this.hoTenKhachHang = hoTenKhachHang;
        this.cmnd = cmnd;
        this.ngayMoSo = ngayMoSo;
        this.soTienGui = soTienGui;
    }

    @Override
    public String toString() {
        return "Ma So: " + maSo + ", Loai: " + loaiTietKiem + ", Ten: " + hoTenKhachHang + ", CMND: " + cmnd + ", Ngay Mo: " + ngayMoSo + ", So Tien Gui: " + soTienGui;
    }
}

public class QuanLyCau3 {
    static ArrayList<Cau3> cau3List = new ArrayList<>();
    
    // Hàm thêm sổ tiết kiệm
    public static void themCau3(Scanner sc) {
        System.out.print("Nhap ma so (toi da 5 ky tu): ");
        String maSo = sc.nextLine();
        for (Cau3 s : cau3List) {
            if (s.maSo.equals(maSo)) {
                System.out.println("Ma so tiet kiem da ton tai.");
                return;
            }
        }
        
        System.out.print("Nhap loai tiet kiem (toi da 10 ky tu): ");
        String loaiTietKiem = sc.nextLine();
        
        System.out.print("Nhap ho ten khach hang (toi da 30 ky tu): ");
        String hoTenKhachHang = sc.nextLine();
        
        System.out.print("Nhap CMND (dung so): ");
        int cmnd = sc.nextInt();
        
        sc.nextLine(); 
        
        System.out.print("Nhap ngay mo so (yyyy-mm-dd): ");
        String ngayMoSo = sc.nextLine();
        
        System.out.print("Nhap so tien gui: ");
        double soTienGui = sc.nextDouble();
        
        Cau3 newCau3 = new Cau3(maSo, loaiTietKiem, hoTenKhachHang, cmnd, ngayMoSo, soTienGui);
        cau3List.add(newCau3);
        System.out.println("So tiet kiem da duoc them thanh cong.");
    }

    // Hàm xóa sổ tiết kiệm
    public static void xoaCau3(Scanner sc) {
        System.out.print("Nhap ma so so muon xoa: ");
        String maSo = sc.nextLine();
        
        for (Cau3 s : cau3List) {
            if (s.maSo.equals(maSo)) {
                System.out.print("Ban co chac muon xoa so nay? (y/n): ");
                String confirmation = sc.nextLine();
                if (confirmation.equalsIgnoreCase("y")) {
                    cau3List.remove(s);
                    System.out.println("So tiet kiem da duoc xoa.");
                }
                return;
            }
        }
        
        System.out.println("Ma so khong ton tai.");
    }

    // Hàm hiển thị danh sách sổ tiết kiệm
    public static void hienThiCau3() {
        if (cau3List.isEmpty()) {
            System.out.println("Chua co so tiet kiem nao.");
        } else {
            for (Cau3 s : cau3List) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        while (true) {
            System.out.println("1. Them So Tiet Kiem");
            System.out.println("2. Xoa So Tiet Kiem");
            System.out.println("3. Hien Thi Danh Sach So Tiet Kiem");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine(); // Doc dong trong
            
            switch (choice) {
                case 1:
                    themCau3(sc);
                    break;
                case 2:
                    xoaCau3(sc);
                    break;
                case 3:
                    hienThiCau3();
                    break;
                case 4:
                    System.out.println("Thoat...");
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
}
