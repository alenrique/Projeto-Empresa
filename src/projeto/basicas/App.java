package projeto.basicas;

public class App {
	
	public static void main(String[] args) {
		Patrao patrao = new Patrao("Vardenson");
		Funcionario f1 = new Funcionario("João", "01");
		Funcionario f2 = new Funcionario("Maria", "02");
		Funcionario f3 = new Funcionario("Bruno", "03");
		patrao.adicionarFuncionario(f1);
		patrao.adicionarFuncionario(f2);
		patrao.adicionarFuncionario(f3);
		patrao.adicionarMetaColetiva("Carimbar folhas",1);
		patrao.adicionarMetaIndividual("Jogar lixo", f1,2);
		patrao.adicionarMetaIndividual("Botar tinta na impressora", f2,2);
		f1.cumprirMeta();
		f1.cumprirMeta();
		System.out.println(f1.getNome());
		f1.consultarMetas();
		System.out.println(f2.getNome());
		f2.consultarMetas();
		System.out.println(f3.getNome());
		f3.consultarMetas();
		patrao.adicionarPontos(f1);
		patrao.adicionarPontos(f2);
		patrao.adicionarPontos(f3);
		patrao.consultarRanking();
		
				
	}

}
