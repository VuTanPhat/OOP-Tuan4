package giaodichnhadat;
import java.util.Scanner;
public class giaodich {
	String Magd,Ngaygd;
	long Dongia;
	float Dientich;
	Scanner sc=new Scanner(System.in);
	public giaodich() {
		super();
	}
	public giaodich(String Magd,String Ngaygd,long Dongia,float Dientich) {
		super();
		this.Magd=Magd;
		this.Ngaygd=Ngaygd;
		this.Dongia=Dongia;
		this.Dientich=Dientich;
	}
	public String getMagd() {
		return Magd;
	}
	public void setMagd(String Magd) {
		this.Magd=Magd;
	}
	public String getNgaygd() {
		return Ngaygd;
	}
	public void setNgaygd(String Ngaygd) {
		this.Ngaygd=Ngaygd;
	}
	public long getDongia() {
		return Dongia;
	}
	public void setDongia(long Dongia) {
		this.Dongia=Dongia;
	}
	public float getDientich() {
		return Dientich;
	}
	public void setDientich(float Dientich) {
		this.Dientich=Dientich;
	}
	public void nhap() {
		System.out.println("Nhập mã giao dịch: ");
		Magd=sc.nextLine();
		System.out.println("Nhập ngày giao dịch: ");
		Ngaygd=sc.nextLine();
		System.out.println("Nhập đơn giá: ");
		Dongia=Long.parseLong(sc.nextLine());
		System.out.println("Nhập diện tích: ");
		Dientich=Float.parseFloat(sc.nextLine());
	}
	@Override
	public String toString() {
		return "Mã giao dịch: "+this.Magd+"| Ngày giao dịch: "+this.Ngaygd+"| Đơn giá: "+this.Dongia+"| Diện tích: "+this.Dientich;
	}
}
