package com.telep.app.models;

/**
 * Modelo que representa la tabla usuario_final en la base de datos.
 */
public class UsuarioFinal {

    private int idUsuarioFinal;
    private String nombreUsuario;
    private String usuarioRed;
    private long cedula;
    private int tipoContrasenaId;
    private String extensionTel;
    private String estado;
    private Integer campaniaId;

    // Constructor vacío
    public UsuarioFinal() {
    }

    // Constructor completo
    public UsuarioFinal(int idUsuarioFinal, String nombreUsuario, String usuarioRed, long cedula,
                        int tipoContrasenaId, String extensionTel, String estado, Integer campaniaId) {
        this.idUsuarioFinal = idUsuarioFinal;
        this.nombreUsuario = nombreUsuario;
        this.usuarioRed = usuarioRed;
        this.cedula = cedula;
        this.tipoContrasenaId = tipoContrasenaId;
        this.extensionTel = extensionTel;
        this.estado = estado;
        this.campaniaId = campaniaId;
    }

    // GETTERS Y SETTERS COMPLETOS

    public int getIdUsuarioFinal() {
        return idUsuarioFinal;
    }

    public void setIdUsuarioFinal(int idUsuarioFinal) {
        this.idUsuarioFinal = idUsuarioFinal;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUsuarioRed() {
        return usuarioRed;
    }

    public void setUsuarioRed(String usuarioRed) {
        this.usuarioRed = usuarioRed;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public int getTipoContrasenaId() {
        return tipoContrasenaId;
    }

    public void setTipoContrasenaId(int tipoContrasenaId) {
        this.tipoContrasenaId = tipoContrasenaId;
    }

    public String getExtensionTel() {
        return extensionTel;
    }

    public void setExtensionTel(String extensionTel) {
        this.extensionTel = extensionTel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCampaniaId() {
        return campaniaId;
    }

    public void setCampaniaId(Integer campaniaId) {
        this.campaniaId = campaniaId;
    }

    @Override
    public String toString() {
        return "UsuarioFinal{" +
                "idUsuarioFinal=" + idUsuarioFinal +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", usuarioRed='" + usuarioRed + '\'' +
                ", cedula=" + cedula +
                ", tipoContrasenaId=" + tipoContrasenaId +
                ", extensionTel='" + extensionTel + '\'' +
                ", estado='" + estado + '\'' +
                ", campaniaId=" + campaniaId +
                '}';
    }
}
