
package arraylist12;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList12 {

    public static void main(String[] args) {
        ArrayList listInteiros = new ArrayList<>();
        
        listInteiros.add(10);
        listInteiros.add(1);
        listInteiros.add(5);
        listInteiros.add(19);
        listInteiros.add(7);
        
        System.out.println("Lista original");
        for (int i = 0; i < listInteiros.size(); i++){
            System.out.println("Inteiros #" + i + ": " + listInteiros.get(i));
        }
        
        Collections.sort(listInteiros);
        
        System.out.println("");
        System.out.println("Número menor: " + listInteiros.get(0));
        System.out.println("Número maior: " + listInteiros.get(listInteiros.size()-1));

}
    
}
