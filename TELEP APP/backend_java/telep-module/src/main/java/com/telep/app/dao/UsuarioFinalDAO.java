package com.telep.app.dao;

import com.telep.app.config.DBConnection;
import com.telep.app.models.UsuarioFinal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO encargado de manejar operaciones CRUD para la tabla usuario_final.
 */
public class UsuarioFinalDAO {

    /**
     * Inserta un nuevo registro en usuario_final.
     */
    public boolean insert(UsuarioFinal usuario) {

        String sql = "INSERT INTO usuario_final (nombre_usuario, usuario_red, cedula, tipo_contrasena_id, extension_tel, estado, campania_id) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNombreUsuario());
            stmt.setString(2, usuario.getUsuarioRed());
            stmt.setLong(3, usuario.getCedula());
            stmt.setInt(4, usuario.getTipoContrasenaId());
            stmt.setString(5, usuario.getExtensionTel());
            stmt.setString(6, usuario.getEstado());
            stmt.setObject(7, usuario.getCampaniaId()); // puede ser null

            int rows = stmt.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            System.out.println("❌ Error al insertar usuario_final");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Obtiene un usuario por ID.
     */
    public UsuarioFinal getById(int id) {

        String sql = "SELECT * FROM usuario_final WHERE id_usuario_final = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                UsuarioFinal u = new UsuarioFinal();
                u.setIdUsuarioFinal(rs.getInt("id_usuario_final"));
                u.setNombreUsuario(rs.getString("nombre_usuario"));
                u.setUsuarioRed(rs.getString("usuario_red"));
                u.setCedula(rs.getLong("cedula"));
                u.setTipoContrasenaId(rs.getInt("tipo_contrasena_id"));
                u.setExtensionTel(rs.getString("extension_tel"));
                u.setEstado(rs.getString("estado"));
                u.setCampaniaId((Integer) rs.getObject("campania_id"));

                return u;
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al consultar usuario_final por ID");
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Obtiene todos los usuarios.
     */
    public List<UsuarioFinal> getAll() {

        List<UsuarioFinal> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuario_final";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                UsuarioFinal u = new UsuarioFinal();
                u.setIdUsuarioFinal(rs.getInt("id_usuario_final"));
                u.setNombreUsuario(rs.getString("nombre_usuario"));
                u.setUsuarioRed(rs.getString("usuario_red"));
                u.setCedula(rs.getLong("cedula"));
                u.setTipoContrasenaId(rs.getInt("tipo_contrasena_id"));
                u.setExtensionTel(rs.getString("extension_tel"));
                u.setEstado(rs.getString("estado"));
                u.setCampaniaId((Integer) rs.getObject("campania_id"));

                lista.add(u);
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al obtener todos los registros de usuario_final");
            e.printStackTrace();
        }

        return lista;
    }

    /**
     * Actualiza un usuario existente.
     */
    public boolean update(UsuarioFinal usuario) {

        String sql = "UPDATE usuario_final SET nombre_usuario=?, usuario_red=?, cedula=?, tipo_contrasena_id=?, "
                   + "extension_tel=?, estado=?, campania_id=? WHERE id_usuario_final=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNombreUsuario());
            stmt.setString(2, usuario.getUsuarioRed());
            stmt.setLong(3, usuario.getCedula());
            stmt.setInt(4, usuario.getTipoContrasenaId());
            stmt.setString(5, usuario.getExtensionTel());
            stmt.setString(6, usuario.getEstado());
            stmt.setObject(7, usuario.getCampaniaId());
            stmt.setInt(8, usuario.getIdUsuarioFinal());

            int rows = stmt.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            System.out.println("❌ Error al actualizar usuario_final");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Elimina un usuario por ID.
     */
    public boolean delete(int id) {

        String sql = "DELETE FROM usuario_final WHERE id_usuario_final=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            int rows = stmt.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            System.out.println("❌ Error al eliminar usuario_final");
            e.printStackTrace();
            return false;
        }
    }
}
