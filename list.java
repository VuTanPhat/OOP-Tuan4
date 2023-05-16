package giaodichnhadat;

import java.util.ArrayList;
import java.util.Scanner;

public class list {

	public void list() {
		ArrayList<giaodichdat>arrgiaodichdat=new ArrayList();
		ArrayList<giaodichnha>arrgiaodichnha=new ArrayList();
		int sogddat=0,sogdnha=0;
		long tongtiendat=0,tbthanhtien=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập số lượng giao dịch đất: ");
		sogddat=sc.nextInt();
		System.out.println("Nhập số lượng giao dịch nhà: ");
		sogdnha=sc.nextInt();
		System.out.println("Nhập thông tin giao dịch đất");
		for(int i=0;i<sogddat;i++) {
			System.out.println("Nhập số giao dịch đất lần thứ "+i);
			giaodichdat gddat=new giaodichdat();
			gddat.nhap();
			arrgiaodichdat.add(gddat);
		}
		System.out.println("Nhập thông tin giao dịch nhà");
		for(int i=0;i<sogddat;i++) {
			System.out.println("Nhập số giao dịch nhà lần thứ "+i);
			giaodichnha gdnha=new giaodichnha();
			gdnha.nhap();
			arrgiaodichnha.add(gdnha);
		}
		System.out.println("---Thông tin các giao dịch đất---");
		for (int i=0;i<arrgiaodichdat.size();i++) {
			System.out.print(arrgiaodichdat.get(i).toString());
		}
		System.out.println("---Thông tin các giao dịch nhà---");
		for (int i=0;i<arrgiaodichnha.size();i++) {
			System.out.println(arrgiaodichdat.get(i).toString());
		}
		for (int i=0;i<arrgiaodichdat.size();i++) {
			if(arrgiaodichdat.get(i).getLoaidat().equalsIgnoreCase("A")) {
				tongtiendat+=arrgiaodichdat.get(i).getDientich()*arrgiaodichdat.get(i).getDongia()*1.5;
			}else if(arrgiaodichdat.get(i).getLoaidat().equalsIgnoreCase("B") ||arrgiaodichdat.get(i).getLoaidat().equalsIgnoreCase("C")){
				tongtiendat+=arrgiaodichdat.get(i).getDientich()*arrgiaodichdat.get(i).getDongia();
			}
		}
		tbthanhtien = tongtiendat/arrgiaodichdat.size();
		System.out.println("Trung bình thành tiền của giao dịch đất="+tbthanhtien);
		System.out.println("Các giao dịch đất của tháng 9 năm 2013: ");
        for (int i = 0; i < arrgiaodichdat.size(); i++) {
            String[] dateGiaoDichDat = arrgiaodichdat.get(i).getNgaygd().split("/");
            if (dateGiaoDichDat[1].equals("9") && dateGiaoDichDat[2].equals("2013")) {
                System.out.println(arrgiaodichdat.get(i).toString());
            }
        }
        System.out.println("Các giao dịch nhà của tháng 9 năm 2013: ");
        for (int i = 0; i < arrgiaodichnha.size(); i++) {
            String[] dateGiaoDichNha = arrgiaodichnha.get(i).getNgaygd().split("/");
            if (dateGiaoDichNha[1].equals("9") && dateGiaoDichNha[2].equals("2013")) {
                System.out.println(arrgiaodichnha.get(i).toString());
            }
        }

	}
}
