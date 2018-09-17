package market;

import interfaces.IComponent;
import products.Beans;
import products.Meat;
import products.Rice;
import products.Shirts;

public class Run {

    public static void main(String[] args) throws Exception {
        IComponent meats = new Component();
        IComponent grains = new Component();
        IComponent clothes = new Component();
        
        IComponent beans = new Beans(1.5);
        IComponent rice = new Rice(3.3);
        IComponent meat = new Meat(17.9);
        IComponent shirts = new Shirts(40);
        
        meats.add(meat);
        grains.add(beans);
        grains.add(rice);
        clothes.add(shirts);
        
        System.out.println("Rice old price: " + rice.getPrice());
        System.out.println("Shirt old price: " + shirts.getPrice());
        
        grains.changePrice(0.5);
        clothes.changePrice(0.3);
        
        System.out.println("Rice new price: " + rice.getPrice());
        System.out.println("Shirt new price: " + shirts.getPrice());
    }
    
}
