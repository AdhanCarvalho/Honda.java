import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("Menu ");
            System.out.println("1. Cadastrar funcionario");
            System.out.println("2. Buscar funcionario");
            System.out.println("3. Excluir funcionario");
            System.out.println("4. Listar funcionarios");
            System.out.println("5. Excluir todos os funcionario");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao){
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    buscarFuncionario();
                    break;
                case 3:
                    excluirFuncionario();
                    break;
                case 4:
                    listarFuncionarios();
                    break;
                case 5:
                    excluirTodosFuncionarios();
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        } while (opcao != 0);
        scanner.close();
    }

    private static void cadastrarFuncionario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID do funcionario: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome do funcionario: ");
        String nome = scanner.nextLine();

        System.out.print("CPF do funcionrio: ");
        String cpf = scanner.nextLine();

        System.out.print("Soldo do funcionario: ");
        double salario = scanner.nextDouble();
        Sistema.cadastrarFuncionario(new Funcionario(id, nome, cpf, salario));
    }

    private static void buscarFuncionario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nome do funcionario: ");
        String nome = scanner.nextLine();
        Sistema.buscarFuncionario(nome);
    }

    private static void excluirFuncionario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("funcionario a ser excluido: ");
        String nome = scanner.nextLine();
        Sistema.excluirFuncionario(nome);
    }

    private static void listarFuncionarios() {
        Sistema.listarFuncionarios();
    }

    private static void excluirTodosFuncionarios() {
        Sistema.excluirTodosFuncionarios();
    }
}

