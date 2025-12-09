package com.telep.app.tests;

import com.telep.app.dao.UsuarioFinalDAO;
import com.telep.app.models.UsuarioFinal;

import java.util.List;

/**
 * Clase de pruebas para verificar el funcionamiento del CRUD
 * de la tabla usuario_final usando JDBC.
 */
public class TestUsuarioFinal {
    public static void main(String[] args) {

        UsuarioFinalDAO dao = new UsuarioFinalDAO();

        System.out.println("\n===== PRUEBA: INSERTAR USUARIO =====");
        UsuarioFinal nuevo = new UsuarioFinal();
        nuevo.setNombreUsuario("Juan Pérez");
        nuevo.setUsuarioRed("jperez");
        nuevo.setCedula(123456789);
        nuevo.setTipoContrasenaId(1);
        nuevo.setExtensionTel("3012");
        nuevo.setEstado("PENDIENTE");
        nuevo.setCampaniaId(null);  // permite NULL

        boolean insertado = dao.insert(nuevo);
        System.out.println("Resultado del insert: " + insertado);

        System.out.println("\n===== PRUEBA: OBTENER TODOS LOS USUARIOS =====");
        List<UsuarioFinal> lista = dao.getAll();
        for (UsuarioFinal u : lista) {
            System.out.println(u);
        }

        if (!lista.isEmpty()) {
            int idPrueba = lista.get(0).getIdUsuarioFinal();

            System.out.println("\n===== PRUEBA: CONSULTAR POR ID =====");
            UsuarioFinal encontrado = dao.getById(idPrueba);
            System.out.println(encontrado);

            System.out.println("\n===== PRUEBA: ACTUALIZAR USUARIO =====");
            encontrado.setNombreUsuario("Juan Actualizado");
            encontrado.setEstado("DESHABILITADO");
            boolean actualizado = dao.update(encontrado);
            System.out.println("Resultado del update: " + actualizado);

            System.out.println("\n===== PRUEBA: CONSULTAR NUEVAMENTE =====");
            UsuarioFinal actualizado2 = dao.getById(idPrueba);
            System.out.println(actualizado2);

            System.out.println("\n===== PRUEBA: ELIMINAR USUARIO =====");
            boolean eliminado = dao.delete(idPrueba);
            System.out.println("Resultado del delete: " + eliminado);
        } else {
            System.out.println("No hay registros para probar UPDATE y DELETE.");
        }
    }
}
