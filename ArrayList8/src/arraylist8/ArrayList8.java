
package arraylist8;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList8 {

    public static void main(String[] args) {
        ArrayList listElementos = new ArrayList<>();
        
        listElementos.add(6);
        listElementos.add(5);
        listElementos.add(4);
        listElementos.add(3);
        listElementos.add(2);
        listElementos.add(1);        
        
        System.out.println("Ordem original: ");
        for (int i = 0; i < listElementos.size(); i++){
            System.out.println("Elementos #" + i + ": " + listElementos.get(i));
        }
        
        System.out.println("Ordem inversa:");
        Collections.sort(listElementos);
        
        for (int i = 0; i < listElementos.size(); i++){
             System.out.println("Elementos #" + i + ": " + listElementos.get(i));
             
    }
    
}
    
}
