public class Estudiante extends Persona implements IntAlumno,IntAlumno2{
    String nocuenta;
    String curso;
    String calificacion;



    public Estudiante(String nombre, String sexo, String direccion, int edad,String calificacion,String nocuenta, String curso) {
        super(nombre, sexo, direccion, edad);
        this.calificacion=calificacion;
        this.curso=curso;
        this.nocuenta=nocuenta;
    }



    public void verCalificacion(){
        System.out.println("La calificación es : "+ calificacion);
    }
    public void verCurso(){
        System.out.println("El curso es: "+ curso);
    }
    public void verNocuenta(){
        System.out.println("El n de cuenta es: "+ nocuenta );

    }



    public String getNocuenta() {
        return nocuenta;
    }



    public void setNocuenta(String nocuenta) {
        this.nocuenta = nocuenta;
    }



    public String getCurso() {
        return curso;
    }



    public void setCurso(String curso) {
        this.curso = curso;
    }



    public String getCalificacion() {
        return calificacion;
    }



    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    @Override
    public void mostrarInfo(){

        System.out.println("Nombre: "+ getNombre());
        System.out.println("Edad: "+ getEdad() );
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Direccion:"+ getDireccion());
        System.out.println("Numero de cuenta:"+ getNocuenta());
        System.out.println("Calificacion:"+ getCalificacion());
        System.out.println("Curso:"+ getCurso());
    }
    @Override
    public void mostrarCurso(){
        System.out.println("Curso: "+getCurso());
    }



    }