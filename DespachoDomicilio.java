import java.util.Scanner;

// Creamos la clase para que pueda correr el programa.
class DespachoDomicilio {
    public static void main(String[] args) {
        // Creamos el objeto de la librería scanner para poder ingresar datos.
        Scanner scanner = new Scanner(System.in);

        // Solicitamos datos.
        System.out.println("Ingrese la cantidad de km a recorrer: ");
        int distanciaKm = scanner.nextInt();

        // Validamos que la distancia esté dentro del rango de cobertura.
        
        if (distanciaKm > 20) {
            System.out.println("Se encuentra fuera del área de cobertura");
        } else {
            // Limpiador del scanner
            scanner.nextLine();

            System.out.println("Ingrese la marca del vehículo: ");
            String marca = scanner.nextLine();
            System.out.println("Ingrese el modelo del vehículo: ");
            String modelo = scanner.nextLine();
            System.out.println("Ingrese la cilindrada del vehículo: ");
            int cilindrada = scanner.nextInt();

            // Limpiador del scanner
            scanner.nextLine();

            System.out.println("Ingrese el tipo de combustible que utiliza su vehículo: ");
            String combustible = scanner.nextLine();
            System.out.println("Ingrese la capacidad máxima de pasajeros: ");
            int capPasaj = scanner.nextInt();
            System.out.println("Ingrese el precio de la compra: ");
            int totalCompra = scanner.nextInt();

            // Calculamos el precio del despacho segun la distancia
            int precioTraslado;
            if (totalCompra >= 50000) {
                precioTraslado = 0;
            } else if (totalCompra >= 25000 && totalCompra < 50000) {
                precioTraslado = 150 * distanciaKm;
            } else {
                precioTraslado = 300 * distanciaKm;
            }

            // Mostramos la informacion que ingreso el usuario y el costo final.
            System.out.println("La marca que ha ingresado es: " + marca);
            System.out.println("El modelo que ha ingresado es: " + modelo);
            System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
            System.out.println("El tipo de combustible es: " + combustible);
            System.out.println("La cantidad de pasajeros es: " + capPasaj);
            System.out.println("El costo del envío es de: " + precioTraslado);

            // Cerramos.
            scanner.close();

        }
    }
}