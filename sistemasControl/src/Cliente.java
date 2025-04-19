public class Cliente {
  private int CedCliente;
  private String Nomcliente;
  private String Direcliente;
  private String telfecliente;
  private String emailcliente;

  public Cliente(int CedCliente, String Nomcliente, String Direcliente, String telfecliente, String emailcliente) {
    this.CedCliente = CedCliente;
    this.Nomcliente = Nomcliente;
    this.Direcliente = Direcliente;
    this.telfecliente = telfecliente;
    this.emailcliente = emailcliente;
  };

  public Cliente() {

  }

  public void setCedCliente(int CedCliente) {
    this.CedCliente = CedCliente;
  }

  public void setNomcliente(String Nomcliente) {
    this.Nomcliente = Nomcliente;
  }

  public void setDirecliente(String Direcliente) {
    this.Direcliente = Direcliente;
  }

  public void setTelfecliente(String telfecliente) {
    this.telfecliente = telfecliente;
  }

  public void setEmailcliente(String emailcliente) {
    this.emailcliente = emailcliente;
  }

  public int getCedCliente() {
    return CedCliente;
  }

  public String getNomcliente() {
    return Nomcliente;
  }

  public String getDirecliente() {
    return Direcliente;
  }

  public String getTelfecliente() {
    return telfecliente;
  }

  public String getEmailcliente() {
    return emailcliente;
  }
}
