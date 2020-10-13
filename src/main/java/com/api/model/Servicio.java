package com.api.model;

import javax.persistence.*;
import java.sql.DatabaseMetaData;
import java.util.Date;

@Entity
@Table(name = "servicios")
public class Servicio {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "identificador_empleado")
    private String identificadorempleado;

    @Column(name = "identicador_servicio")
    private String identicadorservicio;

    @Column(name = "fecha_inicial")
    private String fechainicial;

    @Column(name = "hora_inicial")
    private String horainicial;

    @Column(name = "fecha_final")
    private String fechafinal;

    @Column(name = "hora_final")
    private String horafinal;

    @Column(name = "horas_normales")
    private int horasnormales;

    @Column(name = "horas_nocturnas")
    private int horasnocturnas;

    @Column(name = "horas_domingo")
    private int horasdomingo;

    @Column(name = "valor_hora")
    private int valorhora;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentificadorempleado() {
        return identificadorempleado;
    }

    public void setIdentificadorempleado(String identificadorempleado) {
        this.identificadorempleado = identificadorempleado;
    }

    public String getIdenticadorservicio() {
        return identicadorservicio;
    }

    public void setIdenticadorservicio(String identicadorservicio) {
        this.identicadorservicio = identicadorservicio;
    }

    public String getFechainicial() {
        return fechainicial;
    }

    public void setFechainicial(String fechainicial) {
        this.fechainicial = fechainicial;
    }

    public String getHorainicial() {
        return horainicial;
    }

    public void setHorainicial(String horainicial) {
        this.horainicial = horainicial;
    }

    public String getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(String fechafinal) {
        this.fechafinal = fechafinal;
    }

    public String getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(String horafinal) {
        this.horafinal = horafinal;
    }

    public int getHorasnormales() {
        return horasnormales;
    }

    public void setHorasnormales(int horasnormales) {
        this.horasnormales = horasnormales;
    }

    public int getHorasnocturnas() {
        return horasnocturnas;
    }

    public void setHorasnocturnas(int horasnocturnas) {
        this.horasnocturnas = horasnocturnas;
    }

    public int getHorasdomingo() {
        return horasdomingo;
    }

    public void setHorasdomingo(int horasdomingo) {
        this.horasdomingo = horasdomingo;
    }

    public int getValorhora() {
        return valorhora;
    }

    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }
}
