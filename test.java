package STT8_LeHongNhung_23652131;

import java.util.List;

public class test {
	public static void main(String[] args) {
		ListPhongHoc ph = new ListPhongHoc();
		ph.themPhong(new PhongLT("A.02", "Day nha A", 100, 30, false));
		ph.themPhong(new PhongLT("B.02", "Day nha B", 80, 40, true));
		ph.themPhong(new PhongMT("H.01", "Day nha H", 90 ,25 , 22));
		ph.themPhong(new PhongMT("H.02", "Day nha H", 70 ,50 , 25));
		ph.themPhong(new PhongTN("C.01","Day nha H", 40 , 50, null, 60, false));
		
		System.out.println("Danh sach phong hoc");
		System.out.println(ph);
		
		
	 String mp= "A.02";
	 System.out.println("Phong hoc voi ma :"+mp);
		System.out.println(ph.TimPhonghoc(mp));
		
		 List<PhongHoc> pDC =ph.danhSachDC();
		 System.out.println("Danh sach cac phong dat chuan");
		 for (PhongHoc p : pDC) {
			 System.out.println(p);
		}
		
		 ph.SapXeptheoDayNha();
		 System.out.println("Danh sach cac phong hoc theo day nha");
		ph.SapXeptheoDienTich();
		System.out.println("Danh sach cac phong hoc theo dien tich ");
		ph.SapXepTheoSoBongDen();
		System.out.println("Danh sach cac phong hoc theo so bong den");
		ph.xoaPhong("A.02");
		ph.capNhatSoMayTinh("H.02", 30);
		System.out.println("Tong so phong hoc la: "+ph.TongSoPhong());
	}
}
