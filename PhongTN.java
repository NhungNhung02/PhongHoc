package STT8_LeHongNhung_23652131;

public class PhongTN extends PhongHoc{
	private String chuyenNghanh;
	private int sucChua;
	private boolean coBonRua;
	public PhongTN() {
		super();
		chuyenNghanh="";
		sucChua=0;
		coBonRua=false;
	}
	public PhongTN(String maPhong, String dayNha, double dienTich, int sobongDen, String chuyenNghanh, int sucChua,
		boolean coBonRua) {
		super(maPhong, dayNha, dienTich, sobongDen);
		this.chuyenNghanh = chuyenNghanh;
		this.sucChua = sucChua;
		this.coBonRua = coBonRua;
	}
	public String getChuyenNghanh() {
		return chuyenNghanh;
	}
	public void setChuyenNghanh(String chuyenNghanh) {
		this.chuyenNghanh = chuyenNghanh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isCoBonRua() {
		return coBonRua;
	}
	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}
	@Override
	public boolean getDatChuan() {
		return duSang()&& coBonRua;
	}
	@Override
	public String toString() {
		String bonRua=coBonRua ?"Co bon rua":"Khong co bon rua";
		return super.toString()+String.format("Chuyen nghanh:%s, Suc chua:%s, Bon Rua:%s", getChuyenNghanh(),getSucChua(),bonRua);
	}

}
