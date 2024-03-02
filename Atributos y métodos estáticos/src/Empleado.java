public class Empleado {
    private static int contadorEmpleados = 0; 
    private int idEmpleados;
    private String nombres;
    private String apellidos;
    private double salarioMensual;
    public Empleado(String nombre, String apellidos, double salarioMensual) {
        this.idEmpleados = ++contadorEmpleados;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.salarioMensual = salarioMensual;
    }
    public static double calcularNominaTotal(Empleado[] empleados) {
        double totalNomina = 0;
        for (Empleado empleado : empleados) {
            totalNomina += empleado.salarioMensual;
        }
        return totalNomina;
    }
}
