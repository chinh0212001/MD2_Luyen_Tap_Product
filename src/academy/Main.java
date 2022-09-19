package academy;

import java.util.Scanner;



import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int index = -1;
    static Product[] arrayProduct = new Product[1000]; // khởi tạo mảng toàn cục;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("***** Menu *****");
            System.out.println("1. nhap thong tin ca san pham");
            System.out.println("2. tinh gia ban cac san pham");
            System.out.println("3. hien thi thong tin cac san pham");
            System.out.println("4. tim kiem san pham theo ten san pham");
            System.out.println("5. sap xep san pham theo gia ban tang dan");
            System.out.println("6. thoat");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Main.formInputListProduct(scanner);
                    break;
                case 2:
                    Main.fromListExportPrice();
                    break;
                case 3:
                    Main.fromDisplayListProduct();
                    break;
                case 4:
                    Main.formSearchProductByName(scanner);
                    break;
                case 5:
                    Main.sortByExportPriceASC();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        } while (true);
    }

    private static void formInputListProduct(Scanner scanner) {
        System.out.println("nhap so luong san pham can them vao: ");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            // khởi tạo đối tượng sản phẩm để nhập thông tin;
            Product pro = new Product();
            pro.inputData(scanner);
            // thêm sản phẩm vào danh sách sản phẩm;
            index++;
            arrayProduct[index] = pro;
        }
    }

    private static void fromDisplayListProduct() {
        for (int i = 0; i <= index; i++) {
            arrayProduct[i].displayData();
        }
    }

    private static void fromListExportPrice() {
        // duyệt từng phần tử
        for (int i = 0; i <= index; i++) {
            // đối tượng product
            arrayProduct[i].calExportPrice();
        }
    }
    private static void formSearchProductByName(Scanner scanner) {
        // dựng cờ kiểm tra trong danh sách có sản phầm có tên cần tìm hay không
        boolean checkExist = false;
        //1. nhập tên Sp cần tìm
        System.out.println("nhap ten san pham can tim: ");
        String strSearch = scanner.nextLine();
        //2. Duyệt từng sản phẩm:
        for (int i = 0; i <= index; i++) {
//3. so sánh tên sản phẩm cần tìm với tên của từng sản phẩm trong danh sách:
            if (arrayProduct[i].getProductName().equals(strSearch)){
                // có xảy ra
                checkExist = true;
                arrayProduct[i].displayData();

            }
        }
        //
        if (!checkExist){
            System.out.println("Khong ton tai san pham nao");
        }

    }
    public static void sortByExportPriceASC(){
        for (int i = 0; i < index; i++) {
            for (int j = i +1; j <= index ; j++) {
                if (arrayProduct[i].getExportPrice() > arrayProduct[j].getExportPrice()){
                    // doi cho 2 ptu
                    Product temp = arrayProduct[i];
                    arrayProduct[i] = arrayProduct[j];
                    arrayProduct[j] = temp;
                }
            }
        }
        System.out.println("sắp xếp sp theo giá tăng dần ");
    }
}
