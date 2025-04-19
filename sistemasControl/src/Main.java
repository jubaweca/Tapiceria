//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the
    // highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.printf("BIENVENIDOS");

    Usuario objusuario = new Usuario();
    objusuario.setNombre("carlos Yofred");
    objusuario.setContrasena("123456");
    System.out.println("usuario: " + objusuario.getNombre());
    System.out.println("password: " + objusuario.getContrasena());

    System.out.println("-----------------TIPO EMPLEADO--------------------------");

    tipoEmpleado objtipoempleado = new tipoEmpleado();
    objtipoempleado.setNomTipoEmpleado("maquinista");
    System.out.println("tipoEmpleado es : " + objtipoempleado.getNomTipoEmpleado());

    System.out.println("-----------------EMPLEADO--------------------------");

    Empleado objempleado = new Empleado();
    objempleado.setcedEmpleado("88267574");
    objempleado.setNomEmpleado("carlos Yofred");
    objempleado.setDirecEmpleado("barrio la esperanza");
    objempleado.setTelfEmpleado("3174636458");
    objempleado.setEmailEmpleado("carlosYofred@gmail.com");
    System.out.println("nombre es: " + objempleado.getNomEmpleado());
    System.out.println("cedula es: " + objempleado.getCedEmpleado());
    System.out.println("Direccion es: " + objempleado.getDirecEmpleado());
    System.out.println("Telefono es: " + objempleado.getTelfEmpleado());
    System.out.println("Email es: " + objempleado.getEmailEmpleado());

    System.out.println("-------------PEDIDOS------------------------------");
    Pedido objpedido = new Pedido();
    objpedido.setNumPedido("1234");
    objpedido.setDescripServicio("tapizado de bastidores");
    objpedido.setFechaServicio("15 de marzo del 2025");
    objpedido.setFechaEntrega("16 de marzo del 2025");
    System.out.println("numPedido es: " + objpedido.getNumPedido());
    System.out.println("descripServicio es: " + objpedido.getDescripServicio());
    System.out.println("fechaServicio es: " + objpedido.getFechaServicio());
    System.out.println("la entrega es: " + objpedido.getFechaEntrega());

    System.out.println("----------------------TIPO DE SERVICIOS--------------------------");
    TipoServic objtiposervico = new TipoServic();
    objtiposervico.setNomTipoServicio("retapizado");
    System.out.println("tipoServico es : " + objtiposervico.getNomTipoServicio());

    System.out.println("----------------------SERVICIOS--------------------------");

    Servicios objservicios = new Servicios();
    objservicios.setNomServicios("retapizado de bastidores");
    objservicios.setDescripServicio("tapizado de bastidores");
    objservicios.setNumServicio(2354);
    System.out.println("el servicios es : " + objservicios.getNomServicios());
    System.out.println("cambiar la tela y reforzar espuma" + objservicios.getDescripServicio());
    System.out.println("el numero de seguimiento es: " + objservicios.getNumServicio());

    System.out.println("---------------------------CLIENTE----------------------------");

    Cliente objCliente = new Cliente();
    objCliente.setCedCliente(1092336110);
    objCliente.setNomcliente("Elsy Johanna");
    objCliente.setDirecliente("la esperanza");
    objCliente.setTelfecliente("3178754987");
    objCliente.setEmailcliente("Elsy@gmail.com");
    System.out.println("el cliente es : " + objCliente.getCedCliente());
    System.out.println("el nombre es : " + objCliente.getNomcliente());
    System.out.println("la direccion es: " + objCliente.getDirecliente());
    System.out.println("el telefono es : " + objCliente.getTelfecliente());
    System.out.println("el email es : " + objCliente.getEmailcliente());

    System.out.println("---------------------------FACTURA----------------------------");
    System.out.println("  ");

    Factura objFactura1 = new Factura("13/04/2025", "23456", "250,000", "325.000");
    Factura objFactura2 = new Factura();

    objFactura2.setFechFactura("13/04/2025");
    objFactura2.setNumFactura("23458");
    objFactura2.setSubTotal("456,000");
    objFactura2.setTotal("550,000");

    System.out.println("La fecha de la factura 2 es : " + objFactura2.getFechFactura());
    System.out.println("El numero de la factura 2 es : " + objFactura2.getNumFactura());
    System.out.println("El subtotal de la factura 2 es : " + objFactura2.getSubTotal());
    System.out.println("El total de la factura 2 es : " + objFactura2.getTotal());
    System.out.println(" ");
    System.out.println("la factura 1 es : " + objFactura1.getTotal());
  }
}
