package ejemplo;

/**
 * Clase que representa un rectángulo y proporciona métodos para calcular 
 * su superficie y su perímetro.
 * * @author Pablo González González
 * @version 1.0
 */
public class Rectangle {

    /** Número de lados paralelos en un rectángulo para el cálculo del perímetro */
    private static final int NUM_LADOS_PARES = 2;
    
    /** Longitud de la base del rectángulo */
    private double base;
    
    /** Longitud de la altura del rectángulo */
    private double altura;

    /**
     * Constructor para crear un nuevo rectángulo con dimensiones específicas.
     * * @param base Longitud de la base.
     * @param altura Longitud de la altura.
     */
    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Valida las dimensiones del rectángulo para detectar valores negativos o nulos.
     * * @return 1 si las dimensiones son válidas, 0 si alguna es cero, -1 si alguna es negativa.
     */
    private double checkDimensions() {
        if (base < 0 || altura < 0) {
            return -1;
        }
        if (base == 0 || altura == 0) {
            return 0;
        }
        return 1; // Valor centinela: todo OK
    }

    /**
     * Calcula la superficie total del rectángulo basándose en su base y altura.
     * * @return El área del rectángulo, o un código de error (0 o -1) si las dimensiones no son válidas.
     */
    public double surface() {
        double status = checkDimensions();
        if (status <= 0) {
            return status;
        }
        return base * altura;
    }

    /**
     * Calcula el perímetro total del rectángulo.
     * * @return El perímetro resultante, o un código de error (0 o -1) si las dimensiones no son válidas.
     */
    public double perimeter() {
        double status = checkDimensions();
        if (status <= 0) {
            return status;
        }
        return NUM_LADOS_PARES * (base + altura);
    }
}