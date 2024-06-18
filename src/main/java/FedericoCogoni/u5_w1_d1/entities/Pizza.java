package FedericoCogoni.u5_w1_d1.entities;


import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Pizza extends Product {

    private List<String> toppings;

    public Pizza(String name, double price, int calories, List<String> toppings) {
        super(name, price, calories);
        this.toppings = toppings;

    }

    @Override
    public String toString() {
        return "Pizza    -->" +
                " " + name  +
                toppings +
                ", price " + price +
                ", calories " + calories+";";
    }
}
