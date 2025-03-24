
package arraylist10;

import java.util.ArrayList;

public class ArrayList10 {

    public static void main(String[] args) {
        ArrayList listInteiros = new ArrayList<>();
        
        listInteiros.add(15);
        listInteiros.add(7);
        listInteiros.add(9);
        listInteiros.add(11);
        listInteiros.add(2);
        
        for (int i = 0; i < listInteiros.size(); i++){
            System.out.println("Inteiros #" + i + ": " + listInteiros.get(i));
        }
    }
    
}
