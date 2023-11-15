package org.sistema.SistemaMedicoEscolar.modelo;

import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;

import javax.persistence.*;

@Entity
@Table(name = "tratamientos_medicos")
public class TratamientoMedico {

    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(length = 32)
    private String id_tratamiento;

    @ManyToOne
    @JoinColumn(name = "id_cita")
    private CitaMedica citaMedica;

    @ManyToOne
    @JoinColumn(name = "id_medicamento")
    private Medicamento medicamento;

    private String dosificacion;
    private String duracion;

    public String getId_tratamiento() {
        return id_tratamiento;
    }

    public void setId_tratamiento(String id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }

    public void setCitaMedica(CitaMedica citaMedica) {
        this.citaMedica = citaMedica;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosificacion() {
        return dosificacion;
    }

    public void setDosificacion(String dosificacion) {
        this.dosificacion = dosificacion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
