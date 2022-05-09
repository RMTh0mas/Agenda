import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class App {

    public static void main(String[] args) throws PilhaCheiaException, PilhaVaziaException {
      
        Scanner scan = new Scanner(System.in);
        ArrayList<Contato> agenda = new ArrayList<>();
        String nome = "Teste01";
        String telefone = "40028922";
        String email = "teste01@gmail.com";
        Contato c = new Contato(nome, telefone, email);
        RepositorioDeContatos repositorio = new RepositorioDeContatos(c);
        boolean maisContatos = false; 
        int valor;

        do {

            System.out.println("Bem-vindo a sua agenda!");
            System.out.println("Escolha uma opção para o programa:");
            System.out.println("1 -> Incluir contato");
            System.out.println("2 -> Alterar contato");
            System.out.println("3 -> Desfazer ultima alteração");
            System.out.println("4 -> Excluir contato");
            System.out.println("5 -> Listar contatos");
            System.out.println("6 -> Sair");
            System.out.println("Digite um valor:");
            valor = scan.nextInt();

            switch (valor) {

               case 1: // Incluir contato  

                do {
                    System.out.println("Informe o nome do contato: ");
                    nome = scan.next();
                    
                    System.out.println("Informe o telefone do contato: ");
                    telefone = scan.next();
                    
                    System.out.println("Informe o email do contato: ");
                    email = scan.next();
                    
                    
                    agenda.add(new Contato(nome, telefone, email));
                    repositorio.salvarContato();

                    System.out.println("Deseja informar mais contatos? ");
                    String res = scan.next();
                    maisContatos = res.equalsIgnoreCase("S");
                } while (maisContatos);

                break;

                case 2: // Editar contato

                for (Contato contato: agenda) {

                    System.out.println("Digite o nome do contato que deseja editar:");
                    nome = scan.next();

                    if(contato.getNome().equalsIgnoreCase(nome)){
                        System.out.println("Informe o novo nome do contato: ");
                        nome = scan.next();
                        contato.setNome(nome);

                        System.out.println("Informe o novo telefone do contato: ");
                        telefone = scan.next();
                        contato.setTelefone(telefone);

                        System.out.println("Informe o novo email do contato: ");
                        email = scan.next();
                        contato.setEmail(email);;

                        repositorio.salvarContato(); // Salva o estado do contato
                    }
                }

                break;

                case 3: // desfazer alteração

                repositorio.desfazer();
                repositorio.desfazer();

                for (Contato contato : agenda){
                    System.out.println(contato.getNome());
                    System.out.println(contato.getTelefone());
                    System.out.println(contato.getEmail());
                }

                break;

                case 4: // Excluir contato

                for (Contato contato : agenda){
                    System.out.println(contato.getNome());
                }

                System.out.println("Digite o nome do contato a ser excluído:");
                String nome2 = scan.next();

                

                break;

                case 5: // Exibir contatos

                System.out.println("\n");
                System.out.println("\n");
                System.out.println("\n");
                System.out.println("\n");
                System.out.println("Lista de todos os Contatos:  ");

                for (Contato contato : agenda){
                    System.out.println(contato.getNome());
                }

                System.out.println("\n");
            
                break;

                case 6: // Sair

                System.out.println("Operação finalizada");
                valor = 0;
                break;

                default:

                System.out.println("Opção inválida");

            }

        } while(valor != 0);
    }
  
}
