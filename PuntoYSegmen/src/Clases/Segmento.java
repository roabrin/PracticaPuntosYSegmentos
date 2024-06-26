package Clases;




/**
 * Clase Segmento para representar un segmento en un plano de coordenadas.
 * 
 */
public class Segmento {
    
    private Punto a;
    private Punto b;

    /**
     * Constructor por defecto.
     * Crea un segmento entre los puntos (0,0) y (1,1).
     */
    public Segmento() {
        this.a = new Punto();
        this.b = new Punto(1, 1);
    }

    /**
     * Constructor que recibe dos puntos como parámetros.
     * @param a Punto a del segmento.
     * @param b Punto b del segmento.
     */
    public Segmento(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    // Getters y Setters
    public Punto getA() {
        return a;
    }

    public void setA(Punto a) {
        this.a = a;
    }

    public Punto getB() {
        return b;
    }

    public void setB(Punto b) {
        this.b = b;
    }

    /**
     * Método toString para representar el segmento.
     * Si tenemos un segmento con los puntos (1,2) y (3,4),
     * se mostrará [(1,2),(3,4)].
     *
     * @return Una cadena que representa el segmento en el formato [(a),(b)].
     */
    @Override
    public String toString() {
        return "[" + a + "," + b + "]";
    }

    /**
     * Método para calcular la distancia entre ambos puntos.
     * 
     * @return La distancia entre los puntos 'a' y 'b'.
     */
    public double distancia() {
        double dx = b.getX() - a.getX();
        double dy = b.getY() - a.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
