
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String precio, lugar, Ingredientes;
        int menu;
        String Preparacion;
        double tamanio;
        Scanner sc = new Scanner(System.in);
        comidatipica[] comidas = new comidatipica[5];
        coladaMorada colada1[] = new coladaMorada[5];

        Morocho morocho1[] =new  Morocho [5];
        encebollado[] encebollado1 = new encebollado[5];

        try{
            do{
                System.out.println("\n*** MENU ***");
                System.out.println("\n1. colada morada");
                System.out.println("2. morocho");
                System.out.println("3. encebollado");
                System.out.println("4. Salir");
                System.out.print("\nIngrese una opcion del menu: ");
                menu = sc.nextInt();

                switch(menu){
                    case 1:{
                        System.out.println("\n*** COLADA ***");
                        for(int i = 0; i < colada1.length; i++){
                            colada1[i] = new coladaMorada();
                            System.out.println("\nColada " + (i+1));
                            System.out.print("Ingrese el precio: ");
                            precio = sc.next();
                            System.out.print("Ingrese ingredientes : ");
                            Ingredientes= sc.next();
                            System.out.print("Ingrese preparacion: ");
                            Preparacion = sc.next();
                            colada1[i].setPrecio(precio);
                            colada1[i].setIngredientes(Ingredientes);
                            colada1[i].setPreparacion(Preparacion);
                        }
                        for(int i = 0; i < colada1.length; i++){
                            System.out.println("\nColada " + (i+1));
                            System.out.println("Precio: " + colada1[i].getPrecio());
                            System.out.println("Ingredientes: " + colada1[i].getIngredientes());
                            System.out.println("Preparacion: " + colada1[i].getPreparacion());
                        }
                        break;
                    }
                    case 2:{
                        System.out.println("\n*** MOROCHO ***");
                        for(int i = 0; i < morocho1.length; i++){
                            morocho1[i] = new Morocho();
                            System.out.println("\nMorocho " + (i+1));
                            System.out.print("Ingrese el precio: ");
                            precio = sc.next();
                            System.out.print("Ingrese ingredientes: ");
                            Ingredientes = sc.next();
                            System.out.print("Ingrese preparacion: ");
                            Preparacion = sc.next();
                            morocho1[i].setPrecio(precio);
                            morocho1[i].setIngredientes(Ingredientes);
                            morocho1[i].setPreparacion(Preparacion);
                        }
                        for(int i = 0; i < morocho1.length; i++){
                            System.out.println("\nMorocho " + (i+1));
                            System.out.println("Precio: " + morocho1[i].getPrecio());
                            System.out.println("Ingredientes: " + morocho1[i].getIngredientes());
                            System.out.println("Preparacion: " + morocho1[i].getPreparacion());
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("\n*** ENCEBOLLADO ***");
                        break;
                    }
                    case 4:{
                        System.out.println("\nGracias, vuelva pronto!");
                        break;
                    }
                    default:{
                        System.out.println("\nOpcion no disponible del menu!");
                    }
                }
            }while(menu != 4);
        }catch (Exception ex) {
            System.out.println("Exepccion " + ex.getMessage());
        }
    }
}