package model;

public class Restaurant {
    // Nombre del restaurante
    private String name;
    // Dirección del restaurante
    private String address;
     // Arreglo de mesas del restaurante
    private Table [] tables;
    // Menú del restaurante
    private Menu menu;
     // Arreglo de empleados del restaurante
    private Employee [] employees;

     // Constructor principal
public Restaurant(String name, String address, Table[] tables, Menu menu, Employee[] employees) {
    this.name = name;
    this.address = address;
    this.tables = tables;
    this.menu = menu;
    this.employees = employees;
}

// Getter del nombre
    public String getName() {
        return name;
    }

    // Setter del nombre
    public void setName(String name) {
        this.name = name;
    }

     // Getter de la dirección
    public String getAddress() {
        return address;
    }
    // Setter de la dirección
    public void setAddress(String address) {
        this.address = address;
    }
     // Devuelve todas las mesas
    public Table[] getTables() {
        return tables;
    }
    // Devuelve el menú
    public Menu getMenu() {
        return menu;
    }
    // Devuelve los empleados
    public Employee[] getEmployees() {
        return employees;
    }
     // Muestra el menú completo del restaurante
    public void displayMenu() {
        menu.displayItems(); 
    }
    // Busca una mesa por su número
    public Table findTable(int tableNumber) {
        for (int i = 0; i < tables.length; i++) {
            if(tables[i] != null && tables[i].getTableNumber() == tableNumber){
                return tables[i];
            }
            
        }
        return null;

    }

    
    }
