
package EstanciaEntidades;

import java.sql.Date;

public class Estancias {
    private int idEstancia;
    private int idCliente;
    private String nombreHuesped;
    private Date fechaDesde;
    private Date fechaHasta;
    private int idCasa;

    public Estancias() {
    }

    public Estancias(int idEstancia, int idCliente, String nombreHuesped, Date fechaDesde, Date fechaHasta, int idCasa) {
        this.idEstancia = idEstancia;
        this.idCliente = idCliente;
        this.nombreHuesped = nombreHuesped;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.idCasa = idCasa;
    }

    public int getIdEstancia() {
        return idEstancia;
    }

    public void setIdEstancia(int idEstancia) {
        this.idEstancia = idEstancia;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    @Override
    public String toString() {
        return "Estancias{" + "idEstancia=" + idEstancia + ", idCliente=" + idCliente + ", nombreHuesped=" + nombreHuesped + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", idCasa=" + idCasa + '}';
    }
    
    
    
}
