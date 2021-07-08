package transmissao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class Transmissor {
    public void enviar(Contato contato, String mensagem){
        System.out.println ("Enviando mensagem para " + contato.getTelefone());      
        System.out.println(String.format("Ola %s, \n%s", contato.getNome(),mensagem));
    }
}
