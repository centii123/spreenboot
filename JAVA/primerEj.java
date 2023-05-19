import java.util.ArrayList;
import java.util.Scanner;

public class primerEj {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<Integer>();
        int nota, suma = 0;
        String imprim;
        try (Scanner pre = new Scanner(System.in)) {
            for(int i=0;i >= 0; i++){
                System.out.print("Digite sus notas ");
                nota=pre.nextInt();
                if(nota == 0){
                    break;
                }
                
                notas.add(nota);
            }
        }

        for (int index = 0; index < notas.size(); index++) {
            suma= suma + notas.get(index);
            System.out.println(notas.get(index));
            
        }
        imprim= "La suma de todos los datos es de ";
        //imprimir(imprim); // funciones

        //System.out.println("La suma de todos los datos es de " + suma);

        //nota = pre.nextInt(); // pide y guarda el dato pedido

        //objetos

        objetos objetos= new objetos(); //ejecutar la clase

        objetos.impriblog(imprim, suma); // llamar al metodo

        


    }

    public static void imprimir(String text) {
        System.out.println(text);
    }
}
