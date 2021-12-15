package projeto.basicas;

import projeto.repositorios.RepositorioMeta;

public class Funcionario extends Pessoa {
	
	private String numero;
	private int pontos;
	public RepositorioMeta repom;
	
	public Funcionario(String nome, String numero) {
		super(nome);
		RepositorioMeta repom = new RepositorioMeta();
		this.numero = numero;
		this.repom = repom;
		
	}

	public int consultarPontos() {
		return pontos;
	}
	
	public void consultarMetas() {
		System.out.println("Metas:");
		for(int i = 0; i < this.repom.metas.size(); i++) {
			System.out.println(this.repom.metas.get(i).getNomeMeta());
			if(this.repom.metas.get(i).isCumpriuMeta()) {
				System.out.println("Meta Cumprida!");
			}else {
				System.out.println("Meta Não Cumprida!");
			}
		}
		System.out.println();
	}
	
	public void cumprirMeta() {
		for(int i = 0; i < this.repom.metas.size(); i++) {
			if(!this.repom.metas.get(i).isCumpriuMeta()) {
				this.repom.metas.get(i).setCumpriuMeta(true);
				break;
			}
		}
	}
	
	public void consultarRanking(Patrao patrao) {
		int i;
		boolean troca;
		Funcionario aux;
	    do{
	        troca = false;
	        for(i = 0; i < patrao.repof.funcionarios.size()-1; i++){
	            if(patrao.repof.funcionarios.get(i).pontos < patrao.repof.funcionarios.get(i+1).pontos){
	                aux = patrao.repof.funcionarios.get(i);
	                patrao.repof.funcionarios.set(i, patrao.repof.funcionarios.get(i+1));
	                patrao.repof.funcionarios.set(i+1, aux);
	                troca = true;
	            }
	        }
	    }while(troca);
	    
		for(i = 0; i < patrao.repof.funcionarios.size() ; i++) {
			if(patrao.repof.funcionarios.get(i).getNome().equals(this.getNome())) {
				System.out.println((i+1) + "º *" + patrao.repof.funcionarios.get(i).getNome() + "* pontos: " + patrao.repof.funcionarios.get(i).pontos);;
			}else {
				System.out.println((i+1) + "º " + patrao.repof.funcionarios.get(i).getNome() + " pontos: " + patrao.repof.funcionarios.get(i).pontos);;
			}
		}
	}

	public String getNumero() {
		return numero;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	
	
}
