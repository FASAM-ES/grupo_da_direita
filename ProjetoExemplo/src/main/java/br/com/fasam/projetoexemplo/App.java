package br.com.fasam.projetoexemplo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {
    private App(){
    }
    
    public static void main( String[] args ) {
        Logger logger = Logger.getGlobal();
        
        logger.log(Level.INFO, "Hello World! FASAM" );
    }
}
