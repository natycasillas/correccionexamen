public class coladaMorada extends comidatipica{
    public coladaMorada(){
        super();
    }

String precioC;


    public coladaMorada(String precio, String ingredientes, String preparacion, String precioC) {
        super(precio, ingredientes, preparacion);
        this.precioC = precioC;
    }

    public String getPrecioC() {
        return precioC;
    }

    public void setPrecioC(String precioC) {
        this.precioC = precioC;
    }




}
