package com.telep.app.tests;

import com.telep.app.dao.RegistrosAnalistasDAO;
import com.telep.app.models.RegistrosAnalistas;

import java.time.LocalDate;

public class TestRegistrosAnalistas {

    public static void main(String[] args) {

        RegistrosAnalistasDAO dao = new RegistrosAnalistasDAO();

        System.out.println("===== PRUEBA: INSERTAR REGISTRO =====");

        RegistrosAnalistas nuevo = new RegistrosAnalistas();
        nuevo.setIdUsuarioFinal(7);
        nuevo.setAnalistaConfiguracionId(2);
        nuevo.setAnalistaCalidadId(5); // puede ser null

        nuevo.setIdModelo(3);
        nuevo.setIdRam(2);
        nuevo.setIdProcesador(2);
        nuevo.setIdDisco(1);

        nuevo.setTipoDisco("SSD");
        nuevo.setDualMonitor("SI");
        nuevo.setFoto("NO");

        nuevo.setIdActivo("ACT-123");
        nuevo.setSerial("SR-999");

        nuevo.setFechaInicio(LocalDate.now());
        nuevo.setFechaFin(null); // permitido

        nuevo.setEstadoRegistro("pendiente");

        nuevo.setCausaRepeticionId(null); // ✔ permitido
        nuevo.setJustificacionRepeticion("N/A");
        nuevo.setImagenPath("ruta_demo.png");

        boolean insertResult = dao.insert(nuevo);
        System.out.println("Resultado del Insert: " + insertResult);


        // ====================================
        // LISTAR TODO
        // ====================================
        System.out.println("===== LISTA COMPLETA =====");

        dao.getAll().forEach(r ->
                System.out.println("Registro #" + r.getIdRegistro()
                        + " | Usuario Final: " + r.getIdUsuarioFinal()
                        + " | Modelo: " + r.getIdModelo()
                        + " | Procesador: " + r.getIdProcesador()
                        + " | Estado: " + r.getEstadoRegistro())
        );


        // ====================================
        // SELECT POR ID
        // ====================================
        System.out.println("\n===== SELECT POR ID =====");

        // obtenemos el último insertado (id más alto)
        RegistrosAnalistas ultimo = dao.getAll().isEmpty() ? null : dao.getAll().get(0);

        if (ultimo != null) {
            RegistrosAnalistas found = dao.getById(ultimo.getIdRegistro());
            if (found != null) {
                System.out.println("Resultado: OK");
            } else {
                System.out.println("Resultado: NO ENCONTRADO");
            }
        }


        // ====================================
        // UPDATE
        // ====================================
        System.out.println("\n===== UPDATE =====");

        if (ultimo != null) {

            ultimo.setEstadoRegistro("aprobado");
            ultimo.setAnalistaCalidadId(5);
            ultimo.setCausaRepeticionId(null); // NULO PERMITIDO
            ultimo.setJustificacionRepeticion("Actualizado correctamente");

            boolean updateResult = dao.update(ultimo);
            System.out.println("Resultado del Update: " + updateResult);
        }


        // ====================================
        // DELETE
        // ====================================
        System.out.println("\n===== DELETE =====");

        if (ultimo != null) {
            boolean deleteResult = dao.delete(ultimo.getIdRegistro());
            System.out.println("Resultado del Delete: " + deleteResult);
        }
    }
}