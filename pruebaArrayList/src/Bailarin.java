
public class Bailarin {
    private String nombre;
    private boolean bailaBien;


    public Bailarin(String nombre, boolean bailaBien) {
        this.nombre = nombre;
        this.bailaBien = bailaBien;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBailaBien() {
        return bailaBien;
    }

    public void setBailaBien(boolean bailaBien) {
        this.bailaBien = bailaBien;
    }



    @Override
    public String toString() {
        return "Bailarin{" +
                "nombre='" + nombre + '\'' +
                ", bailaBien=" + bailaBien +
                '}';
    }
}
