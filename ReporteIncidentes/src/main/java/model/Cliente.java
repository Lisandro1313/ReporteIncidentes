import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String razonSocial;
    private String cuit;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Contrato> contratos;


    public Cliente(String razonSocial, String cuit, List<Contrato> contratos) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.contratos = contratos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }
}
