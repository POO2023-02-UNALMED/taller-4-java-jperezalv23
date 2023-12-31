package classroom;

public class Persona {

    public long cedula = 3;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        this(1, nombre);
        totalPersonas++;
    }
    
    public Persona() {
        this(0,"sin nombre");
    }

    public long getCedula() {
        return this.cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
