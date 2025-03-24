
package arraylist14;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList listTarefas = new ArrayList<>();
        
        listTarefas.add("Varrer a casa");
        listTarefas.add("Limpar o quarto");
        listTarefas.add("Lavar a louça");
        listTarefas.add("Estudar");
        
        for (int i = 0; i < listTarefas.size(); i++){
            System.out.println("Tarefa #" + i + ": " + listTarefas.get(i));
        }
        
        System.out.println("");
        System.out.println("Adicione uma tarefa: ");
        listTarefas.add(scanner.nextLine());
        
        for (int i = 0; i < listTarefas.size(); i++){
            System.out.println("Tarefas #" + i + ": " + listTarefas.get(i));
        }
        
        System.out.println("");
        System.out.println("Remova uma tarefa: ");
        listTarefas.remove(scanner.nextLine());
        
        for (int i = 0; i < listTarefas.size(); i++){
            System.out.println("Tarefas #" + i + ": " + listTarefas.get(i));
        }
    }
    
}
