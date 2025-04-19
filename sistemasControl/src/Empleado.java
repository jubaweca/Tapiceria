public class Empleado {
  private String CedEmpleado;
  private String nomEmpleado;
  private String DirecEmpleado;
  private String TelfEmpleado;
  private String EmailEmpleado;

  public Empleado() {
  };

  public Empleado(String cedEmpleado, String nomEmpleado, String direcEmpleado, String telfEmpleado,
      String emailEmpleado) {
    this.CedEmpleado = cedEmpleado;
    this.nomEmpleado = nomEmpleado;
    this.DirecEmpleado = direcEmpleado;
    this.TelfEmpleado = telfEmpleado;
    this.EmailEmpleado = emailEmpleado;

  }

  public void setcedEmpleado(String cedEmpleado) {
    this.CedEmpleado = cedEmpleado;
  }

  public void setNomEmpleado(String nomEmpleado) {
    this.nomEmpleado = nomEmpleado;
  }

  public void setDirecEmpleado(String direcEmpleado) {
    this.DirecEmpleado = direcEmpleado;
  }

  public void setTelfEmpleado(String telfEmpleado) {
    this.TelfEmpleado = telfEmpleado;
  }

  public void setEmailEmpleado(String emailEmpleado) {
    this.EmailEmpleado = emailEmpleado;
  }

  public String getCedEmpleado() {
    return CedEmpleado;
  }

  public String getNomEmpleado() {
    return nomEmpleado;
  }

  public String getDirecEmpleado() {
    return DirecEmpleado;
  }

  public String getTelfEmpleado() {
    return TelfEmpleado;
  }

  public String getEmailEmpleado() {
    return EmailEmpleado;
  }

}
