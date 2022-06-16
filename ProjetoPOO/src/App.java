
import java.util.Scanner;

public class App {
	
    public static void main(String[] args) throws Exception {
    	
    	int escolhaInt = 1;
        
    	Atendimento atendimento = new Atendimento();
        Scanner scan = new Scanner(System.in);
        
        while(escolhaInt > 0) {
        	
        	System.out.println("1 - Iniciar cadastramento");
            System.out.println("2 - Exibir alunos cadastrados");
            System.out.println("3 - Exibir cursos e turmas");
            System.out.println("0 - Encerra aplicação");
        	
	    	 escolhaInt = Integer.parseInt(scan.nextLine());
	         
	         switch(escolhaInt) {
	         
	 		    case 1:
	 		    	atendimento.iniciaCadastro();
	 		    	break;
	 		    case 2:
	 		    	atendimento.mostraAlunosCadastrados();
	 		    	break;
	 		    case 3:
	 		    	atendimento.mostraCursosTurmas();
	 		    	break;
	 		    case 0:
	 		    	System.out.println("Fim da execução!");
	 		    	break;
	         		
	         }
        	
        }
        
        scan.close();
        
    }

}
