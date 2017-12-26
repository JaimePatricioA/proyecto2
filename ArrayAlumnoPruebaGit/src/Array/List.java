package Array;              /** @author Curso-09-04 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JOptionPane;


public class List {
    
    public static void main(String[] args) {
        
        ArrayList<String> letras = new ArrayList<>();
        letras.add("r");
        letras.add("a");
        letras.add("c");
        letras.add("d");
        letras.add("g");
        
        for (String letra : letras ) {
        System.out.println(letra);
        }
        
        Collections.sort(letras);
        for (String letra : letras ) {
        System.out.println(letra);
        }
        
      
        
        for (String letra : letras) { /**Letra variable temporal*/
            JOptionPane.showMessageDialog(null,"La letra es ->"+ letra, "ArrayList", JOptionPane.INFORMATION_MESSAGE);
        }
            JOptionPane.showMessageDialog(null,"La letra es ->"+ letras.get(3), "ArrayList", JOptionPane.INFORMATION_MESSAGE);
            
            Alumno A1 = new Alumno("Pedro", 23);
            Alumno A2 = new Alumno("Pepe", 84);
            Alumno A3 = new Alumno("Lepe", 25);
            Alumno A4 = new Alumno("Lucero", 19);
            Alumno A5 = new Alumno("Rita", 35);
            Alumno A6 = new Alumno("Luis", 35);
            Alumno A7 = new Alumno("Roberto", 34);
            Alumno A8 = new Alumno("Juan", 75);
            Alumno A9 = new Alumno("Estanislao", 65);
            
            ArrayList<Alumno> alumnos = new ArrayList<>();
            alumnos.add(A1);
            alumnos.add(A2);
            alumnos.add(A3);
            alumnos.add(A4);
            alumnos.add(A5);
            alumnos.add(A6);
            alumnos.add(A7);
            alumnos.add(A8);
            alumnos.add(A9);
            
            for ( int i = 0; i < alumnos.size(); i++) {
                JOptionPane.showMessageDialog(null,"Alumno -->"+ alumnos.get(i), "Alumno : " + i, JOptionPane.INFORMATION_MESSAGE);
                //alumnos.indexOf()
            }
            

    }
    
}
