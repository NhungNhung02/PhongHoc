package STT8_LeHongNhung_23652131;

public class PhongLT extends PhongHoc {
	private boolean coMayChieu;

	public PhongLT() {
		super();
		this.coMayChieu = false;	
		}

	public PhongLT(String maPhong, String dayNha, double dienTich, int sobongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, sobongDen);
		this.coMayChieu = coMayChieu;
	}

	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	@Override
	public boolean getDatChuan() {
		return duSang()&& coMayChieu;
	}
	@Override
	public String toString() {
		String MayChieu= coMayChieu? " Co may chieu":"Khong co may chieu";
		return super.toString()+ String.format("May Chieu: %s", MayChieu);
	}

}
