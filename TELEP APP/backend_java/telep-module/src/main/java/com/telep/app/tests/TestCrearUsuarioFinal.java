package com.telep.app.tests;

import com.telep.app.dao.UsuarioFinalDAO;
import com.telep.app.models.UsuarioFinal;

public class TestCrearUsuarioFinal {
    public static void main(String[] args) {

        UsuarioFinalDAO dao = new UsuarioFinalDAO();

        UsuarioFinal u = new UsuarioFinal();
        u.setNombreUsuario("Usuario Telep");
        u.setUsuarioRed("utelepx");
        u.setCedula(999999999);
        u.setTipoContrasenaId(1); 
        u.setExtensionTel("1000");
        u.setEstado("OK"); 
        u.setCampaniaId(null);  

        boolean resultado = dao.insert(u);

        System.out.println("Resultado del insert: " + resultado);
    }
}