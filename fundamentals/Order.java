package bites.examples;

public class Order {
    Integer total;

    Order(Integer total) {
        this.total = total;
    }

    public void addAmount(int amount) {
        total = total + amount;
    }

    public void addDiscount(int discount) {
        total = total - discount;
    }

    public Integer getTotal() {
        return total;
    }

    public String friendlyTotal() {
        return String.format("Thanks! The total value of your order is £%d", total);
    }

    public static void main(String[] args) {
        Order order = new Order(50);
        order.addAmount(100);
        order.addDiscount(70);
        System.out.println(order.getTotal());
    }
}
