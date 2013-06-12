/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletaria.negocio;

import bicicletaria.dao.UsuarioJpaController;
import bicicletaria.dao.exceptions.NonexistentEntityException;
import bicicletaria.dao.exceptions.PreexistingEntityException;
import bicicletaria.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Florêncio Neto
 */
public class ControladorUsuario {
    
    private static Usuario usuario;
    private static String mensagem;
    public static EntityManagerFactory emf;
    private static UsuarioJpaController dao;

    public ControladorUsuario() {
        usuario = new Usuario();
        mensagem = null;
        emf = Persistence.createEntityManagerFactory("BicicletariaPU");
        dao = new UsuarioJpaController(emf);
    }
    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String aMensagem) {
        mensagem = aMensagem;
    }
    
    public void inserir(Usuario u) {
        try {
            dao.create(u);
            mensagem = "Usuário cadastrado com sucesso!";
        } catch (PreexistingEntityException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            mensagem = "Já existe um usuário com este CPF cadastrado no sistema!";
        } catch (Exception ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editar(Usuario usu) {
        try {
            dao.edit(usu);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluir(String cpf) {
        try {         
            dao.destroy(cpf);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int tamanhoLista() {
        List<Usuario> usuario = new ArrayList<>();
        usuario = dao.findUsuarioEntities();
        return usuario.size();
    }
    
    public List<Usuario> listaUsuario() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios = dao.findUsuarioEntities();
        return usuarios;
    }
    
    public Boolean login(String l, String s) {
        
        List<Usuario> usuarios = new ArrayList<>();
        Boolean r = Boolean.FALSE;
        mensagem = "Login inválido";
        
        if(l.isEmpty() && s.isEmpty())
            mensagem = "O campo login e o campo senha estão vazios!";
        else if(l.isEmpty() && !(s.isEmpty())) 
            mensagem = "O campo login está vazio!";
        else if(!(l.isEmpty()) && s.isEmpty())
            mensagem = "O campo senha está vazio";
        else {
            usuarios = listaUsuario();
            for(Usuario u : usuarios) {
                if(l.equals(u.getLogin()) && s.equals(u.getSenha())) {
                    mensagem = "Bem vindo!";
                    r = Boolean.TRUE;
                }
            }
        }
        return r;
    }
}
