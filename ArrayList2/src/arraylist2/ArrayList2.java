
package arraylist2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Remova um nome da lista:");
        
         ArrayList<String> ListNomes = new ArrayList<>();
         
         ListNomes.add("Ana");
         ListNomes.add("Carlos");
         ListNomes.add("Bruna");
         ListNomes.add("Daniel");
         ListNomes.add("Eduardo");
         
         for (int i = 0; i < ListNomes.size(); i++){
             System.out.println("Nome #" + i + ": " + ListNomes.get(i));
         }
         
         ListNomes.remove(scanner.nextLine());
         
         System.out.println("Após remover Nome:");
        for (String nome : ListNomes) {
            System.out.println(nome);
    }
    
}
    
}
