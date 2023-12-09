import javax.persistence.*;
import java.util.List;

@Entity
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String medioDeNotificacion;

    @ManyToMany
    @JoinTable(
            name = "tecnico_especialidad",
            joinColumns = @JoinColumn(name = "tecnico_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id"))
    private List<Especialidad> especialidades;

    @OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL)
    private List<Incidente> incidentes;

    public Tecnico(String nombre, String medioDeNotificacion, List<Especialidad> especialidades, List<Incidente> incidentes) {
        this.nombre = nombre;
        this.medioDeNotificacion = medioDeNotificacion;
        this.especialidades = especialidades;
        this.incidentes = incidentes;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedioDeNotificacion() {
        return medioDeNotificacion;
    }

    public void setMedioDeNotificacion(String medioDeNotificacion) {
        this.medioDeNotificacion = medioDeNotificacion;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }
}
