package myapp.cadastros;



public class Cadastro {
	//tipo + identificador = valor é opcional
	private Integer id;
	private String nome;
	private Long telefone;
	private String email;
	private String endereco;
	private String cnpj;
	private String cpf;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		String cpfFormatado = formatarCpf(cpf);
		this.cpf = cpfFormatado;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		String cnpjFormatado = formatarCnpj(cnpj);
		this.cnpj = cnpjFormatado;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	
	public Long getTelefone() {		
		return telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private Integer getId() {
		return id;
	}
	private void setId(Integer id){
		this.id = id;
	}
	
	public static String formatarCnpj(String doc) {
		String cnpjFormatado = doc.replaceAll( "(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})" , "$1.$2.$3/$4-$5" );
		return cnpjFormatado;
	}
	
	public static String formatarCpf(String doc) {
		String cpfFormatado = doc.replaceAll( "(\\d{3})(\\d{3})(\\d{3})(\\d{2})" , "$1.$2.$3-$4" );
		return cpfFormatado;
	}
	
}


















