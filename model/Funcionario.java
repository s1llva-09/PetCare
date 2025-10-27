package model;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String telefone, String email, String usuario, String senha, String cargo, double salario) {
        super(nome, telefone, email, usuario, senha);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirDados() {
        System.out.println("------Dados do Funcionario-------");
        super.exibirDados();
        System.out.println("Funcionario:" + " cargo = " + cargo + ", salario = " + salario);
    }

}