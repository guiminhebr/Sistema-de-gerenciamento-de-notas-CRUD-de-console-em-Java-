import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {
    Scanner input = new Scanner(System.in);
    private ArrayList<String> lista = new ArrayList<>();
    public void adicionarNota(){
        while (true){
            System.out.println("Escreva sua nota: ");
            String nota = input.nextLine();
            if(nota.equals("")){
                System.out.println("Nota vazia!");
            }else {
                lista.add(nota);
                System.out.println("Nota adicionada com sucesso.");
                break;
            }

        }


    }


    public void consultarNotas() {
        System.out.println("Mostrando todas as notas: ");
        for(int i = 0; i < lista.size();i++){
            System.out.println((i+1)+"-"+lista.get(i));
        }

    }

    public void deletarNotas() {
        if(lista.isEmpty()){
            System.out.println("Não tem nada a se deletar.");
        }else {
            lista.clear();
            System.out.println("Notas deletadas com sucesso.");
        }
    }


                }





