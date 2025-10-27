package service;

import model.Animal;
import model.Dono;
import model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private List<Dono> donos;
    private List<Animal> animais;
    private List<Funcionario> funcionarios;

    public Clinica() {
        donos = new ArrayList<>();
        animais = new ArrayList<>();
        funcionarios = new ArrayList<>();
    }

    public void cadastrarDono(Dono dono) { donos.add(dono); }
    public void cadastrarAnimal(Animal animal) { animais.add(animal); }
    public void cadastrarFuncionario(Funcionario f) { funcionarios.add(f); }

    public void listarDonos() {
        if (donos.isEmpty()) {
            System.out.println("Nenhum dono cadastrado.");
        } else {
            for (Dono d : donos) {
                d.exibirDados();
            }
        }
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario f : funcionarios) {
                f.exibirDados();
            }
        }
    }

    public Dono buscarDono(String nome) {
        for (Dono d : donos) {
            if (d.getNome().equalsIgnoreCase(nome)) return d;
        }
        return null;
    }

    public Animal buscarAnimal(String nome) {
        for (Animal a : animais) {
            if (a.getNome().equalsIgnoreCase(nome)) return a;
        }
        return null;
    }
}
