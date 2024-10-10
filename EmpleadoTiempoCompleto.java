public class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    /**
     * Metodo constructor de la clase empleadoTiempoCompleto
     * 
     * @param nombre
     * @param identificacion
     * @param salarioMensual
     */
    public EmpleadoTiempoCompleto(String nombre, String identificacion, double salarioMensual) {
        super(nombre, identificacion);
        this.salarioMensual = salarioMensual;
    }
    
    @Override
    public double calcularSalario() {
        return salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto [salarioMensual=" + salarioMensual + "]";
    }
    
}

