import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public static void buscarFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                System.out.println("funcionario encontrado:" + funcionario.getNome());
                return;
            }
        }
        System.out.println("Funcionario não encontrado.");
    }

    public static void excluirFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                funcionarios.remove(funcionario);
                System.out.println("Funcioar removido: " + nome);
                return;
            }
        }
        System.out.println("Funcionario não encontrado.");
    }

    public static void listarFuncionarios() {
        System.out.println("Lista de funcionarios:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("ID: " + funcionario.getId() + ", Nome: " + funcionario.getNome() + ", CPF: " + funcionario.getCpf() + ", soldo: " + funcionario.getSalario());
        }
    }

    public static void excluirTodosFuncionarios() {
        funcionarios.clear();
        System.out.println("Todos os funcionarios removidos.");
    }
}
