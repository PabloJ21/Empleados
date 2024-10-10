public abstract class Empleado {
    private String nombre;
    private String identificacion;

    /**
     * Metodo constructor de la clase empleado
     * 
     * @param nombre
     * @param identificacion
     */
    public Empleado(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Metodo que calcula el salario de los empleados
     */
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", identificacion=" + identificacion + "]";
    }
    
}
