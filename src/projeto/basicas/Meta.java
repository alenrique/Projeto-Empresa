package projeto.basicas;

public class Meta {
	
	private String nomeMeta;
	private int pontos;
	private boolean cumpriuMeta;
	
	public Meta(String nomeMeta, int pontos) {
		this.nomeMeta = nomeMeta;
		this.pontos = pontos;
		this.cumpriuMeta = false;
	}

	public String getNomeMeta() {
		return nomeMeta;
	}

	public void setNomeMeta(String nomeMeta) {
		this.nomeMeta = nomeMeta;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public boolean isCumpriuMeta() {
		return cumpriuMeta;
	}

	public void setCumpriuMeta(boolean cumpriuMeta) {
		this.cumpriuMeta = cumpriuMeta;
	}
	

}
