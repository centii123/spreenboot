package erp.pedidos.provincia;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class ProvinciaService {
    
    @Autowired
    ProvinciaRepository repository;
    
    public Provincia save( Provincia entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }
    
    public Provincia findById(long id){
        return repository.findById(id).orElse(null);
    }
    
    public List<Provincia> findAll(){
        return repository.findAll();
    }
}
