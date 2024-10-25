package STT8_LeHongNhung_23652131;

public class PhongMT extends PhongHoc {
	private int soMayTinh;

	public PhongMT() {
		super();
		this.soMayTinh = 0	;
				}

	public PhongMT(String maPhong, String dayNha, double dienTich, int sobongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, sobongDen);
		this.soMayTinh = soMayTinh;
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	@Override
	public boolean getDatChuan() {
		return duSang()&& getDienTich()/getSoMayTinh()<=1.5;
	}
	@Override
	public String toString() {
		return super.toString()+String.format("So may tinh: %s", soMayTinh);
	}

}
