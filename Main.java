public class Main {
    public static void main(String[] args) {

        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("Juan Pérez", "1234", 3000);
        EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("Ana Gómez", "5678", 40, 20);
        EmpleadoFreelance empleadoFreelance = new EmpleadoFreelance("Carlos Díaz", "9101", 5, 500);

        System.out.println("Salario de empleado de tiempo completo: " + empleadoTiempoCompleto.calcularSalario());
        System.out.println("Salario de empleado por hora: " + empleadoPorHora.calcularSalario());
        System.out.println("Salario de empleado freelance: " + empleadoFreelance.calcularSalario());
    }
}
