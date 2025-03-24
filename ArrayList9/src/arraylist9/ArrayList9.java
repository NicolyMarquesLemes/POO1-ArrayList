
package arraylist9;

import java.util.ArrayList;

public class ArrayList9 {

    public static void main(String[] args) {
        ArrayList listNomes = new ArrayList<>();
        ArrayList listNomesCopia = new ArrayList<>();
        
        listNomes.add("Nicolas");
        listNomes.add("Cleitom");
        listNomes.add("Sammy");
        listNomes.add("Giovanna");
        
        for (int i = 0; i < listNomes.size(); i++){
            System.out.println("Elementos #" + i + ": " + listNomes.get(i));
        }
        
        for(int i = 0; i < listNomes.size(); i++){
            listNomesCopia.add(listNomes.get(i));  
        }
        System.out.println("-----------");
        for (int i = 0; i < listNomesCopia.size(); i++){
            System.out.println("Elementos #" + i + ": " + listNomesCopia.get(i));
        }
    }
    
}
