
import java.util.Scanner;

public class App {
	
    public static void main(String[] args) throws Exception {
    	
    	int escolha = 0;
    	int cursoSelecionado = 0;
    	int turmaSelecionada = 0;

        Atendimento atendimento = new Atendimento();
        Scanner scan = new Scanner(System.in);
        
        // Ler a escolha do usuario
        System.out.println("Informe o numero do curso que se interessou, para saber mais informações:");
        
        //Mostra cursos
        atendimento.mostrarCursos();
        
        escolha = scan.nextInt();
        cursoSelecionado = escolha;

        atendimento.limpaTela();

        System.out.println("Informe a turma desejada");
        
        //Mostra turmas
        atendimento.exibeTurmas(cursoSelecionado);
        
        escolha = scan.nextInt();
        turmaSelecionada = escolha;
        
        
        

        //Realiza uma ação de acordo com a escolha do usuario(Precisa ser melhorado)
//        switch (escolha) {
//            case 1:
//            	atendimento.mostraInforme(0);
//                break;
//            case 2:
//            	atendimento.mostraInforme(1);
//                break;
//            case 3:
//            	atendimento.mostraInforme(2);
//                break;
//            case 4:
//
//                break;
//            case 5:
//
//                break;
//
//            default:
//                System.out.println("Opção errada!");
//                break;
//        }
        
        scan.close();

    }

}
