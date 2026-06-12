package com.mycompany.biblioteca_digital.servicio;

import com.mycompany.biblioteca_digital.modelo.Administrador;
import com.mycompany.biblioteca_digital.modelo.Usuario;

public class AppContext {

    private static AppContext instancia;
    private final RegistroUsuario registroUsuario;

    private AppContext() {
        this.registroUsuario = new RegistroUsuario();
        cargarDatosIniciales();
    }

    public static AppContext getInstance() {
        if (instancia == null) {
            instancia = new AppContext();
        }
        return instancia;
    }

    private void cargarDatosIniciales() {

        // ADMINISTRADOR por defecto
        Administrador admin = new Administrador();
        admin.setCedula("0000000000");
        admin.setNombre("Admin");
        admin.setApellido("Principal");
        admin.setMail("admin@biblioteca.com");
        admin.setDireccion("Biblioteca UET");
        admin.setUsuario("admin");
        admin.setContraseña("admin123");
        admin.setActivo(true);
        registroUsuario.registrarAdministrador(admin);

        // USUARIO 1
        Usuario u1 = new Usuario();
        u1.setCedula("1234567890");
        u1.setNombre("Juan");
        u1.setApellido("Pérez");
        u1.setMail("juan@mail.com");
        u1.setDireccion("Quito");
        u1.setUsuario("juan123");
        u1.setContraseña("juan123");
        u1.setActivo(true);
        registroUsuario.registrarUsuario(u1);

        // USUARIO 2
        Usuario u2 = new Usuario();
        u2.setCedula("0987654321");
        u2.setNombre("Maria");
        u2.setApellido("García");
        u2.setMail("maria@mail.com");
        u2.setDireccion("Quito");
        u2.setUsuario("maria123");
        u2.setContraseña("maria123");
        u2.setActivo(true);
        registroUsuario.registrarUsuario(u2);
    }

    public RegistroUsuario getRegistroUsuario() { 
        return registroUsuario; 
    }
}