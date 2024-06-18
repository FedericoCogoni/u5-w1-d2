package FedericoCogoni.u5_w1_d2.entities;

import FedericoCogoni.u5_w1_d2.Enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private Table table;
    private List<Product> orderList;
    private int numOrder;
    private int costumers;
    private OrderStatus orderStatus;


    public void printOrder() {
        System.out.println();
        System.out.println("Order "+ this.numOrder);
        System.out.println("table number; " + this.table.getTableId());
        System.out.println("table max seats: " + table.getTableSeats());
        System.out.println("table costumers: " + this.costumers);
        System.out.println("table status: "+ this.table.getTableStatus());
        this.orderList.forEach(System.out::println);
        System.out.println();
        System.out.println("Order: "+ this.orderStatus);


    }

    @Override
    public String toString() {
        return "Orders{" +
                "table=" + table.getTableId() +
                ", orderList=" + orderList +
                ", numOrder=" + numOrder +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
