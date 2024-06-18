package FedericoCogoni.u5_w1_d1.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink  extends Product{
    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }

    @Override
    public String toString() {
        return "Drink    -->" +
                " " + name +
                ", price " + price +
                ", calories " + calories+";";

    }
}
