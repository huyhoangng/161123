package SanPham;

public class Imac {
    public static void main (String[] args){
        Product b = new Product();
    b.masp=124;
    b.name= "Imac";
    b.money = 4000;
    b.quantity = 5500;
    b.unit = "Cái";

        System.out.println("Mã sản phẩm: " +b.masp);
        System.out.println("Tên sản phẩm: " +b.name);
        System.out.println("Giá tiền: $" +b.money);
        System.out.println("Số lượng: " +b.quantity);
        System.out.println("Đơn vị: " +b.unit);
    }
}
