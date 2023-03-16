package uit.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		DanhSachSinhVien ds = new DanhSachSinhVien();
		TruongHoc truong = new TruongHoc();
		truong.nhap();
		doMenu(truong);

	}
	private static void inMenu() {
		System.out.println("vui long chon:");
		System.out.println("1. Them Sinh Vien");
		System.out.println("2. Xuat danh sach sinh vien");
		System.out.println("3. Liệt kê DSSV có ĐTB cao nhất");
		System.out.println("4. Liệt kê DSSV có xep loai Yeu");
		System.out.println("5. Tim Sinh vien theo ten");
		System.out.println("6. Tim Sinh vien theo Ma");
		System.out.println("7. Xoa Sinh vien theo Ma");
		System.out.println("0. Thoat");
	}
	
	private static void doMenu(TruongHoc truong) {
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
				truong.themSinhVien(sv);
				break;
			case 2:
				truong.tinhDTB();
				truong.xepLoai();
//				truong.xuat();
				truong.xuatTheoFormat(truong.getDsSV().getListSV());
				break;
			case 3:
				ArrayList<SinhVien> list = truong.diemTBLonNhat();
//				for(SinhVien sv1 : list) {
//					sv1.xuat();
//				}
				
//				truong.xuatHelper(list);
				truong.xuatTheoFormat(list);
				break;
			case 4:
				// đặt tên list ArrayList<SinhVien> khác tên list ở case3
				ArrayList<SinhVien> list1 = truong.dsSinhVienYeu();
//				for(SinhVien sv2 : list1) {
//					sv2.xuat();
//				}
//				truong.xuatHelper(list1);
				truong.xuatTheoFormat(list1);
				break;
		
			case 5:
				System.out.println("Vui long nhap ten SV can tim:");
				String ten = scan.nextLine();
				ArrayList<SinhVien> listTen = truong.timSVTheoTen(ten);
//				truong.xuatHelper(listTen);
				truong.xuatTheoFormat(listTen);
				break;
			case 6:
				System.out.println("Vui long nhap Ma SV can tim:");
				int ma = Integer.parseInt(scan.nextLine());

				SinhVien svFound = truong.timSVTheoMa(ma);
				if (svFound != null) {
					svFound.xuat();
				} else {
					System.out.println("Khong co sinh vien co ma la: " + ma);
				}
				break;
			case 0:
				flag = false;
				System.out.println("Thoat Thanh Cong");
				break;
			}
			
		} while (flag);
	}

}
