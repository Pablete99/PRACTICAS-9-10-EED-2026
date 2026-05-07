package ejemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectanguloTest {

    // -------- CASO NORMAL (valores positivos) --------
    @Test
    void testValoresPositivos() {
        Rectangle r = new Rectangle(3, 4);

        assertAll("Valores positivos",
                () -> assertEquals(12, r.surface()),
                () -> assertEquals(14, r.perimeter())
        );
    }

    // -------- CASO CEROS --------
    @Test
    void testValoresCero() {
        Rectangle r1 = new Rectangle(0, 5);
        Rectangle r2 = new Rectangle(3, 0);
        Rectangle r3 = new Rectangle(0, 0);

        assertAll("Valores con cero",
                () -> assertEquals(0, r1.surface()),
                () -> assertEquals(0, r1.perimeter()),

                () -> assertEquals(0, r2.surface()),
                () -> assertEquals(0, r2.perimeter()),

                () -> assertEquals(0, r3.surface()),
                () -> assertEquals(0, r3.perimeter())
        );
    }

    // -------- CASO NEGATIVOS --------
    @Test
    void testValoresNegativos() {
        Rectangle r1 = new Rectangle(-3, 4);
        Rectangle r2 = new Rectangle(3, -4);
        Rectangle r3 = new Rectangle(-3, -4);

        assertAll("Valores negativos",
                () -> assertEquals(-1, r1.surface()),
                () -> assertEquals(-1, r1.perimeter()),

                () -> assertEquals(-1, r2.surface()),
                () -> assertEquals(-1, r2.perimeter()),

                () -> assertEquals(-1, r3.surface()),
                () -> assertEquals(-1, r3.perimeter())
        );
    }

    // -------- CASO PARA PROBAR FALLOS  --------
    @Test
    void testErroresDetectados() {
        Rectangle r = new Rectangle(3, 4);

        assertAll("Aserciones incorrectas (deben fallar)",
                () -> assertEquals(15, r.surface()),
                () -> assertEquals(10, r.perimeter())
        );
    }
    
}