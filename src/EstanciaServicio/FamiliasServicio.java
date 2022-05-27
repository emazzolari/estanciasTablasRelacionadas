
package EstanciaServicio;

import EstanciaEntidades.Familia;
import EstanciaPersistencia.DaoFamilias;
import java.util.Collection;

public class FamiliasServicio {
    
    private DaoFamilias dao;

    public FamiliasServicio() {
        this.dao = new DaoFamilias();
    }
    
     public Collection<Familia> listarFamiliasNumHijosMenorTresYEdadMaxMayorDiez() throws Exception {

        try {

            Collection<Familia> familias = dao.listarFamiliasNumHijosMenorTresYEdadMaxMayorDiez();

            return familias;
        } catch (Exception e) {
            throw e;
        }
    }
    
     public void imprimirFamiliasNumHijosMenorTresYEdadMaxMayorDiez() throws Exception {

        try {

            //Listamos los productos
            Collection<Familia> familias = listarFamiliasNumHijosMenorTresYEdadMaxMayorDiez();

            //Imprimimos los productos
            if (familias.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Familia u : familias) {
                    System.out.println(u.getIdFamilia() + u.getNombre() + u.getEdadMinima() + u.getEdadMaxima() + u.getNumHijos() + u.getEmail() + u.getIdCasaFamilia() +"\n");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
     
     //PUNTO C
    public Collection<Familia> listarFamiliasMailHotmail() throws Exception {

        try {

            Collection<Familia> familias = dao.listarFamiliasMailHotmail();

            return familias;
        } catch (Exception e) {
            throw e;
        }
    }
    //PUNTO C
    public void  imprimirFamiliasMailHotmail() throws Exception {

        try {

            //Listamos los productos
           Collection<Familia> familias = listarFamiliasMailHotmail();

            //Imprimimos los productos
            if (familias.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Familia u : familias) {
                    
                    System.out.println("Nombre: " +u.getNombre() + " | " + " email " + u.getEmail() +" | " + " cantidad hijos: " + u.getNumHijos() +  "\n");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
