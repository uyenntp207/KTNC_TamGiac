import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TamGiacTest {
    @Test
    void testNuachuVi() {
        assertEquals(6.0f, TamGiac.nuachuVi(3, 4, 5));
        assertEquals(7.5f, TamGiac.nuachuVi(5, 5, 5));
    }

    @Test
    void testChuVi() {
        assertEquals(12.0f, TamGiac.chuVi(3, 4, 5));
        assertEquals(15.0f, TamGiac.chuVi(5, 5, 5));
    }

    @Test
    void testDienTich() {
        // Tam giác 3-4-5 có diện tích 6
        assertEquals(6.0f, TamGiac.dienTich(3, 4, 5), 0.0001);
        // Tam giác đều cạnh 5 có diện tích ~10.8253
        assertEquals(10.8253f, TamGiac.dienTich(5, 5, 5), 0.0001);
    }
}