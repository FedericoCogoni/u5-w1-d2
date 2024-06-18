package FedericoCogoni.u5_w1_d2.Runners;


import FedericoCogoni.u5_w1_d2.U5W1D2Application;
import FedericoCogoni.u5_w1_d2.entities.Menu;
import FedericoCogoni.u5_w1_d2.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
   private Menu menu;

    private Order order;


    @Override
    public void run(String... args) throws Exception {
        menu.menuPrint();

        AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(U5W1D2Application.class);

        Order order1 = (Order) contex.getBean("order1");
        order1.printOrder();
        Order order2 = (Order) contex.getBean("order2");
        order2.printOrder();

    }


}
