import model.Animal;
import model.Dono;
import model.Funcionario;
import service.Clinica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("========================================");
            System.out.println("SISTEMA PETCARE - CLÍNICA VET");
            System.out.println("========================================");
            System.out.println("1. Cadastrar Dono");
            System.out.println("2. Cadastrar Pet");
            System.out.println("3. Cadastrar Funcionário");
            System.out.println("4. Listar Funcionários");
            System.out.println("5. Listar Donos e Pets");
            System.out.println("6. Registrar Atendimento");
            System.out.println("7. Exibir Histórico de Atendimentos");
            System.out.println("0. Sair");
            System.out.println("----------------------------------------");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: {
                    System.out.print("Nome: "); String nome = sc.nextLine();
                    System.out.print("Telefone: "); String tel = sc.nextLine();
                    System.out.print("Email: "); String email = sc.nextLine();
                    System.out.print("Usuário: "); String usuario = sc.nextLine();
                    System.out.print("Senha: "); String senha = sc.nextLine();
                    System.out.print("CPF: "); String cpf = sc.nextLine();
                    System.out.print("Endereço: "); String endereco = sc.nextLine();

                    Dono dono = new Dono(nome, tel, email, usuario, senha, cpf, endereco);
                    clinica.cadastrarDono(dono);
                    System.out.println("Dono cadastrado com sucesso!");
                    break;
                }
                case 2: {
                    System.out.print("Nome do pet: "); String nomePet = sc.nextLine();
                    System.out.print("Espécie: "); String especie = sc.nextLine();
                    System.out.print("Raça: "); String raca = sc.nextLine();
                    System.out.print("Idade: "); int idade = sc.nextInt();
                    System.out.print("Peso: "); double peso = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nome do dono: "); String nomeDono = sc.nextLine();
                    Dono dono = clinica.buscarDono(nomeDono);
                    if (dono != null) {
                        Animal pet = new Animal(nomePet, especie, raca, idade, peso);
                        dono.cadastrarAnimal(pet);
                        clinica.cadastrarAnimal(pet);
                        System.out.println("Pet cadastrado com sucesso!");
                    } else {
                        System.out.println("Dono não encontrado!");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Nome: "); String nomeF = sc.nextLine();
                    System.out.print("Telefone: "); String telF = sc.nextLine();
                    System.out.print("Email: "); String emailF = sc.nextLine();
                    System.out.print("Usuário: "); String usuarioF = sc.nextLine();
                    System.out.print("Senha: "); String senhaF = sc.nextLine();
                    System.out.print("Cargo: "); String cargo = sc.nextLine();
                    System.out.print("Salário: "); double salario = sc.nextDouble();
                    sc.nextLine();
                    Funcionario f = new Funcionario(nomeF, telF, emailF, usuarioF, senhaF, cargo, salario);
                    clinica.cadastrarFuncionario(f);
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;
                }
                case 4: clinica.listarFuncionarios();
                    break;
                case 5: clinica.listarDonos();
                    break;
                case 6: {
                    System.out.print("Nome do animal para registrar atendimento: ");
                    String nomePet = sc.nextLine();
                    Animal pet = clinica.buscarAnimal(nomePet);
                    if (pet != null) {
                        System.out.print("Descrição do atendimento: ");
                        String desc = sc.nextLine();
                        pet.adicionarAtendimento(desc);
                        System.out.println("Atendimento registrado com sucesso!");
                    } else {
                        System.out.println("Animal não encontrado!");
                    }
                    break;
                }
                case 7: {
                    System.out.print("Nome do animal para exibir histórico: ");
                    String nomePet = sc.nextLine();
                    Animal pet = clinica.buscarAnimal(nomePet);
                    if (pet != null) {
                        pet.exibirHistorico();
                    } else {
                        System.out.println("Animal não encontrado!");
                    }
                    break;
                }
                case 0: System.out.println("Saindo...");
                    break;
                default: System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}