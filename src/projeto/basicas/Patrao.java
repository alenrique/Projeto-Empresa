package projeto.basicas;
import projeto.repositorios.RepositorioFuncionario;

public class Patrao extends Pessoa {
	
	public RepositorioFuncionario repof;
	
	public Patrao(String nome) {
		super(nome);
		RepositorioFuncionario repof = new RepositorioFuncionario();
		this.repof = repof;
	}
	
	
	public void adicionarFuncionario(Funcionario funcionario) {
		this.repof.adicionar(funcionario);
	}
	
	public void removerFuncionario(Funcionario funcionario) {
		this.repof.remover(funcionario);
	}
	
	public void adicionarPontos(Funcionario funcionario) {
		for(int i = 0; i < funcionario.repom.metas.size(); i++) {
			if(funcionario.repom.metas.get(i).isCumpriuMeta()) {
				int pon = funcionario.getPontos();
				funcionario.setPontos(pon+=funcionario.repom.metas.get(i).getPontos());
			}
		}
	}
	
	public void retirarPontos(Funcionario funcionario, int num) {
		int pon = funcionario.getPontos();
		funcionario.setPontos(pon-=num);
	}
	
	public void adicionarMetaIndividual(String nomeMeta, Funcionario funcionario, int pontos) {
		Meta meta = new Meta(nomeMeta,pontos);
		funcionario.repom.adicionar(meta);
	}
	
	public void adicionarMetaColetiva(String nomeMeta, int pontos) {
		Meta meta = new Meta(nomeMeta,pontos);
		for(int i = 0; i < this.repof.funcionarios.size(); i++) {
			this.repof.funcionarios.get(i).repom.adicionar(meta);
		}
	}
	
	public void consultarRanking() {
		int i;
		boolean troca;
		Funcionario aux;
	    do{
	        troca = false;
	        for(i = 0; i < this.repof.funcionarios.size()-1; i++){
	            if(this.repof.funcionarios.get(i).getPontos() < this.repof.funcionarios.get(i+1).getPontos()){
	                aux = this.repof.funcionarios.get(i);
	                this.repof.funcionarios.set(i, this.repof.funcionarios.get(i+1));
	                this.repof.funcionarios.set(i+1, aux);
	                troca = true;
	            }
	        }
	    }while(troca);
	    
		for(i = 0; i < this.repof.funcionarios.size() ; i++) {
			System.out.println((i+1) + "º " + this.repof.funcionarios.get(i).getNome() + " pontos: " + this.repof.funcionarios.get(i).getPontos());;
		}
	}
	
	

}
