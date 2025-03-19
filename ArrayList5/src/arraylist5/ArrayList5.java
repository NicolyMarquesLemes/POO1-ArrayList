
package arraylist5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList5 {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        ArrayList<String> listCidades = new ArrayList<>();
        
        listCidades.add("Sapucaia");
        listCidades.add("Esteio");
        listCidades.add("Canoas");
        listCidades.add("Novo Hamburgo");
        listCidades.add("Porto Alegre");
        
        System.out.println("Lista antes de ser modificada:");
        for (int i = 0; i < listCidades.size(); i++){
            System.out.println("Cidades #" + i + ": " + listCidades.get(i));
        }
        
        System.out.println("Substitua uma cidade por alguma que você queira de acordo com a '#':");
        int numeroCidade = scanner1.nextInt();
        
        System.out.println("Agora, insira o nome da cidade substituida:");
        listCidades.set(numeroCidade, scanner2.nextLine());
        
        System.out.println("Lista modificada:");
        for (int i = 0; i < listCidades.size(); i++){
            System.out.println("Cidades #" + i + ": " + listCidades.get(i));
    }
    
}
    
}
