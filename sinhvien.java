import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
    private String maSinhVien;
    private String ten;
    private String ngaySinh;
    private double diemTrungBinh;
    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String ten, String ngaySinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    // Getters and Setters
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        maSinhVien = scanner.nextLine();
        System.out.print("Nhập tên: ");
        ten = scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        diemTrungBinh = scanner.nextDouble();
    }

    public void inThongTin() {
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Tên: " + ten);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }

    // Comparator to sort students by GPA in descending order
    public static Comparator<SinhVien> compareByGPA = new Comparator<SinhVien>() {
        @Override
        public int compare(SinhVien sv1, SinhVien sv2) {
            return Double.compare(sv2.getDiemTrungBinh(), sv1.getDiemTrungBinh());
        }
    };
}

public class main {
    public static void main(String[] args) {
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int soLuongSinhVien = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhapThongTin();
            danhSachSinhVien.add(sv);
        }

        // Sorting students by GPA in descending order
        Collections.sort(danhSachSinhVien, SinhVien.compareByGPA);

        // Printing sorted student list
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.inThongTin();
            System.out.println();
        }
    }
}
