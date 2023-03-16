package uit.practice;

import java.util.Scanner;

public class XuLyDanhSachSinhVien {
	
	private static void inMenu() {
		System.out.println("vui long chon:");
		System.out.println("1. Them Sinh Vien");
		System.out.println("2. Xuat danh sach sinh vien");
		System.out.println("0. Thoat");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DanhSachSinhVien dsSV = new DanhSachSinhVien();
		doMenu(dsSV);
	}
	
	private static void doMenu(DanhSachSinhVien dsSV) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		do {
			inMenu();
			System.out.print("Moi chon:");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(scan);
				dsSV.themSinhVien(sv);
				break;
			case 2:
				dsSV.tinhDTB();
				dsSV.xepLoai();
				dsSV.xuat();
				break;
			case 3:
				dsSV.tinhDTB();
				dsSV.xepLoai();
				dsSV.xuat();
				break;
			case 0:
				flag = false;
				System.out.println("Thoat Thanh Cong");
				break;
			}
			
		} while (flag);
	}

}
