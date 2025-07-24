import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem vindo ao programa de Notas!");
        //
        ToDo notas = new ToDo();
        int option;
        int controle = -1;
        System.out.println("=========");
        while (controle ==-1) {
            System.out.println("Lista de Opções:");
            System.out.println("1-Cadastrar Nota");
            System.out.println("2-Consultas Notas");
            System.out.println("3-Deletar Notas");
            System.out.println("4-Sair");
            option = validacaoOpcao("Insira o número correspondente", input);
            switch (option) {
                case 1 -> notas.adicionarNota();
                case 2 -> notas.consultarNotas();
                case 3 -> notas.deletarNotas();
                case 4 -> {
                    System.out.println("Saindo do programa...");
                    controle = -2;
                }


            }


        }

    }
    public static int validacaoOpcao(String mensagem, Scanner input){
        while (true){
            try{
                System.out.println(mensagem);
                int option = input.nextInt();
                if(option < 1 || option > 5){
                    System.out.println("Valores fora da faixa.");
                }else {
                    System.out.println("Você escolheu a opção: "+option);
                    return option;
                }

            }catch(Exception e){
                System.out.println("Valor inválido.");
                input.next();
            }
        }
    }


}
