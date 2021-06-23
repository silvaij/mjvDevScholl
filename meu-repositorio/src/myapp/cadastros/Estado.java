package myapp.cadastros;

import java.util.HashMap;

public class Estado {
     private String sigla;
     private String estado;
     private HashMap<String, String> listaDeEstados = new HashMap<String,String>();
     
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
     
    public String montarListaDeEstados(String sigla) {
    	listaDeEstados.put("AP","Amapá"); 
    	listaDeEstados.put("AM","Amazonas"); 
    	listaDeEstados.put("BA","Bahia"); 
    	listaDeEstados.put("CE","Ceará"); 
    	listaDeEstados.put("DF","Distrito Federal"); 
    	listaDeEstados.put("ES","Espírito Santo"); 
    	listaDeEstados.put("GO","Goiás"); 
    	listaDeEstados.put("MA","Maranhão"); 
    	listaDeEstados.put("MT","Mato Grosso"); 
    	listaDeEstados.put("MS","Mato Grosso do Sul"); 
    	listaDeEstados.put("MG","Minas Gerais"); 
    	listaDeEstados.put("PA","Pará"); 
    	listaDeEstados.put("PB","Paraíba"); 
    	listaDeEstados.put("PR","Paraná"); 
    	listaDeEstados.put("PE","Pernambuco"); 
    	listaDeEstados.put("PI","Piauí"); 
    	listaDeEstados.put("RJ","Rio de Janeiro"); 
    	listaDeEstados.put("RN","Rio Grande do Norte"); 
    	listaDeEstados.put("RS","Rio Grande do Sul"); 
    	listaDeEstados.put("RO","Rondônia"); 
    	listaDeEstados.put("RR","Roraima"); 
    	listaDeEstados.put("SC","Santa Catarina"); 
    	listaDeEstados.put("SP","São Paulo"); 
    	listaDeEstados.put("SE","Sergipe"); 
    	listaDeEstados.put("TO","Tocantins"); 
    	
    	String estado = listaDeEstados.get(sigla);
    	return estado;
    }
	
    
}
