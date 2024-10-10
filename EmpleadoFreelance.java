public class EmpleadoFreelance extends Empleado {
    private int proyectosCompletados;
    private double pagoPorProyecto;

    /**
     * Metodo constructor de la clase empleadoFreelance
     * 
     * @param nombre
     * @param identificacion
     * @param proyectosCompletados
     * @param pagoPorProyecto
     */
    public EmpleadoFreelance(String nombre, String identificacion, int proyectosCompletados, double pagoPorProyecto) {
        super(nombre, identificacion);
        this.proyectosCompletados = proyectosCompletados;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public double calcularSalario() {
        return proyectosCompletados * pagoPorProyecto;
    }

    public int getProyectosCompletados() {
        return proyectosCompletados;
    }

    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }

    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    public void setPagoPorProyecto(double pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public String toString() {
        return "EmpleadoFreelance [proyectosCompletados=" + proyectosCompletados + ", pagoPorProyecto=" + pagoPorProyecto + "]";
    }
    
}
