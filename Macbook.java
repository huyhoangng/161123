package SanPham;

public class Macbook {
    public static void main (String[] args){
        Product c = new Product();
    c.masp=125;
    c.name= "Macbook Pro";
    c.money = 3000;
    c.quantity = 4000;
    c.unit= "Cái";

        System.out.println("Mã sản phẩm: " +c.masp);
        System.out.println("Tên sản phẩm: " +c.name);
        System.out.println("Giá tiền: $" +c.money);
        System.out.println("Số lượng: " +c.quantity);
        System.out.println("Đơn vị: " +c.unit);
    }
}
