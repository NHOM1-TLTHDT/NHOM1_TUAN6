package Bai1;

import java.util.Scanner;

public class hinhChuNhat {
    public double chieuDai;
    public double chieuRong;
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        chieuRong = scanner.nextDouble();
    }
    public void in() {
        System.out.println("Chiều dài: " + chieuDai);
        System.out.println("Chiều rộng: " + chieuRong);
        System.out.println("Diện tích: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }
}

