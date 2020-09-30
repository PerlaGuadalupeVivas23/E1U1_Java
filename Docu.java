package ordenpalabras;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Docu{
	String cadena[] = {"Mi", "frase", "ordenada", "es", "esta"};  
	String[] cadenadescomp = new String[5];
	String[] cadenacorrecta = new String[5];
        public  String Leer() throws FileNotFoundException, IOException {
        File LeerArch = new File("Frase.txt");
        FileReader leerArch = new FileReader(LeerArch);
        Scanner a= new Scanner(LeerArch);
        int contador = 0;  
        while (a.hasNext()) { 
            cadenadescomp[contador] = a.nextLine(); 
            contador++; 
        }
        System.out.println("---------------------------------------------------");
        System.out.println("           O R D E N A R  O R A C I O N E S");
         System.out.println("\n---------------------------------------------------");
        System.out.println("================ Frase Desordenada ================");
        for (int i = 0; i <= cadenadescomp.length-1; i++) {
        System.out.println(cadenadescomp[i]);
        }String dir=leerArch.toString();
        return dir; }
    public void Comparar() {
        for (int x = 0; x <= cadena.length - 1; x++) {
            for (int i = 0; i <= cadenadescomp.length - 1; i++) {
                if (cadena[x].equals(cadenadescomp[i])) {
                    cadenacorrecta[x] = cadenadescomp[i];
                } }}
        for (int x = 0; x <= cadenacorrecta.length - 1; x++) {
        }}
}

