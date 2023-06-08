package erp.pedidos.provincia;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface ProvinciaRepository extends CrudRepository <Provincia, Long> {
        
    List<Provincia> findAll();
}
