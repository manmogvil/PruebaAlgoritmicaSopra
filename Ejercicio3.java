import java.util.Scanner;

public class Ejercicio3 {
    
    public static Double obtenerSueldo(){
        try{
            System.out.println("Introduce las horas trabajadas");
            Scanner readerH = new Scanner(System.in);
            int horasTrabajadas = readerH.nextInt();
        
            System.out.println("Introduce la tarifa o precio por hora fijado");
            Scanner readerT = new Scanner(System.in);
            double tarifa = readerT.nextDouble();
    
            if (horasTrabajadas > 40) {
                return (40.0 * tarifa) + ((horasTrabajadas - 40) * (tarifa * 1.5));
            } else {
                return ((double)(horasTrabajadas) * tarifa);
            } 
        }
        catch (Exception er) {
            System.out.println("¡Cuidado! Debes de insertar un número entero o decimal (a través de coma).");
            obtenerSueldo();
        }
        return 0.0;
    }
    
}
