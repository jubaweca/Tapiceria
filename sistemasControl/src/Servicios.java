public class Servicios {
    private String NomServicios;
    private  String descripServicio;
    private int numServicio;

public  Servicios() {};
public  Servicios(String nomServicios, String descripServicio, int numServicio) {
    this.NomServicios = nomServicios;
    this.descripServicio = descripServicio;
    this.numServicio = numServicio;
}

    public void setNomServicios(String nomServicios) {
        NomServicios = nomServicios;
    }
    public void setDescripServicio(String descripServicio) {
     this.descripServicio= descripServicio;
    }
    public void setNumServicio(int numServicio) {
    this.numServicio= numServicio;
    }
    public String getNomServicios() {
    return NomServicios;
    }
    public String getDescripServicio() {
    return descripServicio;
    }
    public int getNumServicio() {
    return numServicio;
    }

}
