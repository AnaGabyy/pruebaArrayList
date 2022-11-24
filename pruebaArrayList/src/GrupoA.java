import java.util.ArrayList;

public class GrupoA {

    private String nombre;
    private ArrayList<Bailarin>bailarines;

    public GrupoA(String nombre) {
        this.nombre = nombre;
        this.bailarines = bailarines;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addBailarin(Bailarin bailarin){
        this.bailarines.add(bailarin);

    }
    public ArrayList<Bailarin> getBailarines() {
        return bailarines;
    }
    public void setBailarines(ArrayList<Bailarin> bailarines) {
        this.bailarines = bailarines;
    }



    @Override
    public String toString() {
        return "GrupoA{" +
                "nombre='" + nombre + '\'' +
                ", bailarines=" + bailarines +
                '}';
    }
}
