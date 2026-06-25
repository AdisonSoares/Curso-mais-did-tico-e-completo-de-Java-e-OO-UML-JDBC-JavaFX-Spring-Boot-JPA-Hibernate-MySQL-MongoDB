package generics_set_map.set_exercicio_estruturada;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    static void main() {
        Scanner sc = new Scanner(System.in);
        char[] curso = {'A', 'B', 'C'};

        // Este único conjunto vai guardar os IDs de TODOS os alunos do Alex
        Set<Integer> alunosDoInstrutorAlex = new HashSet<Integer>();

        // O laço principal vai passar de curso em curso automaticamente
        for(char c : curso) {
            // Substituímos o curso[0] pela variável 'c' que muda a cada volta
            System.out.print("How many students for course " + c + "? ");
            int n = sc.nextInt();

            for(int i = 0; i < n; i++) {
                System.out.print("Digite a matricula do "+(i+1)+"º aluno: ");
                alunosDoInstrutorAlex.add(sc.nextInt());
            }
        }

        // Resultado com o número total de alunos sem repetição
        System.out.print("Total students: "+alunosDoInstrutorAlex.size());

        sc.close();
    }
}
