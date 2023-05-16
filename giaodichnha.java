package giaodichnhadat;

public class giaodichnha extends giaodich{
	String Loainha,Diachi;
	int choose;
	public giaodichnha() {
		super();
	}
	public giaodichnha(String Loainha,String Diachi) {
		super();
		this.Loainha=Loainha;
		this.Diachi=Diachi;
	}
	public String getLoainha() {
		return Loainha;
	}
	public void setLoainha() {
		this.Loainha=Loainha;
	}
	public String getDiachi() {
		return Diachi;
	}
	public void setDiachi() {
		this.Diachi=Diachi;
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhập địa chỉ: ");
		Diachi= sc.nextLine();
		System.out.println("Nhập loại nhà(0: cao cấp|| 1: thường): ");
		choose=sc.nextInt();
		switch(choose) {
			case 0:
				Loainha="cao cấp";
				break;
			case 1:
				Loainha="thường";
				break;
			default:
				System.out.print("chọn số không hợp lệ");
				break;
		}
	}
	@Override
	public String toString() {
		return super.toString()+"|Loại nhà: "+this.Loainha+"|Địa chỉ: "+this.Diachi;
	}
}
