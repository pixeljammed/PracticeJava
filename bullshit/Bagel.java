package bites.examples;

public class Bagel {
    String seeds;
    String filling;
    Integer price;

    Bagel(String seeds, String filling, Integer price) {
        this.seeds = seeds;
        this.filling = filling;
        this.price = price;
    }

    public String getSeeds() {
        return seeds;
    }
    public String getFilling() {
        return filling;
    }
    public Integer getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Bagel bestBagelEver = new Bagel("sesame", "what sort of bagel has a filling lmao", 100);
        System.out.println(bestBagelEver.getSeeds());
        System.out.println(bestBagelEver.getFilling());
        System.out.println(bestBagelEver.getPrice());
    }
}
