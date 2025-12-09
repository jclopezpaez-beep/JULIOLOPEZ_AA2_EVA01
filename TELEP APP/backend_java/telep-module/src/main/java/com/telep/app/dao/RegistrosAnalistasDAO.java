package com.telep.app.dao;

import com.telep.app.config.DBConnection;
import com.telep.app.models.RegistrosAnalistas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RegistrosAnalistasDAO {

    // ==================
    // INSERTAR REGISTRO
    // ===================
    public boolean insert(RegistrosAnalistas r) {

        String sql = "INSERT INTO registros_analistas (" +
                "id_usuario_final, analista_configuracion_id, analista_calidad_id, " +
                "id_modelo, id_ram, id_procesador, id_disco, tipo_disco, dual_monitor, foto, " +
                "id_activo, serial, fecha_inicio, fecha_fin, estado_registro, causa_repeticion_id, " +
                "justificacion_repeticion, imagen_path" +
                ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, r.getIdUsuarioFinal());
            ps.setInt(2, r.getAnalistaConfiguracionId());

            if (r.getAnalistaCalidadId() != null) ps.setInt(3, r.getAnalistaCalidadId());
            else ps.setNull(3, Types.INTEGER);

            ps.setInt(4, r.getIdModelo());
            ps.setInt(5, r.getIdRam());
            ps.setInt(6, r.getIdProcesador());
            ps.setInt(7, r.getIdDisco());

            ps.setString(8, r.getTipoDisco());
            ps.setString(9, r.getDualMonitor());
            ps.setString(10, r.getFoto());
            ps.setString(11, r.getIdActivo());
            ps.setString(12, r.getSerial());

            ps.setDate(13, java.sql.Date.valueOf(r.getFechaInicio()));

            if (r.getFechaFin() != null) ps.setDate(14, java.sql.Date.valueOf(r.getFechaFin()));
            else ps.setNull(14, Types.DATE);

            ps.setString(15, r.getEstadoRegistro());

            if (r.getCausaRepeticionId() != null) ps.setInt(16, r.getCausaRepeticionId());
            else ps.setNull(16, Types.INTEGER);

            ps.setString(17, r.getJustificacionRepeticion());
            ps.setString(18, r.getImagenPath());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("❌ Error en INSERT:");
            e.printStackTrace();
            return false;
        }
    }

    // ================
    // OBTENER POR ID
    // ================
    public RegistrosAnalistas getById(int id) {
        String sql = "SELECT * FROM registros_analistas WHERE id_registro = ?";
        RegistrosAnalistas r = null;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                r = map(rs);
            }

        } catch (SQLException e) {
            System.out.println("❌ Error en SELECT por ID:");
            e.printStackTrace();
        }

        return r;
    }

    // =================================
    // LISTAR TODOS
    // =================================
    public List<RegistrosAnalistas> getAll() {
        List<RegistrosAnalistas> lista = new ArrayList<>();
        String sql = "SELECT * FROM registros_analistas ORDER BY id_registro DESC";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(map(rs));
            }

        } catch (SQLException e) {
            System.out.println("❌ Error en SELECT ALL:");
            e.printStackTrace();
        }

        return lista;
    }

    // ==========
    // UPDATE
    // =========
    public boolean update(RegistrosAnalistas r) {
        String sql = "UPDATE registros_analistas SET " +
                "id_usuario_final=?, analista_configuracion_id=?, analista_calidad_id=?, " +
                "id_modelo=?, id_ram=?, id_procesador=?, id_disco=?, tipo_disco=?, dual_monitor=?, foto=?, " +
                "id_activo=?, serial=?, fecha_inicio=?, fecha_fin=?, estado_registro=?, causa_repeticion_id=?, " +
                "justificacion_repeticion=?, imagen_path=? " +
                "WHERE id_registro=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, r.getIdUsuarioFinal());
            ps.setInt(2, r.getAnalistaConfiguracionId());

            if (r.getAnalistaCalidadId() != null) ps.setInt(3, r.getAnalistaCalidadId());
            else ps.setNull(3, Types.INTEGER);

            ps.setInt(4, r.getIdModelo());
            ps.setInt(5, r.getIdRam());
            ps.setInt(6, r.getIdProcesador());
            ps.setInt(7, r.getIdDisco());

            ps.setString(8, r.getTipoDisco());
            ps.setString(9, r.getDualMonitor());
            ps.setString(10, r.getFoto());
            ps.setString(11, r.getIdActivo());
            ps.setString(12, r.getSerial());

            ps.setDate(13, java.sql.Date.valueOf(r.getFechaInicio()));

            if (r.getFechaFin() != null) ps.setDate(14, java.sql.Date.valueOf(r.getFechaFin()));
            else ps.setNull(14, Types.DATE);

            ps.setString(15, r.getEstadoRegistro());

            if (r.getCausaRepeticionId() != null) ps.setInt(16, r.getCausaRepeticionId());
            else ps.setNull(16, Types.INTEGER);

            ps.setString(17, r.getJustificacionRepeticion());
            ps.setString(18, r.getImagenPath());

            ps.setInt(19, r.getIdRegistro());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("❌ Error en UPDATE:");
            e.printStackTrace();
            return false;
        }
    }

    // =================================
    // DELETE
    // =================================
    public boolean delete(int id) {
        String sql = "DELETE FROM registros_analistas WHERE id_registro = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("❌ Error en DELETE:");
            e.printStackTrace();
            return false;
        }
    }

    // =================================
    // MAPEO (SELECT → OBJETO)
    // =================================
    private RegistrosAnalistas map(ResultSet rs) throws SQLException {

        return new RegistrosAnalistas(
                rs.getInt("id_registro"),
                rs.getInt("id_usuario_final"),
                rs.getInt("analista_configuracion_id"),
                (Integer) rs.getObject("analista_calidad_id"),
                (Integer) rs.getObject("id_modelo"),
                (Integer) rs.getObject("id_ram"),
                (Integer) rs.getObject("id_procesador"),
                (Integer) rs.getObject("id_disco"),
                rs.getString("tipo_disco"),
                rs.getString("dual_monitor"),
                rs.getString("foto"),
                rs.getString("id_activo"),
                rs.getString("serial"),
                rs.getDate("fecha_inicio").toLocalDate(),
                rs.getDate("fecha_fin") != null ? rs.getDate("fecha_fin").toLocalDate() : null,
                rs.getString("estado_registro"),
                (Integer) rs.getObject("causa_repeticion_id"),
                rs.getString("justificacion_repeticion"),
                rs.getString("imagen_path"),
                rs.getTimestamp("creado_en").toLocalDateTime(),
                rs.getTimestamp("actualizado_en").toLocalDateTime()
        );
    }
}