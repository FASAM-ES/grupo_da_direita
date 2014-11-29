/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetoexemplo;

import br.fasam.projetoexemplo.entidades.Artigo;
import br.fasam.projetoexemplo.entidades.Usuario;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class ArtigoTest extends TestCase {
    
    public ArtigoTest(String testName) {
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
    
    public void testUsuarioEmArtigo() {
        Artigo artigo = new Artigo(new Usuario());
        assertNotNull(artigo.getUsuario());
    }
}
