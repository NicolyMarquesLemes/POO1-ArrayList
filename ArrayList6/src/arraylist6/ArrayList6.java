
package arraylist6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        
        ArrayList<String> listPalavras = new ArrayList<>();
        
        int quantidade = 0;
        
        System.out.println("Escreva quantas palavras você desejar:");
        System.out.println("Escreva 'fim' para parar de escrever");
        
        for (int i = 0; i <= 10000; i++) {
        listPalavras.add(scanner.nextLine());
        
        if("fim".equals(listPalavras.get(i))){
            System.out.println("Looping terminado");
           break; 
        }
    }
        System.out.println("Insira a palavra que deseja procurar:");
        String palavra = scanner2.nextLine();
        
        for( int i = 0; i < listPalavras.size(); i++){
            if(palavra.equals(listPalavras.get(i))){
                quantidade += 1;
                
        }
        }
        System.out.println("Quantidade de aparições: " + quantidade);
    
}
    
}
