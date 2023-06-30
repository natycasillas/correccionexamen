public class encebollado extends Morocho{
    public encebollado(){
        super();
    }
    String PrecioEn;
    String ingredientesEn;

    public encebollado(String precio, String ingredientes, String preparacion, String precioC, String precioM, String ingredienteSm, String precioEn, String ingredientesEn) {
        super(precio, ingredientes, preparacion, precioC, precioM, ingredienteSm);
        PrecioEn = precioEn;
        this.ingredientesEn = ingredientesEn;
    }

    public String getPrecioEn() {
        return PrecioEn;
    }

    public void setPrecioEn(String precioEn) {
        PrecioEn = precioEn;
    }

    public String getIngredientesEn() {
        return ingredientesEn;
    }

    public void setIngredientesEn(String ingredientesEn) {
        this.ingredientesEn = ingredientesEn;
    }
}
