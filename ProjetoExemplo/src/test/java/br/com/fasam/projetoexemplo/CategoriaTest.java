/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetoexemplo;

import br.fasam.projetoexemplo.entidades.Categoria;
import junit.framework.TestCase;

/**
 *
 * @author Raphael
 */
public class CategoriaTest extends TestCase {
    
    public CategoriaTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

   public void testNomeDaCategoriaInformado(){
        Categoria categoria = new Categoria("Nome categoria");
        assertNotNull(categoria.getNome());
    }
}
