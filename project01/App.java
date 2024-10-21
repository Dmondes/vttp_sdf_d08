import java.util.ArrayList;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class App {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        LocalDate idCreated = LocalDate.of(2024, 10, 21);
        Date createDt = Date.from (idCreated.atStartOfDay(ZoneId.systemDefault()).toInstant());

        Product mouse = new Product(1L,"Mouse", "For click UI on screen", "Computer", createDt, (float) 99.0);
        Product keyboard = new Product(2L, "Keyboard", "Device that allows alphanumeric inputs", "Computer", createDt, (float)235.5);
        Product monitor = new Product(3L, "15.6 inch monitor", "Extended dispaly panel", "Computer", createDt, (float)157.15);
        Product huaWei = new Product(4L, "Huawei Pura 70 Ultra", "Huawei phone", "Mobile", createDt, (float) 900.0);
        Product huaWeiToo = new Product(5L, "Huawei Mate 50 Pr", "Huawei phone", "Mobile", createDt, (float)1200.0);
        Product iPhone = new Product(6L, "IPhone 16 Pro", "Iphone", "Mobile", createDt, (float)2000.0);
        Product iPhoneToo = new Product(7L, "IPhone 14 Pro", "Ihpone", "Mobile", createDt, (float)1800.0);

        products.add(mouse);
        products.add(keyboard);
        products.add(monitor);
        products.add(huaWei);
        products.add(huaWeiToo);
        products.add(iPhone);
        products.add(iPhoneToo);

        List<Product> filteredProducts = new ArrayList<>();
        filteredProducts = products.stream().filter(p -> p.getProdCat().equals("mobile") && (p.getPrice() > 1500.0f)).collect(Collectors.toList());
        filteredProducts.forEach(System.out::println);
        

        //Filter the list using stream and lambda fiunction to display mobile phones that are above 1500
    }   
}
