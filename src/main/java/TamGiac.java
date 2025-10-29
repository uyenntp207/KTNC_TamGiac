import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        int a, b, c;
        float p, s, cv;
        a = NhapSoNguyen("Nhap canh a : ");
        b = NhapSoNguyen("Nhap canh b : ");
        c = NhapSoNguyen("Nhap canh c : ");
        p = nuachuVi(a, b, c);
        s = dienTich(a, b, c);
        cv = chuVi(a, b, c);
        System.out.println("Nua chu vi hinh tam giac la : " + p);
        System.out.println("Chu vi hinh tam giac la : " + cv);
        System.out.println("Dien tich hinh tam giac la : " + s);
    }

    public static int NhapSoNguyen(String str) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        x = sc.nextInt();
        return x;
    }

    public static float nuachuVi(int a, int b, int c) {
        return (float) (a + b + c) / 2;
    }

    public static float chuVi(int a, int b, int c) {
        return a + b + c;
    }

    public static float dienTich(int a, int b, int c) {
        float p = (float) (a + b + c) / 2;
        float sd;
        sd = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return sd;
    }
}
