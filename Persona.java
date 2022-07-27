public class Persona {

    private Integer edad;
    private Sexo sexo; //Sexo is an enum

    public Persona(Integer edad, Sexo sexo) {
        this.edad = edad;
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}