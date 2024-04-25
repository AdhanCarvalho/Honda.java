public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(int id, String nome, String cpf, double salario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
}
