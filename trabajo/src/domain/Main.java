package domain;

import domain.enums.ProductType;
import domain.models.Client;
import domain.models.Order;
import domain.models.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static domain.enums.ClientType.TIER2;
import static java.util.Locale.filter;
import static java.util.stream.Collectors.toList;


public class Main {
    public static void main(String[] args) {

        List<Client> clients = Arrays.asList(new Client(1L, "Likun", 1),
                new Client(2L, "John", 2),
                new Client(3L, "Mary", 3));

        List<Product> products = Arrays.asList(new Product(1010, "Pepsi", ProductType.DRINK, 2.50),
                new Product(1011, "Coca-Cola", ProductType.DRINK, 3.00),
                new Product(1012, "Rice", ProductType.FOOD, 5.00),
                new Product(1013, "Avocado", ProductType.FOOD, 3.00),
                new Product(1014, "Pork rind", ProductType.FOOD, 6.00),
                new Product(1015, "Shredded meat", ProductType.FOOD, 8.00),
                new Product(1016, "Fried egg", ProductType.FOOD, 2.00),
                new Product(1017, "Bean", ProductType.FOOD, 2.50),
                new Product(1018, "Skittles", ProductType.CANDY, 2.50),
                new Product(1019, "MilkyWay", ProductType.CANDY, 2.70)
        );

        List<Product> orderList1 = new ArrayList<>();

        orderList1.add(products.get(0));
        orderList1.add(products.get(1));
        orderList1.add(products.get(2));
        orderList1.add(products.get(3));
        orderList1.add(products.get(4));
        orderList1.add(products.get(5));
        orderList1.add(products.get(6));
        orderList1.add(products.get(7));
        orderList1.add(products.get(8));
        orderList1.add(products.get(9));

        List<Client> customer1 = new ArrayList<>();

        customer1.add(clients.get(0));
        customer1.add(clients.get(1));
        customer1.add(clients.get(2));


        List<Order> orders = Arrays.asList(new Order(9999, "Stock", LocalDate.of(2021, 2, 13)
                        , LocalDate.of(2021, 2, 18), orderList1 = Arrays.asList
                        (products.get(1),products.get(2),products.get(3)), (Client) customer1),
                new Order(9998, "Stock", LocalDate.of(2021, 3, 13)
                        , LocalDate.of(2021, 3, 18), orderList1 = Arrays.asList
                        (products.get(1),products.get(2),products.get(3)), (Client) customer1),
                new Order(9997, "Stock", LocalDate.of(2022, 4, 13)
                        , LocalDate.of(2022, 4, 18), orderList1 = Arrays.asList
                        (products.get(1),products.get(2),products.get(3)), (Client) customer1),
                new Order(9998, "Stock", LocalDate.of(2022, 5,18)
                        ,  LocalDate.of(2022, 5, 18), orderList1 = Arrays.asList
                        (products.get(1),products.get(2),products.get(3)), (Client) customer1));


        List<Object> listU = Stream.concat(orders.stream(), products.stream())
                .collect(Collectors.toList());

        /**List<List<Product>> productsTotal = Arrays.asList(products)

        List<Product> productsU = productsTotal.stream()
                .flatMap(product ->list.stream())
                .collect(toList());*/

        /** ///////////////////////////////////////////////////////////////////////////////////////////////////  **/
        /** ///////////////////////////////////////////////////////////////////////////////////////////////////  **/
        String opc = "1";

        do {
            Scanner s = new Scanner(System.in);
            System.out.println("//////////////////////////////// Menu //////////////////////////////////");
            System.out.println("1. Obtain a list of products belonging to the category \"Books\" with price > 100");
            System.out.println("2. Obtain a list of orders with products belonging to the category \"Baby\"");
            System.out.println("3. Get a list of products with category = \"Toys\" and then apply a 10% discount");
            System.out.println("4. Get a list of products ordered by the level 2 customer between February 1, 2021 " +
                    "and April 1, 2021");
            System.out.println("5. Get the cheapest products from the “Books” category");
            System.out.println("6. Get the 3 most recent orders");
            System.out.println("7. Calculate the total lump sum of all orders placed on a specific date (example:" +
                    " March 2022)");
            System.out.println("8. calculate the average payment for orders placed on a specific date (example March 12, 2022)");
            System.out.println("9. produce a data map with order records grouped by customer");
            System.out.println("10. Get the most expensive product by category");
            System.out.println("Put the option: ");
            System.out.println("///////////////////////////////////////////////////////////////////////");
            opc = s.next();
            switch (opc) {
                case "1": {
                    List<Product> list100 = products.stream()
                            .filter(pr -> pr.getPrice() >= 3.00)
                            .filter(pr -> pr.getCategory().equals(ProductType.FOOD)).toList();
                    System.out.println("--------------------------------");
                    System.out.println("list to the food category with a price greater than or equal to 3");
                    System.out.println(list100);
                    System.out.println("--------------------------------");
                    break;
                }
                case "2": {
                    List<Product> listBaby = products.stream()
                            .filter(pr -> pr.getCategory().equals(ProductType.DRINK)).toList();
                    System.out.println("--------------------------------");
                    System.out.println("List of products in the category drinks ");
                    System.out.println(listBaby);
                    System.out.println("--------------------------------");
                    break;
                }
                case "3": {
                    System.out.println("--------------------------------");
                    System.out.println("Beverage category list with a 10% discount");
                    descount(products);
                    System.out.println("--------------------------------");
                    break;
                }
                case "4": {
                    /**LocalDate startDate = new LocalDate()
                    List<Order> ListOrder = orders.stream(LocalDate startDate, LocalDate endDate)
                                .filter(pr -> pr.getClient().getTier().equals(TIER2))
                                .filter(pr -> pr.getOrderDate().isBefore(endDate))
                                .filter(pr -> pr.getOrderDate().isAfter(starDate)).toList();
                    System.out.println("--------------------------------");
                    System.out.println(ListOrder(orders,
                            LocalDate.of(2021,2, 13),
                            LocalDate.of(2021,2, 20));
                    System.out.println("--------------------------------");**/
                }
                case "5": {
                    List<Product> listCheap = products.stream()
                            .filter(pr -> pr.getCategory().equals(ProductType.FOOD)).min(Comparator.comparing
                                    (Product::getPrice)).stream().toList();
                    System.out.println("--------------------------------");
                    System.out.println("List of cheapest food products");
                    System.out.println(listCheap);
                    System.out.println("--------------------------------");
                    break;
                }
                case "6": {
                    List<Order> listRecent = orders.stream().sorted(Comparator.comparing(Order::getOrderDate)).toList();
                    System.out.println("--------------------------------");
                    System.out.println("Get the 3 most recent orders");
                    System.out.println(listRecent);
                    System.out.println("--------------------------------");
                    break;
                }
                case "7": {
                    double listTotal = orders.stream().filter(pr -> pr.getOrderDate().isEqual
                            (LocalDate.of(2021, 2, 13))).mapToDouble(Order::aleluya).sum();
                    System.out.println("--------------------------------");
                    System.out.println("Sum total of products on a specific date");
                    System.out.println(listTotal);
                    System.out.println("--------------------------------");
                    break;
                }
                case "8": {
                    OptionalDouble listPay = orders.stream().filter(pr -> pr.getOrderDate().isEqual
                            (LocalDate.of(2021, 2, 13))).mapToDouble(Order::aleluya).average();
                    System.out.println("--------------------------------");
                    System.out.println("the average payment for orders on a specific date");
                    System.out.println(listPay);
                    System.out.println("--------------------------------");
                    break;
                }
                case "9": {

                }
                case "10": {
                    System.out.println("--------------------------------");
                    //System.out.println(listExpensive);
                    System.out.println("--------------------------------");
                    break;
                }

            }
        }while(opc !="2");
    }

    public static void descount(List<Product> products) {
        List<Object> descount10 = products.stream()
                .filter(pr -> pr.getCategory().equals(ProductType.DRINK)).map(pr -> {
                    pr.setPrice(pr.getDiscount());
                    return pr;
                }).collect(toList());
        descount10.forEach(System.out::println);
    }

    public static void expensive(List<Product> products, ProductType type ) {
        List<Product> listExpensive = products.stream()
                .filter(pr -> pr.getCategory().equals(type))
                .max(Comparator.comparing(Product::getPrice)).stream().toList();
        System.out.println(listExpensive);
    }
}



