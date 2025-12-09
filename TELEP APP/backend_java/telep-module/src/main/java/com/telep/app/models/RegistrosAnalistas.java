package com.telep.app.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistrosAnalistas {

    private int idRegistro;
    private int idUsuarioFinal;
    private int analistaConfiguracionId;
    private Integer analistaCalidadId;
    private Integer idModelo;
    private Integer idRam;
    private Integer idProcesador;
    private Integer idDisco;
    private String tipoDisco;
    private String dualMonitor;
    private String foto;
    private String idActivo;
    private String serial;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estadoRegistro;
    private Integer causaRepeticionId;
    private String justificacionRepeticion;
    private String imagenPath;
    private LocalDateTime creadoEn;
    private LocalDateTime actualizadoEn;

    // Constructor vacío
    public RegistrosAnalistas() {}

    // Constructor completo (para SELECT)
    public RegistrosAnalistas(
        int idRegistro,
        int idUsuarioFinal,
        int analistaConfiguracionId,
        Integer analistaCalidadId,
        Integer idModelo,
        Integer idRam,
        Integer idProcesador,
        Integer idDisco,
        String tipoDisco,
        String dualMonitor,
        String foto,
        String idActivo,
        String serial,
        LocalDate fechaInicio,
        LocalDate fechaFin,
        String estadoRegistro,
        Integer causaRepeticionId,
        String justificacionRepeticion,
        String imagenPath,
        LocalDateTime creadoEn,
        LocalDateTime actualizadoEn
    ) {
        this.idRegistro = idRegistro;
        this.idUsuarioFinal = idUsuarioFinal;
        this.analistaConfiguracionId = analistaConfiguracionId;
        this.analistaCalidadId = analistaCalidadId;
        this.idModelo = idModelo;
        this.idRam = idRam;
        this.idProcesador = idProcesador;
        this.idDisco = idDisco;
        this.tipoDisco = tipoDisco;
        this.dualMonitor = dualMonitor;
        this.foto = foto;
        this.idActivo = idActivo;
        this.serial = serial;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoRegistro = estadoRegistro;
        this.causaRepeticionId = causaRepeticionId;
        this.justificacionRepeticion = justificacionRepeticion;
        this.imagenPath = imagenPath;
        this.creadoEn = creadoEn;
        this.actualizadoEn = actualizadoEn;
    }

    // Getters y setters
    public int getIdRegistro() { return idRegistro; }
    public void setIdRegistro(int idRegistro) { this.idRegistro = idRegistro; }

    public int getIdUsuarioFinal() { return idUsuarioFinal; }
    public void setIdUsuarioFinal(int idUsuarioFinal) { this.idUsuarioFinal = idUsuarioFinal; }

    public int getAnalistaConfiguracionId() { return analistaConfiguracionId; }
    public void setAnalistaConfiguracionId(int analistaConfiguracionId) { this.analistaConfiguracionId = analistaConfiguracionId; }

    public Integer getAnalistaCalidadId() { return analistaCalidadId; }
    public void setAnalistaCalidadId(Integer analistaCalidadId) { this.analistaCalidadId = analistaCalidadId; }

    public Integer getIdModelo() { return idModelo; }
    public void setIdModelo(Integer idModelo) { this.idModelo = idModelo; }

    public Integer getIdRam() { return idRam; }
    public void setIdRam(Integer idRam) { this.idRam = idRam; }

    public Integer getIdProcesador() { return idProcesador; }
    public void setIdProcesador(Integer idProcesador) { this.idProcesador = idProcesador; }

    public Integer getIdDisco() { return idDisco; }
    public void setIdDisco(Integer idDisco) { this.idDisco = idDisco; }

    public String getTipoDisco() { return tipoDisco; }
    public void setTipoDisco(String tipoDisco) { this.tipoDisco = tipoDisco; }

    public String getDualMonitor() { return dualMonitor; }
    public void setDualMonitor(String dualMonitor) { this.dualMonitor = dualMonitor; }

    public String getFoto() { return foto; }
    public void setFoto(String foto) { this.foto = foto; }

    public String getIdActivo() { return idActivo; }
    public void setIdActivo(String idActivo) { this.idActivo = idActivo; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }

    public LocalDate getFechaFin() { return fechaFin; }
    public void setFechaFin(LocalDate fechaFin) { this.fechaFin = fechaFin; }

    public String getEstadoRegistro() { return estadoRegistro; }
    public void setEstadoRegistro(String estadoRegistro) { this.estadoRegistro = estadoRegistro; }

    public Integer getCausaRepeticionId() { return causaRepeticionId; }
    public void setCausaRepeticionId(Integer causaRepeticionId) { this.causaRepeticionId = causaRepeticionId; }

    public String getJustificacionRepeticion() { return justificacionRepeticion; }
    public void setJustificacionRepeticion(String justificacionRepeticion) { this.justificacionRepeticion = justificacionRepeticion; }

    public String getImagenPath() { return imagenPath; }
    public void setImagenPath(String imagenPath) { this.imagenPath = imagenPath; }

    public LocalDateTime getCreadoEn() { return creadoEn; }
    public void setCreadoEn(LocalDateTime creadoEn) { this.creadoEn = creadoEn; }

    public LocalDateTime getActualizadoEn() { return actualizadoEn; }
    public void setActualizadoEn(LocalDateTime actualizadoEn) { this.actualizadoEn = actualizadoEn; }
}