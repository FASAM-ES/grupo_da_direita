/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetoexemplo;

import br.com.fasam.conexao.ConexaoBD;
import java.sql.Connection;
import junit.framework.TestCase;

/**
 *
 * @author Raphael
 */
public class ConexaoBDTest extends TestCase {
    
    public ConexaoBDTest(String testName) {
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

    public void testConexao(){
        //Connection con = ConexaoBD.getConexao();
        //assertNotNull(con);
    }

}
