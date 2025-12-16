package model;

public class Menu {
     // Nombre del menú
    private String name; 
     // Restaurante al que pertenece el menú
    private Restaurant restaurant;
    // Productos del menú
    private MenuItem [] menuItems;

     // Constructor
    public Menu(String name, Restaurant restaurant, MenuItem[] menuItems) {
        this.name = name;
        this.restaurant = restaurant;
        this.menuItems = menuItems;
    }

    // Getter del nombre
    public String getName() {
        return name;
    }

    // Setter del nombre
    public void setName(String name) {
        this.name = name;
    }

    // Devuelve el restaurante
    public Restaurant getRestaurant() {
        return restaurant;
    }

      // Devuelve los productos del menú
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

     // Muestra todos los productos del menú
    public void displayItems(){
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }
    }
    // Busca un producto por nombre
    public MenuItem findItem(String itemName) {
        for (int i = 0; i< menuItems.length; i++) {
            if(menuItems[i] != null && menuItems[i].getName().equals(itemName)) {
                return menuItems[i];

            }
            
        }
        return null;
    }

    }

