public class Morocho extends coladaMorada {
public Morocho(){
    super();
}
String precioM;
String ingredienteSm;

    public Morocho(String precio, String ingredientes, String preparacion, String precioC, String precioM, String ingredienteSm) {
        super(precio, ingredientes, preparacion, precioC);
        this.precioM = precioM;
        this.ingredienteSm = ingredienteSm;
    }

    public String getPrecioM() {
        return precioM;
    }

    public void setPrecioM(String precioM) {
        this.precioM = precioM;
    }

    public String getIngredienteSm() {
        return ingredienteSm;
    }

    public void setIngredienteSm(String ingredienteSm) {
        this.ingredienteSm = ingredienteSm;
    }
}
