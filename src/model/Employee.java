package model;

public class Employee {
     // Nombre del empleado
    private String nombre;

    // Restaurante en el que trabaja el empleado
    // Relación bidireccional Employee ↔ Restaurant
    private Restaurant restaurant;

    // Constructor
    // Se usa cuando se crea un empleado y se asigna a un restaurante
    public Employee(Restaurant restaurant, String nombre) {
        this.restaurant = restaurant;   // Guardamos el restaurante
        this.nombre = nombre;           // Guardamos el nombre
    }

     // Devuelve el restaurante donde trabaja el empleado
     public Restaurant getRestaurant() {
        return restaurant;
    }

     public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
     // Devuelve el nombre del empleado
    public String getNombre() {
        return nombre;
    }


}
