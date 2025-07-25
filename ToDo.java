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


    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    public void atualizarNota() {

        if(this.lista.isEmpty()){
            System.out.println("Não há nenhuma nota no sistema.");
        }else {
            ArrayList<Integer> NumerosDasNotas = new ArrayList<>();
            for(int i = 0; i < this.lista.size(); i++){
                NumerosDasNotas.add(i+1);
            }
            while (true){
                //teste
                System.out.println("Você tem: "+NumerosDasNotas.size()+" Notas.");
                System.out.println("Qual número da nota deseja atualizar?");
                int notaASerAtualizada = input.nextInt();
                if(NumerosDasNotas.contains(notaASerAtualizada)){
                    System.out.println("Atualizando nota: "+notaASerAtualizada);
                    System.out.println("Digite o novo contéudo: ");
                    String novaNota = input.next();
                    this.lista.set(notaASerAtualizada-1,novaNota);
                    System.out.println("Atualizado.");
                    break;


                }else {
                    System.out.println("Essa nota não existe.");
                }

        }




        }
    }
}





