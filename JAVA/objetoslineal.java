import clases.Personas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//para ejecutar

/*
 * usamos javac objetoslineal.java  primero
 * usamos java objetoslineal.java y no apareceran errores
 */

public class objetoslineal {

    public static void main(String[] arg) {

        //objeto con Map
        Map<String,Personas> persona = new HashMap<>();

        persona.put("person1", new Personas("mama", 20));

        System.out.println(persona.get("person1").nombre);

        //objeto con class

        Personas person= new Personas("enrique", 20);

        System.out.println(person.nombre);
        System.out.println(person.edad);

        //pedir
        Scanner lectura= new Scanner(System.in);

        //pedir numero
        int numero1= lectura.nextInt(); // recoge numeros
        System.out.println(numero1); 

        //pedir caracteres

        String nombre = lectura.next(); //recoge string
        int num = Integer.parseInt(nombre);
        System.out.println(num +1);
    }


    
}


