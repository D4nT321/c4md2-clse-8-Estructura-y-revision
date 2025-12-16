package model;

public class Order {
     // Número del pedido
    private Integer OrderNumber;
     // Estado del pedido (PENDING, etc.)
    private OrderStatus status;
     // Productos pedidos
    private OrderItem [] orderItems;
     // Mesa a la que pertenece el pedido
    private Table table;
    
    // Constructor
    public Order(Table table, Integer orderItemsSize) {
        this.table = table;      // Asociamos la mesa
        this.OrderNumber = 1; //TODO: Calcular el siguiente pedido.
        this.status = OrderStatus.PENDING;
        this.orderItems = new OrderItem[orderItemsSize]; 
    }

    // Getter del número del pedido
    public Integer getOrderNumber() {
        return OrderNumber;
    }
     // Getter del estado
    public OrderStatus getStatus() {
        return status;
    }
    
     // Setter del estado
    public void setStatus(OrderStatus status) {
        this.status = status; 
    }
    // Devuelve los productos del pedido
    public OrderItem[] getOrderItems() {
        return orderItems;
    }
     // Devuelve la mesa
    public Table getTable() {
        return table;
    }
    // Cambia la mesa
    public void setTable(Table table) {
        this.table = table;
    }

    // Agrega un producto al pedido
    public void addItem(OrderItem item){
        for (int i = 0; i < orderItems.length; i++) {
            if(orderItems[i] == null) {
                orderItems[i] = item;
                return;
            }
        }
        System.err.println("La lista de Items esta llena");
    }
         // Calcula el total del pedido
        public Double calculateTotal() {
            var total = 0d;
            for (int i = 0; i < orderItems.length; i++) {
                if(orderItems[i] != null) {
                    total += orderItems[i].calculateSubtotal();
                }
                
            }
            return total;
        }
         // Muestra los detalles del pedido en consola
        public void displayDetails() {
            System.out.printf("Pedido No: %d%nEstado: %s%n",
             OrderNumber, status);
            System.out.println("=== Productos del pedido ===");
             for (int i = 0; i < orderItems.length; i++) {
                if(orderItems[i] != null) {
                    var item = orderItems[i];
                    System.out.printf("Nombre: %s, Cantidad: %d, Subtotal: $ %,.2f%n",
                        item.getMenuItem().getName(),
                        item.getQuantity(),
                        item.calculateSubtotal()
                    );
                    //orderItems[i] 
                }
                
             }
        }

}
