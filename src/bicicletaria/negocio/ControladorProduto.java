/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package bicicletaria.negocio;

import bicicletaria.dao.ProdutoJpaController;
import bicicletaria.dao.exceptions.NonexistentEntityException;
import bicicletaria.dao.exceptions.PreexistingEntityException;
import bicicletaria.modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
*
* @author George
*/
public class ControladorProduto {
    
    private static Produto produto;
    private static String mensagem;
    public static EntityManagerFactory emf;
    private static ProdutoJpaController dao;
    
    public ControladorProduto() {
        produto = new Produto();
        mensagem = null;
        emf = Persistence.createEntityManagerFactory("BicicletariaPU");
        dao = new ProdutoJpaController(emf);
    }
    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String aMensagem) {
        mensagem = aMensagem;
    }
    
    public List<Produto> listaProduto() {
        List<Produto> produtos = new ArrayList<Produto>();
        produtos = dao.findProdutoEntities();
        return produtos;
    }
    
    public void inserir(Produto p) {
        try {
            dao.create(p);
            mensagem = "Usuário cadastrado com sucesso!";
        } catch (PreexistingEntityException ex) {
            Logger.getLogger(ControladorProduto.class.getName()).log(Level.SEVERE, null, ex);
            mensagem = "Já existe um produto com este código cadastrado no sistema!";
        } catch (Exception ex) {
            Logger.getLogger(ControladorProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editar(Produto p){
        try {
            dao.edit(p);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorProduto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ControladorProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluir(Long codigo){
        try {
            dao.destroy(codigo);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}