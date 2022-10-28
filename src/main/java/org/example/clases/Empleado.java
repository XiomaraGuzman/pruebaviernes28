package org.example.clases;

public class Empleado {
    //ATRIBUTOS
    // (VARIABLES DE JAVA)
    //(FUERTES TIPADAS)

    public String id;
    public String nombre;
    public String apellido;
    public String email;
    public String direccion;
    public String telefono;
    public String documento;
    char tipoAfiliacioCajaCompensacion;
    byte edad;
    byte numeroHijos;
    float salario;
    short numeroBeneficiarios;
    double cuotaFondoEmpleado;
    double deduccionPrestamoVivienda;
    double deduccionGimnasio;
    double demandaAlimentos;
    double deduccionSalud;
    double deduccionPensiones;
    double deduccionCajaCompensacion;
    double subsidioCajaCompensacion;
    double auxilioTransporte;
    double dotacion;
    double auxilioEscolar;




    //CONSTRUTOR
    //(METODO ESPECIAL)
    //(CREAR OBJETOS DE LA CLASE)

    public Empleado() {
    }


//METODOS DE LA CLASE
    //(FUNCIONES DE JAVA)
    //(TODA FUNCION RETORNA ALGO E JAVA)
    //CUANDO RETORA NADA (VOID)
    public void saludar(){
        System.out.println("Hola buenos dias");

    }
}
