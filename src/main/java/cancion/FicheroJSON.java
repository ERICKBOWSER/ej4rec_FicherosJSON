
package cancion;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JCarlos
 */
public class FicheroJSON {

    /**
     * @param args the command line arguments
     */
    public static CasoPrueba leerJSON(String nombre) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());
        
        // mapeador.getTypeFactory().constructCollectionType(ArrayList.class, MuebleVO.class)), 
        CasoPrueba caso = mapeador.readValue(new File(nombre), CasoPrueba.class); // Lo pasamos como un objeto, por eso quitamos el constructCollectionType()
        
        //System.out.println(caso);
        
        return caso;        
    }
    
    public static String listarDirectorio(String ruta) {

        String resultado = "";
        
        File f = new File(ruta);
        if (f.exists()) {
            // Obtiene los ficheros y directorios dentro de f y los 
            // devuelve en un array
            File[] ficheros = f.listFiles();
            
            for (File file2 : ficheros) {
                resultado +=  file2.getName() + "\n";
            }
        } else {
            resultado = "El directorio a listar no existe";
        }
        return resultado;
    }
    
}
