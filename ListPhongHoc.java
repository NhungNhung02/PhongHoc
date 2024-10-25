package STT8_LeHongNhung_23652131;

import java.util.ArrayList;
import java.util.List;

public class ListPhongHoc {
	private List<PhongHoc>dsPhong;
	public ListPhongHoc() {
		dsPhong=new ArrayList<PhongHoc>();
	}
	public boolean themPhong(PhongHoc p) {
		if(dsPhong.contains(p))
			return false;
		dsPhong.add(p);
		return true;
		
	}
	//tim phong hoc
	public PhongHoc TimPhonghoc(String MaPhong) {
		for (PhongHoc p : dsPhong)
			if(p.getMaPhong().equalsIgnoreCase(MaPhong))
				return p;
		return null;
	}
	public List<PhongHoc>danhSachDC(){
		List<PhongHoc> dsDC= new ArrayList<PhongHoc>();
		for (PhongHoc p : dsDC) 
			if(p.getDatChuan())
				dsDC.add(p);
		return dsDC;
	}
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		for (PhongHoc p : dsPhong) 
			sb.append(p.toString()).append("\n");
		return super.toString();
	}
	public void SapXeptheoDayNha() {
		dsPhong.sort((p1,p2)->p1.getDayNha().compareTo(p2.getDayNha()));
	}
	public void SapXeptheoDienTich() {
		dsPhong.sort((p1,p2)-> Double.compare(p1.getDienTich(), p2.getDienTich()));
	}
	public void SapXepTheoSoBongDen() {
		dsPhong.sort((p1,p2)-> Integer.compare(p1.getSobongDen(), p2.getSobongDen()));
	}
	// tong so cac phong
	public int TongSoPhong() {
		return dsPhong.size();
	}
	//cap nhat lai so may tinh cac phong
	public void capNhatSoMayTinh(String maPhong, int soMayTinh) {
		PhongHoc p= TimPhonghoc(maPhong);
		if(p instanceof PhongMT)
			((PhongMT)p).setSoMayTinh(soMayTinh);
	}
	// xoa phong
	public void xoaPhong( String maPhong)
	{
		PhongHoc p= TimPhonghoc(maPhong);
				if(p!=null)
					dsPhong.remove(p);
	}
	//public List<PhongMT>dsPhongCo60MayTinh(){
	//	List<PhongMT> dsPhong60May= new ArrayList<PhongMT>();
	//	for (PhongMT p : dsPhong60May)
		//	if(p instanceof PhongMT && ((PhongMT)p).getSoMayTinh()>=60);
		//dsPhong60May.add(PhongMT);
		//return dsPhong60May;
	//}
	

}
