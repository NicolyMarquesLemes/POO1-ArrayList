
package arraylist13;
import java.util.ArrayList;

public class ArrayList13 {

    public static void main(String[] args) {
        ArrayList listElementos1 = new ArrayList<>();
        ArrayList listElementos2 = new ArrayList<>();
        ArrayList listElementos = new ArrayList<>();
        
        listElementos1.add(1);
        listElementos1.add(2);
        listElementos1.add(3);
        listElementos1.add(4);
        listElementos1.add(5);
        
        System.out.println("Lista 1:");
        for (int i = 0; i < listElementos1.size(); i++){
            System.out.println("Elementos #" + i + ": " + listElementos1.get(i));
        }
        
        listElementos2.add(6);
        listElementos2.add(7);
        listElementos2.add(8);
        listElementos2.add(9);
        listElementos2.add(10);
        
        System.out.println("");
        System.out.println("Lista 2:");
        for (int i = 0; i < listElementos2.size(); i++){
            System.out.println("Elementos #" + i + ": " + listElementos2.get(i));
        }
        
        for(int i = 0; i < listElementos1.size(); i++){
            listElementos.add(listElementos1.get(i));  
        }
        
        for(int i = 0; i < listElementos2.size(); i++){
            listElementos.add(listElementos2.get(i));
        }
        
        System.out.println("");
        System.out.println("Listas juntas:");
        for (int i = 0; i < listElementos.size(); i++){
            System.out.println("Elementos #" + i + ": " + listElementos.get(i));
        }
        
    }
    
}

