/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetoexemplo;

import junit.framework.TestCase;
import br.fasam.projetoexemplo.entidades.Tag;

/**
 *
 * @author Aluno
 */
public class TagTeste extends TestCase {
    
    public TagTeste(String testName) {
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
    
    public void testValidaNomeInformado(){
        Tag t = new Tag("is the man!");
        assertNotNull(t.getNome());
    }
    
    public void testValidaDescricaoInformada() {
        Tag t = new Tag("joffre", "desenvolvedor BI");
        assertNotNull(t.getDescricao());
    }
    
    
    
}
