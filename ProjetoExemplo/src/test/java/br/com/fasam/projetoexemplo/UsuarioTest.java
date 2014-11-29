/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetoexemplo;

import br.fasam.projetoexemplo.entidades.Usuario;
import junit.framework.TestCase;

/**
 *
 * @author Raphael
 */
public class UsuarioTest extends TestCase {
    
    public UsuarioTest(String testName) {
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

    public void testNomeDoUsuarioInformado(){
        Usuario usuario = new Usuario("raphael","email@dominio.com","senha123");
        assertNotNull(usuario.getNome());
    }
}
