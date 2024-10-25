package STT8_LeHongNhung_23652131;

import java.util.Objects;

public abstract class PhongHoc {
	protected String maPhong, dayNha;
	protected double dienTich;
	protected int sobongDen;
	public PhongHoc() {
		this("","",0.0,0);
	}
	public PhongHoc(String maPhong, String dayNha, double dienTich, int sobongDen) {
		setMaPhong(maPhong);
		setDayNha(dayNha);
		setDienTich(dienTich);
		setSobongDen(sobongDen);
		
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		if (maPhong==null) {
			throw new RuntimeException("Ma phong khong duoc de trong");
			
		}
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		if (dayNha==null) {
			throw new RuntimeException("Day nha khong duoc de trong");
			
		}
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		if (dienTich<=0) {
			throw new RuntimeException("Dien tich phai lon hon 0");
			
		}
		this.dienTich = dienTich;
	}
	public int getSobongDen() {
		return sobongDen;
	}
	public void setSobongDen(int sobongDen) {
		if (sobongDen<=0) {
			throw new RuntimeException("So Bong den phai lon hon 0");
			
		}
		this.sobongDen = sobongDen;
	}
	public abstract boolean getDatChuan();
	public boolean duSang() {
		return getDienTich()/getSobongDen()<=10;
	}
	@Override
	public String toString() {
		String s="";
		s+= String.format("|%10s |%10s |%10s |%10s", getMaPhong(),getDayNha(),getDienTich(),getSobongDen());
		return s;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	

}
