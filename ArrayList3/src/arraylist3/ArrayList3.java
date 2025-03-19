
package arraylist3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {

    public static void main(String[] args) {
        ArrayList listInteiros = new ArrayList<>();
        
        listInteiros.add(20);
        listInteiros.add(3);
        listInteiros.add(78);
        listInteiros.add(54);
        listInteiros.add(11);
        listInteiros.add(60);
        listInteiros.add(87);
        listInteiros.add(91);
        listInteiros.add(35);
        listInteiros.add(100);
        
        System.out.println("Lista antes da ordenagem:");
        for (int i = 0; i < listInteiros.size(); i++){
             System.out.println("Número #" + i + ": " + listInteiros.get(i));
    }
        
        System.out.println("Lista ordenada:");
        Collections.sort(listInteiros);
        
        for (int i = 0; i < listInteiros.size(); i++){
             System.out.println("Número #" + i + ": " + listInteiros.get(i));
    }
        
        
}
    
}
