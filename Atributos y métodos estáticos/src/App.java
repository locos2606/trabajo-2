public class App {
    public static void main(String[] args) {
        double fahrenheit = 68;
        double celsius = Temperatura.fahrenheitACelsius(fahrenheit);
        
        System.out.println(fahrenheit + "°F equivale a " + celsius + "°C");
        
        Empleado empleado1 = new Empleado("David ", "Giron", 3000);
        Empleado empleado2 = new Empleado("David", "Acosta", 3500);
        Empleado[] empleados = {empleado1, empleado2};
        
        double totalNomina = Empleado.calcularNominaTotal(empleados);
        System.out.println("Total de la nómina: $" + totalNomina);
    }
}
