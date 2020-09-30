package ordenpalabras;
import javax.swing.JOptionPane;
import java.io.IOException;

public class Orden{
	public void ordenar() {
	    Docu op= new Docu();		
            try {
                if (op.Leer()!="") 
            { op.Comparar();
              }else{ JOptionPane.showMessageDialog(null, "No hay archivo!");}
            } catch (IOException ex) {
               	 	
            }  
            String palabras= " ";
            for (int n = 0; n<= op.cadenacorrecta.length - 1; n++) {
                palabras = palabras + op.cadenacorrecta[n] + " ";
            }
            System.out.println("============== Mi Frase Ordenada ==============");
            System.out.println(palabras);
        }
          public static void main(String[] args) {
		Orden O= new Orden();
		O.ordenar();
	}
}
