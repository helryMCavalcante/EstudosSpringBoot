package estudosSpringbotJava.demoestudosSpringbotJava.repository;

import estudosSpringbotJava.demoestudosSpringbotJava.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryProdutos extends JpaRepository<Produtos, Integer> {
   Optional<Produtos> findById(Integer id);
}
