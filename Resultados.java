import java.util.ArrayList;
import java.util.List;

public class Resultados {
    
    //Ejercicio 1
    public static void Ejercicio1(){
        System.out.println("===================================");
        System.out.println("          Ejercicio 1               ");
        System.out.println("===================================");
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.LeerNumero();
    }

    //Ejercicio 2
    public static List<Persona> leerPersonas() {
        System.out.println("===================================");
        System.out.println("          Ejercicio 2               ");
        System.out.println("===================================");
        List<Persona> personas = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            personas.add(new Persona((int) (Math.random()*(99)), Sexo.values()[(int) (Math.random()*(Sexo.values().length))]));
        }
        return personas;
    }

    public static void Ejercicio2(){
        List<Persona> listaPersonas = leerPersonas(); //Aquí se utiliza el Leer personas para la generación de las 50 personas.

        //Esta sería otra forma de resolver el problema, pero al pedir todos los resultado a la vez, no sería óptimo
        //realizar esto mismo para todos los casos restantes, puesto que recorreríamos la lista una y otra vez, lo que daría lugar
        //un aumento de la complejidad ciclomática. 
        //--->System.out.println("Hay " + (int) listaPersonas.stream().filter(p -> p.getEdad() >= 18).count() + " mayores de edad");
        //Esta sería la otra forma de resolver el problema, de forma óptima.

        int mayores=0;
        int menores=0;
        int mayoresMasculino=0;
        int menoresFemenina=0;
        
        for(Persona persona : listaPersonas){
            if(persona.getEdad() >= 18){
                mayores++;
                if(persona.getSexo() == Sexo.Masculino)
                    mayoresMasculino++;
            }else{
                menores++;
                if(persona.getSexo() == Sexo.Femenino)
                    menoresFemenina++;
            }
        }
        System.out.println("Hay " + mayores + " personas mayores de edad.");
        System.out.println("Hay " + menores + " personas menores de edad.");
        System.out.println("Hay " + mayoresMasculino + " personas de sexo masculino mayores de edad.");
        System.out.println("Hay " + menoresFemenina + " personas de sexo femenino menores de edad.");
        System.out.println("El porcentaje de personas mayores de edad es de " + (mayores * 100) / listaPersonas.size() + " %");
        System.out.println("El porcentaje de mujeres es de " + ((listaPersonas.size() - ((menores - menoresFemenina) + mayoresMasculino))*100 / listaPersonas.size()) + " %");        
    }

    //Ejercicio 3
    public static void Ejercicio3(){
        System.out.println("===================================");
        System.out.println("          Ejercicio 3               ");
        System.out.println("===================================");
        Ejercicio3 ejercicio3 = new Ejercicio3();
        System.out.println("El sueldo calculado es de " + ejercicio3.obtenerSueldo() + " euros");
    }

    //Aquí se ejecutará cada uno de los ejercicios propuesto.
    public static void main(String[] args) {
        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
    } 
}
