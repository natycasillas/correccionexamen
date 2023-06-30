public class comidatipica {

    //declaracionde las variables
    String precio;
    String ingredientes;

    String Preparacion;
    //creamos el constructor

    public comidatipica(){

    }
    public comidatipica(String precio, String ingredientes, String preparacion) {
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.Preparacion = preparacion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return Preparacion;
    }

    public void setPreparacion(String preparacion) {
        Preparacion = preparacion;
    }
}
