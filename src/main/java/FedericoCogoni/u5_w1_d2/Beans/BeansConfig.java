package FedericoCogoni.u5_w1_d2.Beans;


import FedericoCogoni.u5_w1_d2.Enums.OrderStatus;
import FedericoCogoni.u5_w1_d2.Enums.TableStatus;
import FedericoCogoni.u5_w1_d2.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfig {

    @Bean
    Topping getTomato() {
        return new Topping("Tomato", 0, 15);
    }
    @Bean
    Topping getCheese(){
        return new Topping("Cheese", 0.69, 92);
    }
    @Bean
    Topping getHam(){
        return new Topping("HAm", 0.99, 35);
    }
    @Bean
    Topping getPineapple(){
        return new Topping("Pineapple", 0.79, 24);
    }
    @Bean
    Topping getSalami(){
        return new Topping("Salami", 0.99, 86);
    }
    @Bean
    Topping getOnions(){
        return new Topping("Onions", 0.69, 22);
    }


    @Bean
    Drink getLemonade(){
        return new Drink("Lemonade", 1.29, 128);
    }

    @Bean
    Drink getWater(){
        return new Drink("Water", 1.29, 0);
    }

    @Bean
    Drink getWine(){
        return new Drink("Wine", 7.49, 607);
    }


    @Bean
    Pizza getMargheritaPizza(){
        List<String> toppings = Arrays.asList(
        getTomato().getName(),
        getCheese().getName());
        return new Pizza("Margherita", 4.99, 1104, toppings);
    }

    @Bean
    Pizza getHawaiianPizza(){
        List<String> toppings = Arrays.asList(
        getTomato().getName(),
        getCheese().getName(),
        getHam().getName(),
        getPineapple().getName());
        return new Pizza("Hawaiian", 6.49, 1024, toppings);
    }

    @Bean
    Pizza getSalamiPizza(){
        List<String> toppings = Arrays.asList(
        getTomato().getName(),
        getCheese().getName(),
        getSalami().getName());
        return new Pizza("Salami", 5.99, 1160, toppings);

    }

    /*@Bean
    Menu getMenu() {
        List<Topping> toppings = Arrays.asList(getTomato(), getCheese(), getHam(), getPineapple(), getSalami(), getOnions());
        List<Drink> drinks = Arrays.asList(getLemonade(), getWater(), getWine());
        List<Pizza> pizzas = Arrays.asList(getMargheritaPizza(), getHawaiianPizza(), getSalamiPizza());
        return new Menu(toppings, drinks, pizzas);
    }*/

    @Bean
    Table table1() {
        return new Table(1, 8, TableStatus.FREE);
    }

    @Bean
    Table table2() {
        return new Table(2, 12, TableStatus.FREE);
    }

    @Bean
    Table table3() {
        return new Table(3, 2, TableStatus.OCCUPIED);
    }

    @Bean
    Order order1(Table table1){
        List<Product> products = List.of(getHawaiianPizza(), getSalamiPizza());
        return new Order(table1, products, 12, 6, OrderStatus.IN_PROGRESS);
    }

    @Bean
    Order order2(Table table2){
        List<Product> products = List.of(getWater(), getSalamiPizza(), getLemonade(), getWine(), getHawaiianPizza(), getMargheritaPizza(), getWater());
        return new Order(table2, products, 324, 4, OrderStatus.IN_PROGRESS);
    }

}
