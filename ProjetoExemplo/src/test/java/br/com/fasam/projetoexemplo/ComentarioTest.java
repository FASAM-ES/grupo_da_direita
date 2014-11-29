/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetoexemplo;

import br.fasam.projetoexemplo.entidades.Comentario;
import junit.framework.TestCase;

/**
 *
 * @author Aurélio
 */
public class ComentarioTest extends TestCase {
    
    public ComentarioTest(String testName) {
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
    
    public void testTituloEmComentario() {
        Comentario comentario = new Comentario("titulo");
        assertNotNull(comentario.getTitulo());
    }
    
    public void testDescricaoEmComentario() {
        Comentario comentario = new Comentario("titulo");
        comentario.setDescricao("descricao do comentario");
        assertNotNull(comentario.getDescricao());
    }
}
