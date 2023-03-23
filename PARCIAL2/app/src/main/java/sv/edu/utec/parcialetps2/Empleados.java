package sv.edu.utec.parcialetps2;

public class Empleados {
    private String nombre;
    private String cargo;
    private String compania;
    private int imagen;

    public Empleados() {
    }

    public Empleados(String nombre, String cargo, String compania, int imagen) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.compania = compania;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
