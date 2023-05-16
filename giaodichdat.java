package giaodichnhadat;

public class giaodichdat extends giaodich {
	String Loaidat;
	public giaodichdat() {
		super();
	}
	public giaodichdat(String Loaidat) {
		super();
		this.Loaidat=Loaidat;
	}
	public String getLoaidat() {
		return Loaidat;
	}
	public void setLoaidat(String Loaidat) {
		this.Loaidat=Loaidat;
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhập loại đất( A/B/C): ");
		Loaidat=sc.nextLine();
	}
	@Override
	public String toString() {
		return super.toString()+"|Loại đất: "+this.Loaidat;
	}
}
