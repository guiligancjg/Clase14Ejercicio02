import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grupos {
    public void grupos(String expresionRegular, String archivo) throws Exception{
        Pattern patron = Pattern.compile(expresionRegular,Pattern.MULTILINE);
        LeerArchivo leer = new LeerArchivo();

        for (String[] lineas: leer.lineas(archivo)) {
            System.out.println("lineas["+lineas[0]+"] = " +lineas[1]);
            Matcher matcher = patron.matcher(lineas[1]);
            if (matcher.find()){
                System.out.println("Linea: " + lineas[0] + "\t--Grupo 1: " + matcher.group(1) + "\t--Grupo 2: " + matcher.group(2));
            }else{
                System.out.println("Linea: " + lineas[0] + "\tNO");
            }
        }
    }
}
