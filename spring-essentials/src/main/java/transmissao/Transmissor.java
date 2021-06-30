package transmissao;

public class Transmissor {
    public void enviar(Contato contato, String mensagem){
        System.out.println ("Enviando mensagem para " +contato.getNome());
    }
}
