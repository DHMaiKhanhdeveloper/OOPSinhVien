package uit.practice;

import java.util.ArrayList;

public class TruongHoc {
	
	private DanhSachSinhVien  dsSV ;

	public DanhSachSinhVien getDsSV() {
		return dsSV;
	}

	public void setDsSV(DanhSachSinhVien dsSV) {
		this.dsSV = dsSV;
	}

	public TruongHoc(DanhSachSinhVien dsSV) {
		super();
		this.dsSV = dsSV;
	}

	public TruongHoc() {
		super();
		dsSV = new DanhSachSinhVien();
	}
	public void themSinhVien(SinhVien sv) {
		this.dsSV.themSinhVien(sv);
	}
	
	public void nhap() {
		SinhVien sv = new SinhVien("Lan", 1, 9.2f, 9, 9);
		this.dsSV.themSinhVien(sv);

		sv = new SinhVien("Hùng", 2, 4.2f, 4, 5.3f);
		this.dsSV.themSinhVien(sv);

		sv = new SinhVien("Lan", 3, 7.2f, 4, 9);
		this.dsSV.themSinhVien(sv);

		sv = new SinhVien("Yến", 4, 3.2f, 4, 4);
		this.dsSV.themSinhVien(sv);

		sv = new SinhVien("Toàn", 5, 9.2f, 10, 10);
		this.dsSV.themSinhVien(sv);

		sv = new SinhVien("Hữu", 6, 7.2f, 7, 6);
		this.dsSV.themSinhVien(sv);

		sv = new SinhVien("Lý", 7, 3.2f, 3, 3);
		this.dsSV.themSinhVien(sv);

		sv = new SinhVien("Trung", 8, 9.2f, 10, 10);
		this.dsSV.themSinhVien(sv);

		sv = new SinhVien("Quyền", 9, 7.2f, 7, 8);
		this.dsSV.themSinhVien(sv);

		sv = new SinhVien("Linh", 10, 5.2f, 5, 6);
		this.dsSV.themSinhVien(sv);
	}
	
	
	public void xuat() {
		this.dsSV.xuat();
	}
	
	public void tinhDTB() {
		this.dsSV.tinhDTB();
	}
	
	public void xepLoai() {
		this.dsSV.xepLoai();
	}
	public ArrayList<SinhVien> diemTBLonNhat(){
		return  this.dsSV.diemTBLonNhat(); // trả về return tại DSSV có  ArrayList 
	}
	
	public ArrayList<SinhVien> dsSinhVienYeu(){
		return  this.dsSV.dsSinhVienYeu(); // trả về return tại DSSV có  ArrayList 
	}
	
	public void xuatHelper(ArrayList<SinhVien> list) {
		for(SinhVien sv :list) {
			sv.xuat();
		}
	}
	
	public ArrayList<SinhVien> timSVTheoTen(String tenSV) {
//		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
//		for(SinhVien sv: dssvToanTruong.getListSV()) {
//			if(sv.getTenSV().equalsIgnoreCase(tenSV)) {
//				list.add(sv);
//			}
//		}
//		return list;
		return dsSV.timSVTheoTen(tenSV);
	}
	
	public SinhVien timSVTheoMa(int ma) {
		return dsSV.timSVTheoMa(ma);
	}

	private void xuatLine() {
		System.out.println(
				"===================================================================================================================");
	}

	private String formatCell(String paddLeft, String title, String paddRight) {
		return String.format(paddLeft, " ") + title + String.format(paddRight, " ");
	}

	private void xuatRowHeader() {
		String paddString1 = "%3s";
		String paddString2 = "%4s";
		String paddString3 = "%5s";
		String paddString4 = "%6s";

		xuatLine();
		String text;
		text = "||" + formatCell(paddString1, "STT", paddString1) + "|";
		text += formatCell(paddString2, "Mã SV", paddString2)+ "|";
		text += formatCell(paddString3, "Tên SV", paddString2)+ "|";
		text += formatCell(paddString3, "Toán", paddString2)+ "|";
		text += formatCell(paddString3, "Lý", paddString4)+ "|";
		text += formatCell(paddString3, "Hóa", paddString3)+ "|";
		text += formatCell(paddString3, "ĐTB", paddString3)+ "|";
		text += formatCell(paddString2, "Xếp Loại", paddString1) + "||";
		System.out.println(text);
		xuatLine();

	}

	private void xuatCellThuTu(int i) {
		String paddLeft = "%3s";
		String paddRight = "%-6s";
		String text = "||" + String.format(paddLeft, " ") + String.format(paddRight, "" + i) + "|";
		System.out.print(text);
	}

	public void xuatTheoFormat(ArrayList<SinhVien> list) {
		xuatRowHeader();
		int i = 1;
		for (SinhVien sv : list) {
			xuatCellThuTu(i);
			sv.xuatRowFormat();
			i++;
		}
		xuatLine();
	}
	
}
