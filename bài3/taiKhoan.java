package bài3;

import java.util.Scanner;

public class taiKhoan {
    private int sotaikhoan;
    private String chutaikhoan;
   private double sodu;
    Scanner sc = new Scanner(System.in);

    public taiKhoan() {
        this.sotaikhoan = sotaikhoan;
        this.chutaikhoan = chutaikhoan;
        this.sodu = sodu;
    }

    public int getSotaikhoan() {
        return sotaikhoan;
    }

    public String getChutaikhoan() {
        return chutaikhoan;
    }

    public double getSodu() {
        return sodu;
    }

    public void nhapThongTinTaiKhoan() {
        System.out.print("Nhap ten chu tai khoan: ");
        this.chutaikhoan = sc.nextLine();
        System.out.print("Nhap so tai khoan: ");
        this.sotaikhoan = sc.nextInt();
        System.out.print("Nhap so du: ");
        this.sodu = sc.nextDouble();
        sc.nextLine(); // Consume newline left-over
    }
    public double guitien(double sodu){
        System.out.println("nhap so tien can gui");
        Scanner sc=new Scanner(System.in);
        double gui=sc.nextDouble();
        sodu= gui+sodu;
        return sodu;
    }
    public double ruttien(double sodu){
        System.out.println("nhap so tien can rut");
        Scanner sc=new Scanner(System.in);
        double rut= sc.nextDouble();
        if(rut>0&&rut<=sodu)
            sodu=sodu-rut;
        else
            System.out.println("khong du tien trong tai khoan");
        return sodu;
    }
    public void kiemtrasodu(){
        System.out.println("so du trong tai khoan la: "+sodu+"VND");
    }
}
