import java.util.Scanner;

public class NhanVien {
	private String hoDem, ten;
	private NgayThang ngaySinh = new NgayThang(), ngayVaoLam = new NgayThang();

	void nhap() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho dem: ");
		hoDem = sc.nextLine();
		System.out.print("Nhap vao ten nhan vien: ");
		ten = sc.nextLine();
		System.out.print("Nhap vao ngay, thang, nam sinh: ");
		ngaySinh.Nhap();
		System.out.print("Nhap ngay, thang, nam vao lam: ");
		ngayVaoLam.Nhap();
		
	}
	static void xuatTieuDe() {
		System.out.printf("%-15s%-10s%15s%15s%n", "Ho Dem", "Ten", "Ngay Sinh", "Ngay Vao Lam");
	}
	
	public void xuat() {
		System.out.printf("%-15s%-10s%15s%15s%n", hoDem, ten, ngaySinh, ngayVaoLam); 
	}
	
}
