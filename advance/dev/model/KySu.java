package advance.dev.model;

public class KySu extends CanBo {
	private String nganhDaoTao;
	
	public KySu(String ten, int tuoi, String gioiTinh, String diaChi,String nganhDaoTao) {
		super(ten, tuoi, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
		// TODO Auto-generated constructor stub
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	@Override
	public String toString() {
		return "KySu [nganhDaoTao=" + nganhDaoTao + super.toString() + "]";
	}
	
	
	
}
