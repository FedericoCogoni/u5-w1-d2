package FedericoCogoni.u5_w1_d1;

import FedericoCogoni.u5_w1_d1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1D1Application.class, args);

		AnnotationConfigApplicationContext scatolone = new AnnotationConfigApplicationContext(U5W1D1Application.class);

		Menu menu = scatolone.getBean(Menu.class);
		menu.menuPrint();
	}

}
