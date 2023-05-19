public class objetos {
    public int numero;
    private String mensaje;

    public void impriblog(String mensaje, int numero) {
        this.numero=numero;
        this.mensaje= mensaje;
        String hola=this.mensaje + this.numero ;

        System.out.println(hola);
    }
}
