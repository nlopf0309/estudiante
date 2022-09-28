public class Persona {
    protected String nombre;
    protected String sexo;
    protected String direccion;
    protected int edad;

    public Persona(String nombre,String sexo,String direccion,int edad ){
        this.nombre= nombre;
        this.sexo= sexo;
        this.edad=edad;
        this.direccion=direccion;
    }


    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }



    public String getSexo() {
        return sexo;
    }



    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    public String getDireccion() {
        return direccion;
    }



    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad );
        System.out.println("Sexo: "+ sexo);
        System.out.println("Direccion:"+ direccion);

    }
}
