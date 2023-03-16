package uit.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
	
	private ArrayList<SinhVien> listSV;
	
	//private ArrayList<SinhVien> listSV2 = new ArrayList<SinhVien>();
	// cách này oke những theo dự án lớn có hàng trăm danh sách sinh viên
	// để trên đó chưa thực sự sử dụng đã new

	public ArrayList<SinhVien> getListSV() {
		return listSV;
	}

	public void setListSV(ArrayList<SinhVien> listSV) {
		this.listSV = listSV;
	}

	public DanhSachSinhVien(ArrayList<SinhVien> listSV) {
		super();
		this.listSV = listSV;
	}
	// khi nào sử dụng mới new danh sách sinh viên
	public DanhSachSinhVien() {
		this.listSV = new ArrayList<SinhVien>();
	}
	
	public void nhap(Scanner scan) {
		for (SinhVien sv : this.listSV) {
			sv.nhap(scan);
		}
	}

	public void themSinhVien(SinhVien sv) {
		this.listSV.add(sv);
	}

	public void xuat() {
		for (SinhVien sv : this.listSV) {
			sv.xuat();
		}
	}


	public void tinhDTB() {
		for (SinhVien sv : this.listSV) {
			sv.tinhDTB();
		}
	}

	public void xepLoai() {
		for (SinhVien sv : this.listSV) {
			sv.xepLoai();
		}
	}
	
	public ArrayList<SinhVien> diemTBLonNhat(){
		ArrayList<SinhVien> listSVLonNhat = new ArrayList<>();
		SinhVien svMax =listSV.get(0);
		for(SinhVien svCurrent : listSV) {
			if(svCurrent.getDiemTB() > svMax.getDiemTB()) {
				svMax = svCurrent;
			}
		}
		
		for(SinhVien svCurrent : listSV) {
			if(svCurrent.getDiemTB() == svMax.getDiemTB()) {
				listSVLonNhat.add(svCurrent);
			}
		}
		
		return listSVLonNhat;
	}
	
	public ArrayList<SinhVien> dsSinhVienYeu(){
		ArrayList<SinhVien> listSVYeu = new ArrayList<>();
		for(SinhVien svCurrent : this.listSV) {
			if(svCurrent.getDiemTB() < 5) {
				listSVYeu.add(svCurrent);

			}
		}
		
		return listSVYeu;
	}
	
	public ArrayList<SinhVien> timSVTheoTen(String ten){
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		for(SinhVien sv: this.listSV) {
			if(sv.getTenSV().equalsIgnoreCase(ten)) {
				list.add(sv);
			}
		}
		return list;
	}
	//mã sinh viên chỉ có 1( DUY NHẤT)
	public SinhVien timSVTheoMa(int ma) {
		SinhVien sv = null; // chua tim thay
		for(SinhVien sv1 : this.listSV) {
			if(sv1.getMaSV() == ma) {
				sv = sv1; //Da tim thay 
				break; // thoat khoi vong lap( DUY NHẤT)
			}
		}
		return sv;
	}
	
	
	
	
	
	

}
