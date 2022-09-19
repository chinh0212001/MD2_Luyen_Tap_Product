package academy;

import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private String description;

    public Product() {
    }

    public Product(String productId, String productName, float importPrice, float exportPrice, int quantity, String description) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void inputData(Scanner scanner){
        System.out.println("nhap ma sp: ");
        this.productId = scanner.nextLine();
        System.out.println("nhap ten sp: ");
        this.productName = scanner.nextLine();
        System.out.println("nhap gia nhap sp: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("nhap so luong cua sp: ");
        this.quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap mo ta sp: ");
        this.description = scanner.nextLine();
    }
    public void calExportPrice(){
        this.exportPrice = this.importPrice * 1.2F;
    }
    public void displayData() {
        System.out.printf("Ma san pham: %s - Ten san pham: %s - Gia cua san pham: %.2f \n", this.productId, this.productName, this.importPrice);
        System.out.printf("Gia ban: %.2f - So luong: %d - Mo ta: %s\n",this.exportPrice, this.quantity, this.description);
    }
}
