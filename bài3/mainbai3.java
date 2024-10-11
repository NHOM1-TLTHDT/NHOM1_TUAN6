package bài3;

import java.util.Scanner;

public class mainbai3 {
    public static void main(String[] args){
        taiKhoan tk=new taiKhoan();
        tk.nhapThongTinTaiKhoan();

        System.out.println("chon phuong thuc\n 1.gui tien \n 2. rut tien");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        switch (n){
            case 1:
                System.out.println("so tien sau khi gui la "+tk.guitien(tk.getSodu())+"VND");
            break;
            case 2:
                System.out.println("so tien sau khi rut la "+tk.ruttien(tk.getSodu()));
            default:
                System.out.println("sai phuong thuc nhap");
        }



    }
}
