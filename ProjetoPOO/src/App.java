
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Cursos informe = new Cursos();
        informe.registroCursos();

        Atendimento cursos = new Atendimento();
        cursos.MostrarCurso();
   
        Scanner scan = new Scanner(System.in);
        // Ler a escolha do usuario
        System.out.println("Informe o numero do curso que se interessou, para saber mais informações:");
        int escolha = scan.nextInt();

        //Limpa a tela 
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

        //Realiza uma ação de acordo com a escolha do usuario(Precisa ser melhorado)
        switch (escolha) {
            case 1:
                informe.mostraInforme(0);
                break;
            case 2:
                informe.mostraInforme(1);
                break;
            case 3:
                informe.mostraInforme(2);
                break;
            case 4:

                break;
            case 5:

                break;

            default:
                System.out.println("Opção errada!");
                break;
        }
        scan.close();

    }
}
