
public class Main {
    public static void main(String[] args) throws Exception {
        String archivo = "archivo.txt";
        //Busca números como grupo 1 y grupo2 la primera palabra en una linea.
        String expresionRegular = "(\\d+)+.([a-z]+)";

        Grupos buscar = new Grupos();
        buscar.grupos(expresionRegular,archivo);
    }
}