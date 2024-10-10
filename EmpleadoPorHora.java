public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double salarioPorHora;

    /**
     * Metodo constructor de la clase empleadoPorHora
     * 
     * @param nombre
     * @param identificacion
     * @param horasTrabajadas
     * @param salarioPorHora
     */
    public EmpleadoPorHora(String nombre, String identificacion, int horasTrabajadas, double salarioPorHora) {
        super(nombre, identificacion);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * salarioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHora [horasTrabajadas=" + horasTrabajadas + ", salarioPorHora=" + salarioPorHora + "]";
    }
    
}
