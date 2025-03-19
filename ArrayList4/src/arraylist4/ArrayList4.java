
package arraylist4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listProdutos = new ArrayList<>();
        
        listProdutos.add("Batom");
        listProdutos.add("Mochila");
        listProdutos.add("Perfume");
        listProdutos.add("Esmalte");
        listProdutos.add("Óculos");
        
        for (int i = 0; i < listProdutos.size(); i++){
             System.out.println("Produto #" + i + ": " + listProdutos.get(i));

        
    }
        System.out.println("Insira o nome do produto que deseja vereficar:");
        if(listProdutos.contains(scanner.nextLine())){
            System.out.println("O produto está na lista");
        }else{
            System.out.println("O produto não está na lista");
        }
         
         
}
    
}
