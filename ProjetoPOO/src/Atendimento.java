
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Atendimento {
	
	private List<Aluno> alunosCadastrados = new ArrayList<Aluno>();
	private List<Curso> cursosCadastrados = new ArrayList<Curso>();
	
	public Atendimento() {
		
		carregaAlunos();
		carregaCursos(this.alunosCadastrados);
		
	}
	
	public void limpaTela() throws InterruptedException, IOException {
		
		//Limpa a tela 
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
	
	}
	
	public List<Aluno> getAlunosCadastrados() {
		return alunosCadastrados;
	}

	public List<Curso> getCursosCadastrados() {
		return cursosCadastrados;
	}

	public boolean verificaCadastro(String cpf) {
		
		for(Aluno aluno : this.alunosCadastrados){
			if(aluno.getCpf().equals(cpf))
				return true;
		}
		
		return false;
	
	}
	
	public void carregaAlunos() {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setId(1);
		aluno1.setNome("Jobson");
		aluno1.setCpf("25610942177");
		aluno1.setEmail("jobsonc@gmail.com");
		aluno1.setNumero(985741237);
		
		this.alunosCadastrados.add(aluno1);
		
	}
	
	public void carregaCursos(List<Aluno> a) {
		
		List<Turma> listaTurma = new ArrayList<Turma>();
		List<Matricula> listaMatriculas = new ArrayList<Matricula>();
		
		Curso c1 = new Curso();
		
		c1.setId(1);
		c1.setNome("Matemática");
		
		Turma t1 = new Turma();
		
		t1.setId(1);
		t1.setTurno("noite");
		t1.setDataInicio("01/08/2022");
		t1.setHorarioInicio("19:00");
		t1.setHorarioFim("21:50");
		t1.setQtdAlunos(1);
		
		Matricula m1 = new Matricula();
		
		m1.setId(202201);
		m1.setIdAluno(a.get(0).getId());
		
		listaMatriculas.add(m1);
		t1.setListaMatricula(listaMatriculas);
		
		listaTurma.add(t1);
		c1.setListaTurma(listaTurma);
		
		this.cursosCadastrados.add(c1);
		
	}

    //Apresenta os cursos Disponiveis ofertados(Precisa ser melhorado)
    public void mostrarCursos() {
    	
    	System.out.println("--------------Cursos Diponíveis--------------");
    	
    	for(Curso curso : this.cursosCadastrados){
    		System.out.println(curso.getId() + " " + curso.getNome());
		}
    	
    	System.out.println("---------------------------------------------");
       
    }
    
    public void exibeTurmas(int idCurso) {
    	
    	System.out.println("--------------Turmas Diponíveis--------------");
    	
    	Curso cursoSelecionado = this.cursosCadastrados.get(idCurso - 1);
    			
		for(Turma turma : cursoSelecionado.getListaTurma()) {
			
			System.out.println("Turma: (" + turma.getId() + ") | " + 
							   " Turno: " + turma.getTurno() + " | " +
							   " Data de início: " + turma.getDataInicio() + " | " +
							   " Horário: " + turma.getHorarioInicio() + " até " + turma.getHorarioFim() + " | " +
							   " Matrículas: " + "(" + turma.getQtdAlunos() + "/10)");
			
		}
    	
    }
    
    public void realizaMatricula(int idCurso, int idTurma, int idAluno) {
    	
    	Curso cursoSelecionado = this.cursosCadastrados.get(idCurso - 1);
    	Turma turmaSelecionada = cursoSelecionado.getListaTurma().get(idTurma - 1);  
    	
    	int qtdMatriculados = turmaSelecionada.getQtdAlunos();
    	
    	Matricula matricula = new Matricula();
    	
    	String idMatricula = "2022" + "0" + turmaSelecionada.getQtdAlunos() + 1;
    	
    	matricula.setId(Integer.parseInt(idMatricula));
    	matricula.setIdAluno(idAluno);
    	
    	if(turmaSelecionada.getQtdAlunos() == turmaSelecionada.getQtdMaxima()) {
    		
    	} else {
    		
    		turmaSelecionada.getListaMatricula().add(matricula);
    		turmaSelecionada.setQtdAlunos(qtdMatriculados + 1);
    		
    	}
    	
    }
    
}
