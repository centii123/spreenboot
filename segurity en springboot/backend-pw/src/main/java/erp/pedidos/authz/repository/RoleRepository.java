package erp.pedidos.authz.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import erp.pedidos.authz.entity.Role;




public interface RoleRepository extends CrudRepository <Role, Long> {

    List<Role> findAll();
    
}
