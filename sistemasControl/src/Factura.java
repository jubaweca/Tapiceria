public class Factura {
  private String FechFactura;
  private String NumFactura;
  private String SubTotal;
  private String Total;

  public Factura() {
  };

  public Factura(String FechFactura, String NumFactura, String SubTotal, String Total) {
    this.FechFactura = FechFactura;
    this.NumFactura = NumFactura;
    this.SubTotal = SubTotal;
    this.Total = Total;

  }

  public void setFechFactura(String FechFactura) {
    this.FechFactura = FechFactura;
  }

  public void setNumFactura(String NumFactura) {
    this.NumFactura = NumFactura;
  }

  public void setSubTotal(String SubTotal) {
    this.SubTotal = SubTotal;
  }

  public void setTotal(String Total) {
    this.Total = Total;
  }

  public String getFechFactura() {
    return FechFactura;
  }

  public String getNumFactura() {
    return NumFactura;
  }

  public String getSubTotal() {
    return SubTotal;
  }

  public String getTotal() {
    return Total;
  }

}
