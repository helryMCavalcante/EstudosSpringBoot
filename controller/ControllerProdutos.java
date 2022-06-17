package estudosSpringbotJava.demoestudosSpringbotJava.controller;

import estudosSpringbotJava.demoestudosSpringbotJava.model.Produtos;
import estudosSpringbotJava.demoestudosSpringbotJava.repository.RepositoryProdutos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class ControllerProdutos {

    @Autowired
    RepositoryProdutos repositoryProdutos;

    @GetMapping("/produtos")
    public List<Produtos> listaProdutos(){
        return repositoryProdutos.findAll();
    }

    @GetMapping("/produtos/{id}")
    public Optional<Produtos> ProdutoUnico(@PathVariable("id") Integer id){
        return repositoryProdutos.findById(id);
    }

    @PostMapping("/produtos")
    public Produtos salvaProduto(@RequestBody Produtos produto){
        return repositoryProdutos.save(produto);
    }
}
