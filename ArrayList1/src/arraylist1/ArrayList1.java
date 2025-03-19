
package arraylist1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros:");
        
        ArrayList listInteiros = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
        listInteiros.add(scanner.nextInt());
    }
    
        System.out.println("Esses são os elementos armazenados: " + listInteiros);
        
}
    
}
