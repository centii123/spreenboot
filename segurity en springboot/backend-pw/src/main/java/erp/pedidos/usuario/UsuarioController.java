package erp.pedidos.usuario;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin({"*"})
public class UsuarioController {
    
    @Autowired
    UsuarioService service;

    @GetMapping("/{id}/")
    public Usuario findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Usuario> findAll(){
        return service.findAll();
    }

    //Create
    //Delimitador de acceso (public, private), tipo de dato de retorno, nombre del método, parametros de entrada { Sentencias }
    @PostMapping("/")
    public Usuario save (@RequestBody Usuario entity ){
        return service.save(entity);
    }

    @PutMapping("/")
    public Usuario update (@RequestBody Usuario entity){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }

    @PatchMapping("/{id}/")
    public Usuario partialUpdate(@PathVariable long id, @RequestBody Map<String, Object> fields){

        Usuario entity = findById(id);

        // itera sobre los campos que se desean actualizar
        for (Map.Entry<String, Object> field : fields.entrySet()) {
            String fieldName = field.getKey();
            Object fieldValue = field.getValue();
            
            // utiliza reflection para establecer el valor del campo en la entidad
            try {
                Field campoEntidad = Usuario.class.getDeclaredField(fieldName);
                campoEntidad.setAccessible(true);
                campoEntidad.set(entity, fieldValue);
            } catch (NoSuchFieldException | IllegalAccessException ex) {
                // maneja la excepción si ocurre algún error al acceder al campo
            }
        }
        return update(entity);
    }

}	