package myapp.cadastros;

public class Endereco {
	private String  rua;
	private Integer numero;
	private String logradouro; //praça , viela , complemento
	private String cidade;
	private Estado estado = new Estado();
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public Estado getEstado() {	
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
		
}
