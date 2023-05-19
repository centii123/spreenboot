import java.util.ArrayList; // es importante importar si se usa arraylist

/**
 * holamundo
 */

public class holamundo {
    public static void main(String[] args) {

        String holaMundo="Hola mundo";
        Long numeroGrande=15555555555555L; //se pone L al final obligado
        int numeros= 23; 
        boolean truefalse= true;
        float NumeroDesimalesPequenos= 3.1567f; // se pone f obligado
        double NumeroDesimalesGrande = 3.4567765655666;
        int[] numerosArray={1,2,3,4,5,6,7};

        System.out.println(holaMundo + numeroGrande + numeros + truefalse + NumeroDesimalesGrande + NumeroDesimalesPequenos);
        for(int i=0; i < numerosArray.length; i++){
            System.out.println(numerosArray[i]); // recorrer un array normal
        }

        ArrayList<Integer> listaDinamica= new ArrayList<Integer>();
        //List<Integer> listaDinamica= new ArrayList<Integer>();

        listaDinamica.add(9);
        listaDinamica.add(9);
        listaDinamica.add(9);
        listaDinamica.add(9);
        for(int i=0; i < listaDinamica.size(); i++){
            System.out.println(listaDinamica.get(i)); //recorrer una lista dinamica
        }



    }
}