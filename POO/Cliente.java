public class Cliente{ // Nombre de la clase
    // Atributos
    public String nombreCliente;
    public String direccion;
    public String email;
    public float saldoCuenta;
    
    // Metodos
    public void registro(){
        System.out.println("El Administrador de nombre "+nombreCliente+" con direccion "+direccion+", email: "+email+" con saldo de cuenta: "+saldoCuenta+" se registro satisfactoriamente.");
    }
}