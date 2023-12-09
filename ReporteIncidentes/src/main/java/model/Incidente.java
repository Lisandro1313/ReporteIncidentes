import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private Contrato contrato;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

    private LocalDateTime fechaCreacion;

    private boolean resuelto;

    private LocalDateTime fechaResolucion;


    public Incidente(String descripcion, Contrato contrato, Tecnico tecnico, LocalDateTime fechaCreacion, boolean resuelto, LocalDateTime fechaResolucion) {
        this.descripcion = descripcion;
        this.contrato = contrato;
        this.tecnico = tecnico;
        this.fechaCreacion = fechaCreacion;
        this.resuelto = resuelto;
        this.fechaResolucion = fechaResolucion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

    public LocalDateTime getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDateTime fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }
}
