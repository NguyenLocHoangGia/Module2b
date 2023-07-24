package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}

class ProductManagement {
    private ArrayList<Product> productList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductManagement manager = new ProductManagement();
        manager.run();
    }

    public void run() {
        while (true) {
            System.out.println("----- Quản lý sản phẩm -----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xoá sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("0. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    displayProducts();
                    break;
                case 5:
                    searchProductByName();
                    break;
                case 6:
                    sortProductsAscending();
                    break;
                case 7:
                    sortProductsDescending();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        }
    }

    private void addProduct() {
        System.out.println("Nhập thông tin sản phẩm mới:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.print("Giá: ");
        double price = scanner.nextDouble();

        Product newProduct = new Product(id, name, price);
        productList.add(newProduct);

        System.out.println("Sản phẩm đã được thêm thành công!");
    }

        private void updateProduct() {
            System.out.println("Nhập ID sản phẩm cần sửa: ");
            int id = scanner.nextInt();

            Product productUpdate = getProductId(id);
            if (productUpdate != null){
                System.out.println("Thông tin sản phẩm: "+productUpdate);

                System.out.println("Nhập giá cần thay đổi");
                double newPrice =scanner.nextDouble();
                productUpdate.setPrice(newPrice);

                System.out.println("Đã sửa đổi thành công!");
            }else {
                System.out.println("Không tìm thấy ID: "+id);
            }
        }

        private void deleteProduct() {
            System.out.println("Nhập ID sản phẩm cần xóa: ");
            int id = scanner.nextInt();

            Product productDelete = getProductId(id);
            if (productDelete != null){
                productList.remove(productDelete);
                System.out.println("Sản phẩm xóa thành công: ");
            }else {
                System.out.println("không tìm thấy id: "+id);
            }
        }

        private void displayProducts() {
            System.out.println("Hiển thị danh sách sản phẩm: ");
            for (Product product : productList){
                System.out.println(product);
            }
        }

        private void searchProductByName() {
            System.out.println("Nhập tên sản phẩm cần tra cứu : ");
            String nameProduct = scanner.nextLine();

            boolean found = false;
            System.out.println("Kết quả tìm kiếm: ");
            for (Product product : productList){
                if (product.getName().equalsIgnoreCase(nameProduct)){
                    System.out.println(product);
                    found = true;
                }

                if (!found){
                    System.out.println("Không tìm thấy tên sản phẩm");
                }
            }
        }

        private void sortProductsAscending() {
            Collections.sort(productList, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
            });
            System.out.println("Danh sách sắp xếp theo giá tăng dần: ");
            displayProducts();
        }

        private void sortProductsDescending() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });
            System.out.println("Danh sách sắp xếp theo giá giảm dần: ");
            displayProducts();
        }
        private Product getProductId(int id){
        for (Product product : productList){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
        }

    }


