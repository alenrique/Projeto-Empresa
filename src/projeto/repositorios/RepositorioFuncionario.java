package projeto.repositorios;
import java.util.ArrayList;

import projeto.basicas.Funcionario;

public class RepositorioFuncionario {
	
	public ArrayList<Funcionario> funcionarios;
	
	public RepositorioFuncionario() {
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		this.funcionarios = funcionarios;
	}
	
	public void adicionar(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void remover(Funcionario funcionario) {
		for(int i = 0; i < this.funcionarios.size(); i++) {
			if(this.funcionarios.get(i).getNumero().equals(funcionario.getNumero())) {
				funcionarios.remove(i);
			}
		}
		System.out.println("Funcionário não existente!");
	}

}
