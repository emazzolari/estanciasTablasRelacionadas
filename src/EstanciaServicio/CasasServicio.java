package EstanciaServicio;

import EstanciaEntidades.Casa;
import EstanciaPersistencia.DaoCasas;
import EstanciaPersistencia.DaoFamilias;
import java.util.Collection;

public class CasasServicio {
       private DaoCasas dao;

    public CasasServicio() {
        this.dao = new DaoCasas();
    }
    
   public Collection<Casa> listarCasas() throws Exception {

        try {

           Collection<Casa> casas = dao.listarCasas();

            return casas;
        } catch (Exception e) {
            throw e;
        }
    }
    public void imprimirCasas() throws Exception {

        try {

            //Listamos los productos
            Collection<Casa> casas = listarCasas();

            //Imprimimos los productos
            if (casas.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Casa u : casas) {

                    System.out.println("IdCasa " + u.getIdCasa() + " | " + " pais: "  + u.getPais() + " | " +" Fecha Desde: " + u.getFechaDesde()+"fecha hasta " + u.getFechaHasta() +  "\n");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
