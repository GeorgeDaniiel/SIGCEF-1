/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletaria.negocio;

import bicicletaria.dao.FornecedorJpaController;
import bicicletaria.dao.exceptions.NonexistentEntityException;
import bicicletaria.dao.exceptions.PreexistingEntityException;
import bicicletaria.modelo.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author George Daniel
 */
public class ControladorFornecedor {
    
    private static Fornecedor fornecedor;
    private static String mensagem;
    public static EntityManagerFactory emf;
    private static FornecedorJpaController dao;
    
    public ControladorFornecedor() {
        fornecedor = new Fornecedor();
        mensagem = null;
        emf = Persistence.createEntityManagerFactory("BicicletariaPU");
        dao = new FornecedorJpaController(emf);
    }
    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String aMensagem) {
        mensagem = aMensagem;
    }
    
    public void inserir(Fornecedor f) {
        try {
            dao.create(f);
            mensagem = "Fornecedor cadastrado com sucesso!";
        } catch (PreexistingEntityException ex) {
            Logger.getLogger(ControladorFornecedor.class.getName()).log(Level.SEVERE, null, ex);
            mensagem = "Já existe um fornecedor com este CPF/CNPJ cadastrado no sistema!";
        } catch (Exception ex) {
            Logger.getLogger(ControladorFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editar(Fornecedor forn) {
        try {
            dao.edit(forn);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ControladorFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluir(String cpf) {
        try {        
            dao.destroy(cpf);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
    public int tamanhoLista() {
        List<Fornecedor> fornecedores = new ArrayList<>();
        fornecedores = dao.findFornecedorEntities();
        return fornecedores.size();
    }
    
    public List<Fornecedor> listaFornecedor(){
        List<Fornecedor> fornecedores = new ArrayList<>();
        fornecedores = dao.findFornecedorEntities();
        return fornecedores;
    }
}
