class  Persona{
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona juanito = new Persona();
        juanito.setNombre("Juanito");
        test(juanito);

        System.out.println("juanito = " + juanito.getNombre());

    }
    public static void test(Persona i){
        i.setNombre("Pablo");
    }
}
