package model;


public class ListaComboNacionalidade {
	
	private Long codigo;
	private String descricao;
	
	
	
	public ListaComboNacionalidade() {
	
	}
	
	
	public ListaComboNacionalidade(Long codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	}
