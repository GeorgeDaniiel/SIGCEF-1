/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletaria.negocio;

import bicicletaria.dao.ClienteJpaController;
import bicicletaria.dao.exceptions.NonexistentEntityException;
import bicicletaria.dao.exceptions.PreexistingEntityException;
import bicicletaria.modelo.Cliente;
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
public class ControladorCliente {
    
    private static Cliente cliente;
    private static String mensagem;
    private static List<Cliente> clientes;
    private static List<Cliente> resultadoBusca;
    public static EntityManagerFactory emf;
    private static ClienteJpaController dao;

    public ControladorCliente() {
        cliente = new Cliente();
        mensagem = null;
        emf = Persistence.createEntityManagerFactory("BicicletariaPU");
        dao = new ClienteJpaController(emf);
    }

    public static String getMensagem() {
        return mensagem;
    }

    public static void setMensagem(String mensagem) {
        ControladorCliente.mensagem = mensagem;
    }

    public static List<Cliente> getResultadoBusca() {
        return resultadoBusca;
    }

    public static void setResultadoBusca(List<Cliente> resultadoBusca) {
        ControladorCliente.resultadoBusca = resultadoBusca;
    }
    
    public void inserir(Cliente c) {
        try {
            dao.create(c);
            mensagem = "Cliente cadastrado com sucesso!";
        } catch (PreexistingEntityException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            mensagem = "Já existe um cliente com este CPF cadastrado no sistema!";
        } catch (Exception ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluir(String cpf) {
        try {
            dao.destroy(cpf);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editar(Cliente cli) {
        try {       
            dao.edit(cli);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    public int tamanhoLista() {
        clientes = new ArrayList<>();
        
        clientes = dao.findClienteEntities();
        return clientes.size();
    }
    
    public List<Cliente> listaCliente(){
        clientes = new ArrayList<>();
        
        clientes = dao.findClienteEntities();
        return clientes;
    }
    
    public void procurarCliente(String s) {
        clientes = new ArrayList<>();
        resultadoBusca = new ArrayList<>();
        
        clientes = listaCliente();
        for(Cliente c : clientes) {
            if(c.getNome().toString().toLowerCase().contains(s.toString().toLowerCase()))
                resultadoBusca.add(c);
        }
        mensagem = "Cliente(s) encontrado(s)!";
    }
}