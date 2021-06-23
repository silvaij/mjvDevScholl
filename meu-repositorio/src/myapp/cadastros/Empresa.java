package myapp.cadastros;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Empresa {
	private Cadastro cadastro;
	private Long im;
	private Long ie;
	
	public Empresa(Long im, Long ie ) {
		this.im = im;
		this.ie = ie;
	}
	
	public Long getIm() {
		return im;
	}
	
	public Long getIe() {
		return ie;
	}
	
	public Cadastro getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	
	public static boolean validaCnpj(String cnpj){
		String regexNome = "\\b(([0-9]{2})\\.([0-9]{3})\\.([0-9]{3}\\/([0001]{4})\\-([0-9]{2}))";
		Pattern padrao = Pattern.compile(regexNome);
		Matcher combine = padrao.matcher(cnpj);
		return combine.find();
	}
	
}
