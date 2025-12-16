package model;

public class Table {
    // Número de la mesa
    private Integer tableNumber;
    // Capacidad de personas
    private Integer capacity; 
     // Indica si la mesa está ocupada o no
    private Boolean occupied;
    // Restaurante al que pertenece la mesa
    private Restaurant restaurant;
    // Pedido actual asignado a la mesa
    private Order currentOrder;
    
     // Constructor
    public Table(Integer tableNumber, Integer capacity, Boolean occupied, Restaurant restaurant) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.occupied = occupied;
        this.restaurant = restaurant;
    }

     // Getter del número de mesa
    public Integer getTableNumber() {
        return tableNumber;
    }
      // Getter de la capacidad
    public Integer getCapacity() {
        return capacity;
    }

    // Setter de la capacidad
     public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

     // Setter del número de mesa
    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

     // Devuelve si la mesa está ocupada
   public Boolean isOccupied() {
        return occupied;
    }

     // Cambia el estado de ocupación
    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }
     // Devuelve el restaurante
    public Restaurant getRestaurant() {
        return restaurant;
    }
    // Devuelve el pedido actual
    public Order getCurrentOrder() {
        return currentOrder;
    }
    // Asigna un pedido a la mesa y la marca como ocupada
    public void assignOrder(Order order) {
        this.currentOrder = order;
        this.occupied = true;
    }
    // Limpia la mesa (cuando el cliente se va)
    public void clearTable() {
        this.currentOrder = null;
        this.occupied = false; 
    }


}
