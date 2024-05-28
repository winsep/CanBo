package advance.dev;

import advance.dev.dao.Manager;
import advance.dev.model.CongNhan;
import advance.dev.model.IManager;
import advance.dev.model.KySu;
import advance.dev.model.NhanVien;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IManager manager = new Manager();
		
		manager.add(new CongNhan("Thanh", 19, "Nam", "Hue", 1));
		manager.add(new KySu("Thang", 20, "nam", "DongHoi", "CNTT"));
		manager.add(new NhanVien("T", 19, "Nu", "Hue", "asd"));
		
		System.out.println("Danh sach can bo: ");
		manager.print();
		
		System.out.println("Danh sach can bo:");
        manager.print();

        System.out.println("\nDanh sach can bo sap xep theo ten tang dan:");
        manager.sortByName(1);
        manager.print();

        System.out.println("\nDanh sach can bo sap xep theo ten giam dan:");
        manager.sortByName(-1);
        manager.print();
    }
}
