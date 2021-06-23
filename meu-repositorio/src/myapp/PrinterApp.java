package myapp;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import myapp.cadastros.Empresa;
import myapp.pedidos.Pedido;

public class PrinterApp {
	private static final String DATE_FORMATTER= "dd/MM/yyyy HH:mm:ss";
	
	public static void imprimirPedido(Pedido pedido) {
				
		Empresa empresa = pedido.getEmpresa();
		
		StringBuilder sb = new StringBuilder();
		sb.append(empresa.getCadastro().getNome() + "\n");
		sb.append(empresa.getCadastro().getEndereco() + "\n");
		sb.append(String.format("CNPJ: %s \n", empresa.getCadastro().getCnpj()));
		sb.append(String.format("IE: %d\nIM: %d\n",empresa.getIe(), empresa.getIm()));
		sb.append("--------------------------------------------------\n");
		
		//NUMA LINHA DATA FORMATADA - CCF (6) DIGITOS - COO (6DIGITOS)
		//SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		//String dataFormatada = formatador.format(pedido.getData());
		//String dataFormatada = formatador.format(horaDaImpressaoCupom);
		
		LocalDateTime horaDaImpressaoCupom = LocalDateTime.now();
		DateTimeFormatter formatadorDois = DateTimeFormatter.ofPattern(DATE_FORMATTER);
		String dataFormatada = horaDaImpressaoCupom.format(formatadorDois);
			
		sb.append(dataFormatada+"  "+String.format("CCF: %d",pedido.getCcf())+"  "+String.format("CCO: %d",pedido.getCoo())+"\n");
		System.out.println("       CUPOM FISCAL");
		
		sb.append("--------------------------------------------------\n");
		sb.append(String.format("TOTAL %.2f", pedido.getValorTotal()));
		
		
		
		System.out.println(sb.toString());
		/*
		System.out.println(empresa.getCadastro().getNome());
		System.out.println(empresa.getCadastro().getEndereco());
		System.out.println("CNPJ:" + empresa.getCadastro().getCpfCnpj());
		System.out.println("IE:" +empresa.getIe());
		System.out.println("IM:" +empresa.getIm());
		*/
		
	}
}
