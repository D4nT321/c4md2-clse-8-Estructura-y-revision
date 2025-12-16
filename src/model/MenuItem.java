package model;
// Indica que esta clase pertenece al paquete "model"
public class MenuItem {
     // Nombre del producto (ej: "Hamburguesa")
    private String name;
    // Precio del producto
    private Double price;
    // Menú al que pertenece este producto
    // Sirve para la relación bidireccional Menu ↔ MenuItem
    private Menu menu;

     // Constructor principal
    // Se usa cuando creamos un producto y lo asociamos a un menú
    public MenuItem(Menu menu, String name, Double price) {
        this.name = name;     // Guardamos el nombre
        this.price = price;   // Guardamos el precio 
        this.menu = menu;     // Guardamos el menú al que pertenece
    }

    // Getter del nombre
    public String getName() {
        return name;
    }

     // Getter del precio
    public Double getPrice() {
        return price;
    }
    // Permite cambiar el precio del producto
    public void setPrice(Double price) {
        this.price = price;
    }
    // Devuelve el menú al que pertenece este producto
    public Menu getMenu() {
        return menu;
    } 
     // Este método se usa cuando imprimimos el objeto con System.out.println
    // Define cómo se va a mostrar el producto en consola
    @Override
    public String toString() {
        return String.format("%s:\t$%.2f", name, price);
    }
    

}
