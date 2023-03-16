package uit.practice;

import java.util.Scanner;

public class SinhVien {
	
	private String tenSV;
	private int maSV;
	private float diemToan;
	private float diemHoa;
	private float diemLy;
	private float diemTB;
	private String xepLoai;
	
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}
	public float getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}
	public float getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}
	public float getDiemTB() {
		return diemTB;
	}
	
	
	public String getXepLoai() {
		return xepLoai;
	}
	
	public SinhVien() {
		super();
		
	}
	public SinhVien(String tenSV, int maSV, float diemToan, float diemHoa, float diemLy) {
		super();
		this.tenSV = tenSV;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemHoa = diemHoa;
		this.diemLy = diemLy;
	}
	
	public void nhap(Scanner scan) {
		System.out.print("Nhap ten: ");
		this.tenSV = scan.nextLine();

		System.out.print("Nhap ma: ");
		this.maSV = Integer.parseInt(scan.nextLine());
		do{
			System.out.print("Nhap diem toan: ");
			this.diemToan = Float.parseFloat(scan.nextLine());

			System.out.print("Nhap diem ly: ");
			this.diemLy = Float.parseFloat(scan.nextLine());

			System.out.print("Nhap diem hoa: ");
			this.diemHoa = Float.parseFloat(scan.nextLine());
		}
		while(this.diemToan>10 && this.diemLy>10 && this.diemHoa>10);

		
	}
	
	
	public void xuat() {
		System.out.println("SinhVien [tenSV=" + tenSV + ", maSV=" + maSV + ", diemToan=" + diemToan + ", diemHoa=" + diemHoa
				+ ", diemLy=" + diemLy + ", diemTB=" + diemTB + ", xepLoai=" + xepLoai + "]");
	}
	
	public void tinhDTB() {
		this.diemTB = (this.diemToan + this.diemLy + this.diemHoa) / 3;
	}
	
	public void xepLoai() {
		if (this.diemTB >= 9) {
			this.xepLoai = "Xuất Sắc";
		} else if (this.diemTB >= 8) {
			this.xepLoai = "Giỏi";
		} else if (this.diemTB >= 7) {
			this.xepLoai = " Khá";
		} else if (this.diemTB >= 6) {
			this.xepLoai = "TB-Khá";
		} else if (this.diemTB >= 5) {
			this.xepLoai = "Trung bình";
		} else {
			this.xepLoai = "Yếu";
		}
	}
	
	private String formatNumCell(Number num) {
		String paddLeft = "%5s";
		String paddRight = "%-8s";
		return String.format(paddLeft, " ") + String.format(paddRight, num) + "|";
	}

	private String formatTextCell(String text) {
		String paddLeft = "%-15s";
		return String.format(paddLeft, " " + text);
	}

	public void xuatRowFormat() {
		String text;
		text = formatNumCell(this.maSV);
		text += formatTextCell(this.tenSV) + "|";
		text += formatNumCell(this.diemToan);
		text += formatNumCell(this.diemLy);
		text += formatNumCell(this.diemHoa);

		double dtb = Math.round(this.diemTB * 100.0) / 100.0; // lam tron den 2 chu so phan thap phan
		text += formatNumCell(dtb);
		text += formatTextCell(this.xepLoai) + "||";
		System.out.println(text);

	}
	
	
	
	
	
	
	
}
