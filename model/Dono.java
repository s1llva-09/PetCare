package model;

import java.util.ArrayList;
import java.util.List;

public class Dono extends Pessoa {
    private String cpf;
    private String endereco;
    private List<Animal> listaAnimais = new ArrayList<>();

    public Dono(String nome, String telefone, String email, String usuario, String senha, String cpf, String endereco) {
    super(nome, telefone, email, usuario, senha);
    this.cpf = cpf;
    this.endereco = endereco;
}


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public void cadastrarAnimal(Animal a) {
        if (a != null) {
            a.setDono(this);
            listaAnimais.add(a);
        }
    }

    public List<Animal> getListaDeAnimais() {
        return listaAnimais;
    }

    @Override
    public void exibirDados() {
        System.out.println("------Dados do Dono-------"); 
        super.exibirDados();
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
    }
}