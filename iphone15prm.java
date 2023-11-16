package SanPham;

public class iphone15prm {
    public static void main (String[] args){
        Product a = new Product();
        int newQuantity = 0;
        a.quantity = newQuantity;
        int newMoney = 1599;
        a.money = newMoney;
        checkProductAvailability(a.quantity);

        System.out.println("Mã sản phẩm: " +a.masp);
        System.out.println("Tên sản phẩm: " +a.name);
        System.out.println("Giá tiền: $" +a.money);
        System.out.println("Số lượng: " +a.quantity);
        System.out.println("Đơn vị: " +a.unit);

    }
    private static void checkProductAvailability(int quantity) {
        if (quantity ==0 ) {
            System.out.println("Sản phẩm đã hết hàng.");
        } else {
            System.out.println("Sản phẩm còn hàng.");
        }
    }

}
