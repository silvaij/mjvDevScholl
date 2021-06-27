package digytal.model;

public class Cadastro {

	private Integer id;
	private String nome;
	private Long telefone;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cadastro{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", telefone=" + telefone +
				'}';
	}
}
