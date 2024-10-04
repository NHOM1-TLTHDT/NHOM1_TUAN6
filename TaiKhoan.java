package BT;
import java.text.DecimalFormat;
import java.util.Scanner;
public class TaiKhoan {
    private String SoTaiKhoan;
    private String ChuTaiKhoan;
    private double SoDu;
    DecimalFormat df = new DecimalFormat("#,###.##");
    Scanner scanner = new Scanner(System.in);
    public TaiKhoan( String ChuTaiKhoan,String SoTaiKhoan, double SoDu) {
        this.ChuTaiKhoan = ChuTaiKhoan;
        this.SoTaiKhoan = SoTaiKhoan;
        this.SoDu = SoDu;
    }

    public String getChuTaiKhoan() {
        return ChuTaiKhoan;
    }

    public void setChuTaiKhoan(String ChuTaiKhoan) {
        this.ChuTaiKhoan = ChuTaiKhoan;
    }
    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }
    public double getSoDu() {
        return SoDu;
    }

    public void Rut(double rut) {
        if (rut > 0 && rut <= SoDu){
            SoDu -= rut;
            System.out.println("Ban da rut thanh cong, So Du Tai Khoan La: "+df.format(SoDu)+" VNĐ");
        }

        else
            System.out.println("So tien rut khong hop le");
    }
    public void Gui(double gui) {
        if (gui > 0) {
            SoDu += gui;
            System.out.println("Ban da nap thanh cong, So Du Tai Khoan La: " + df.format(SoDu) + " VNĐ");

        }
    }
    public void nhap(double n){
        n=scanner.nextDouble();
    }
    public static void main(String[]args){
        TaiKhoan taiKhoan = new TaiKhoan("Nguyen Van Nam","012345678",50000 );
        taiKhoan.setChuTaiKhoan("Pham Van Ly");
        taiKhoan.setSoTaiKhoan("0982375934");
        System.out.println("Ten Tai Khoan: "+taiKhoan.getChuTaiKhoan());
        System.out.println("So Tai Khoan: "+taiKhoan.getSoTaiKhoan());
        System.out.print("Nhập số tiền muốn gửi: ");

        taiKhoan.Gui(15000000);
        System.out.print("Nhập số tiền muuốn rút: ");
        taiKhoan.Rut(340000);
    }
}
