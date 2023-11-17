package btvn;

public class Tamgiac {
        private double canhA;
        private double canhB;
        private double canhC;

        // Phương thức khởi tạo
        public Tamgiac(double canhA, double canhB, double canhC) {
            this.canhA = canhA;
            this.canhB = canhB;
            this.canhC = canhC;
        }

        // Phương thức kiểm tra xem 3 giá trị có phải là 3 cạnh của tam giác hay không
        public boolean laTamGiac() {
            return (canhA + canhB > canhC) && (canhA + canhC > canhB) && (canhB + canhC > canhA);
        }

        // Phương thức tính chu vi tam giác
        public double tinhChuVi() {
            if (laTamGiac()) {
                return canhA + canhB + canhC;
            } else {
                System.out.println("Không phải tam giác, không tính được chu vi.");
                return -1;  // Giá trị -1 làm một biểu thị cho trường hợp không tính được.
            }
        }

        // Phương thức tính diện tích tam giác theo công thức Heron
        public double tinhDienTich() {
            if (laTamGiac()) {
                double p = tinhChuVi() / 2;
                return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
            } else {
                System.out.println("Không phải tam giác, không tính được diện tích.");
                return -1;  // Giá trị -1 làm một biểu thị cho trường hợp không tính được.
            }
        }

        public static void main(String[] args) {
            // Tạo một đối tượng Tamgiac
            Tamgiac tamgiac = new Tamgiac(3, 4, 5);

            // Kiểm tra xem 3 giá trị có phải là 3 cạnh của tam giác hay không
            System.out.println("Có phải là tam giác? " + tamgiac.laTamGiac());

            // Tính chu vi tam giác
            double chuVi = tamgiac.tinhChuVi();
            if (chuVi != -1) {
                System.out.println("Chu vi tam giác: " + chuVi);
            }

            // Tính diện tích tam giác
            double dienTich = tamgiac.tinhDienTich();
            if (dienTich != -1) {
                System.out.println("Diện tích tam giác: " + dienTich);
            }
        }


}
