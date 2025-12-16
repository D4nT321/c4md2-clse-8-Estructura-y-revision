
import model.Menu;
import model.MenuItem;
import model.Order;
import model.OrderItem;
import model.Restaurant;
import model.Table;
import model.Employee; 

public class RestaurantApp {
    public static void main(String[] args) throws Exception {
        

// Clase principal del programa
// Aquí se ejecuta todo el sistema del restaurante


        // =====================================
        // 1. CREAR LOS ITEMS DEL MENÚ
        // =====================================
        // Cada MenuItem representa un producto que se puede vender

        MenuItem hamburguesa = new MenuItem(null, "Hamburguesa", 12000.0);
        // Creamos un producto llamado Hamburguesa con precio 12.000

        MenuItem pizza = new MenuItem(null, "Pizza", 18000.0);
        // Creamos un producto llamado Pizza con precio 18.000

        MenuItem gaseosa = new MenuItem(null, "Gaseosa",40000.0);
        // Creamos un producto llamado Gaseosa con precio 4.000


        // =====================================
        // 2. CREAR EL ARRAY DE MenuItem
        // =====================================
        // Un array es una lista de objetos del mismo tipo

        MenuItem[] menuItems = { hamburguesa, pizza, gaseosa };
        // Guardamos los productos dentro del arreglo


        // =====================================
        // 3. CREAR EL MENÚ
        // =====================================
        // El menú contiene todos los productos disponibles

        Menu menu = new Menu(null, null, menuItems);
        // Creamos el menú usando el constructor simple


        // =====================================
        // 4. CREAR LAS MESAS
        // =====================================
        // Cada Table representa una mesa del restaurante

        Table table1 = new Table(1, 4, false, null);
        // Mesa número 1 con capacidad para 4 personas

        Table table2 = new Table(2, 2, false, null);
        // Mesa número 2 con capacidad para 2 personas


        // =====================================
        // 5. CREAR EL ARRAY DE MESAS
        // =====================================

        Table[] tables = { table1, table2 };
        // Guardamos las mesas en un arreglo


        // =====================================
        // 6. CREAR LOS EMPLEADOS
        // =====================================

        Employee emp1 = new Employee(null,"carlos");
        // Creamos un empleado llamado Carlos

        Employee emp2 = new Employee(null, "Ana");
        // Creamos una empleada llamada Ana


        // =====================================
        // 7. CREAR EL ARRAY DE EMPLEADOS
        // =====================================

        Employee[] employees = { emp1, emp2 };
        // Guardamos los empleados en un arreglo


        // =====================================
        // 8. CREAR EL RESTAURANTE
        // =====================================
        // El restaurante une menú, mesas y empleados

        Restaurant restaurant = new Restaurant(
            "Dante Cook",   // nombre del restaurante
            "Calle 123",          // dirección
            tables,                // mesas
            menu,                  // menú
            employees              // empleados
        );


        // =====================================
        // 9. MOSTRAR EL MENÚ DEL RESTAURANTE
        // =====================================

        restaurant.displayMenu();
        // Llamamos al método que imprime el menú


        // =====================================
        // 10. CREAR UN PEDIDO
        // =====================================
        // El número 5 indica el máximo de productos permitidos

        Order order = new Order(table2, 5);
        // Creamos un pedido vacío con capacidad para 5 items


        // =====================================
        // 11. BUSCAR PRODUCTOS EN EL MENÚ
        // =====================================

        MenuItem item1 = menu.findItem("Hamburguesa");
        // Buscamos la hamburguesa en el menú

        MenuItem item2 = menu.findItem("Gaseosa");
        // Buscamos la gaseosa en el menú


        // =====================================
        // 12. CREAR ITEMS DEL PEDIDO
        // =====================================

        OrderItem orderItem1 = new OrderItem(item1, 2);
        // Agregamos 2 hamburguesas al pedido

        OrderItem orderItem2 = new OrderItem(item2, 1);
        // Agregamos 1 gaseosa al pedido


        // =====================================
        // 13. AÑADIR LOS ITEMS AL PEDIDO
        // =====================================

        order.addItem(orderItem1);
        // Añadimos el primer producto

        order.addItem(orderItem2);
        // Añadimos el segundo producto


        // =====================================
        // 14. BUSCAR UNA MESA EN EL RESTAURANTE
        // =====================================

        Table selectedTable = restaurant.findTable(1);
        // Buscamos la mesa número 1


        // =====================================
        // 15. ASIGNAR EL PEDIDO A LA MESA
        // =====================================

        selectedTable.assignOrder(order);
        // La mesa queda ocupada con el pedido

        order.setTable(selectedTable);
        // El pedido ahora sabe a qué mesa pertenece


        // =====================================
        // 16. MOSTRAR LOS DETALLES DEL PEDIDO
        // =====================================

        order.displayDetails();
        // Imprime los productos y cantidades


        // =====================================
        // 17. CALCULAR Y MOSTRAR EL TOTAL
        // =====================================

        double total = order.calculateTotal();
        // Calcula el total del pedido

        System.out.println("Total a pagar: $" + total);
        // Muestra el total en pantalla


        // =====================================
        // 18. DEMOSTRAR RELACIÓN BIDIRECCIONAL
        // =====================================

        System.out.println(
            "El pedido pertenece a la mesa número: " +
            order.getTable().getTableNumber()
        );
        // Desde el pedido accedemos a la mesa
    }
}
