import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    private List<Pessoa> pessoas;
    
    public Cadastro() {
        pessoas = new ArrayList<>();
    }
    
    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        System.out.println("Pessoa adicionada com sucesso!");
    }
    
    public void mostrarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            System.out.println("Lista de pessoas cadastradas:");
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa);
            }
        }
    }
    
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        while (opcao != 3) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Mostrar pessoas cadastradas");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da pessoa:");
                    String nome = scanner.next();
                    System.out.println("Digite a idade da pessoa:");
                    int idade = scanner.nextInt();
                    Pessoa pessoa = new Pessoa(nome, idade);
                    cadastro.adicionarPessoa(pessoa);
                    break;
                case 2:
                    cadastro.mostrarPessoas();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        
        scanner.close();
    }
}

class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}