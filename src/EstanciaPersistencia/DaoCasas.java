package EstanciaPersistencia;

import EstanciaEntidades.Casa;
import java.util.ArrayList;
import java.util.Collection;

public class DaoCasas extends DAO {

    public Collection<Casa> listarCasas() throws Exception {
        try {
            String sql = "SELECT * FROM casas where pais='reino unido' and fecha_desde>='2020-08-01'and fecha_hasta<='2020-08-31'  ";
            consultarBase(sql);
            Casa casa = null;
            Collection<Casa> casas = new ArrayList();
            while (resultado.next()) {
                casa = new Casa();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodPostal(resultado.getInt(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate(7));
                casa.setFechaHasta(resultado.getDate(8));
                casa.setTiempoMin(resultado.getInt(9));
                casa.setTiempoMax(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getInt(11));
                casa.setTipoVivienda(resultado.getString(12));

                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

}


