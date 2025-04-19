public class Pedido {
    private String NumPedido;
    private String DescripServicio;
    private String fechaServicio;
    private String fechaEntrega;

    public Pedido(String NumPedido, String DescripServicio, String fechaServicio, String fechaEntrega) {
        this.NumPedido = NumPedido;
        this.DescripServicio = DescripServicio;
        this.fechaServicio = fechaServicio;
        this.fechaEntrega = fechaEntrega;
    }
    public Pedido() {}

    public void setNumPedido(String Numpedido) {
        this.NumPedido = Numpedido;
    }
    public void setDescripServicio(String DescripServicio) {
        this.DescripServicio = DescripServicio;
    }
    public void setFechaServicio(String fechaServicio) {
        this.fechaServicio = fechaServicio;
    }
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public String getNumPedido() {
        return NumPedido;
    }
    public String getDescripServicio() {
        return DescripServicio;
    }
    public String getFechaServicio() {
        return fechaServicio;
    }
    public String getFechaEntrega() {
        return fechaEntrega;
    }


}
