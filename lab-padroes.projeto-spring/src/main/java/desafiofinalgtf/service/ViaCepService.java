package desafiofinalgtf.service;


import desafiofinalgtf.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author Crkw1
 */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public class ViaCepService {

    @GetMapping("/{cep}/json/")
    public Endereco consultarCep(@PathVariable("cep") String cep) {
        return null;
    }

}
