package model;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private double peso;
    private Dono dono;
    private List<String> historicoAtendimentos;

    public Animal(String nome, String especie, String raca, int idade, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.historicoAtendimentos = new ArrayList<>();
    }

    public void setDono(Dono dono) { this.dono = dono; }
    public Dono getDono() { return dono; }
    public String getNome() { return nome; }

    public void adicionarAtendimento(String atendimento) {
        if (atendimento != null && !atendimento.isEmpty()) {
            historicoAtendimentos.add(atendimento);
        }
    }

    public void exibirHistorico() {
        if (historicoAtendimentos.isEmpty()) {
            System.out.println("Nenhum atendimento registrado para " + nome);
        } else {
            System.out.println("Histórico de atendimentos de " + nome + ":");
            for (String a : historicoAtendimentos) {
                System.out.println("- " + a);
            }
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome +
                " | Espécie: " + especie +
                " | Raça: " + raca +
                " | Idade: " + idade +
                " | Peso: " + peso +
                " | Dono: " + (dono != null ? dono.getNome() : "Sem dono"));
    }
}