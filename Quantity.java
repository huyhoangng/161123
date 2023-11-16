package SanPham;

import org.w3c.dom.ls.LSOutput;

public class Quantity {
    private int quantity;
    void quantity(int quantity) {
        this.quantity = quantity;
    }
    // Phương thức để tăng số lượng
    public void increaseQuantity(int amount) {
        if (amount > 0) {
            this.quantity += amount;
            System.out.println("Số lượng tăng lên: " + amount);
        } else {
            System.out.println("Vui lòng nhập một số lượng dương để tăng.");
        }
    }

    // Phương thức để giảm số lượng
    public void decreaseQuantity(int amount) {
        if (amount > 0 && amount <= this.quantity) {
            this.quantity -= amount;
            System.out.println("Số lượng giảm đi: " + amount);
        } else {
            System.out.println("Vui lòng nhập một số lượng hợp lệ để giảm.");
        }
    }

    // Phương thức để lấy giá trị hiện tại của số lượng
    public int getQuantity() {
        return this.quantity;
    }

}
