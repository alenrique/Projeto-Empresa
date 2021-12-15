package projeto.repositorios;
import java.util.ArrayList;

import projeto.basicas.Meta;

public class RepositorioMeta {
	
	public ArrayList<Meta> metas;
	
	public RepositorioMeta() {
		ArrayList<Meta> metas = new ArrayList<>();
		this.metas = metas;
	}
	
	public void adicionar(Meta meta) {
		this.metas.add(meta);
	}
	
	public void alterarMeta(Meta meta, String nomeMeta) {
		meta.setNomeMeta(nomeMeta);
	}

}
