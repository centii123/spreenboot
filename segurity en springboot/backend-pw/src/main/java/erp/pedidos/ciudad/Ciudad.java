package erp.pedidos.ciudad;

import erp.pedidos.provincia.Provincia;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
    
@Data
@Entity
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String nombre;

    @ManyToOne
    private Provincia provincia;
}
