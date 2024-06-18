package FedericoCogoni.u5_w1_d2.entities;

import FedericoCogoni.u5_w1_d2.Enums.TableStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
@AllArgsConstructor
public class Table {
    private int tableId;
    private int tableSeats;
    private TableStatus tableStatus;

}
