import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public void LeerNumero() {
        
        System.out.println("Introduce un número entero");
        
        List<Integer> lista = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        Integer numeroIntroducido=0;
        try {
            numeroIntroducido = reader.nextInt();
            if (numeroIntroducido %2==0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }
            while (numeroIntroducido >=0){
                lista.add(numeroIntroducido);
                numeroIntroducido -= 2;
            }
            System.out.println(lista);
        } catch (Exception er) {
            System.out.println("¡Cuidado! Solo puedes insertar números enteros.");
            LeerNumero();
        }
        
    }
}
