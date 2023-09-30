import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Deque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        // Solicite os dados de 10 pessoas
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite o telefone da pessoa " + (i + 1) + ": ");
            String telefone = scanner.nextLine();
            System.out.print("Digite o e-mail da pessoa " + (i + 1) + ": ");
            String email = scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, telefone, email);
            listaDePessoas.add(pessoa);
        }

        // Imprima a lista na ordem convencional
        System.out.println("\nLista de Pessoas na Ordem Convencional:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Telefone: " + pessoa.getTelefone() + ", E-mail: " + pessoa.getEmail());
        }

        // Imprima a lista na ordem inversa
        System.out.println("\nLista de Pessoas na Ordem Inversa:");
        Collections.reverse(listaDePessoas);
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Telefone: " + pessoa.getTelefone() + ", E-mail: " + pessoa.getEmail());
        }
    }
}
