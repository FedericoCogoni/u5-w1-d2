package FedericoCogoni.u5_w1_d1.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class Product {

    protected String name;
    protected double price;
    protected int calories;

}
