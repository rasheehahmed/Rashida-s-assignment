public class Flower {
    public static void main(String[] args) {
        Flower o = new Flower("Orange Rose", 19, 3.420f);
        System.out.println("Flower name: " + o.getName());
        System.out.println("Number of petals: " + o.getPetals());
        System.out.println("Price:" + o.getPrice()+"$");
    }
    private String name;
    private int petals;
    private float price;

    public Flower(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPetals() {
        return petals;
    }

    public float getPrice() {
        return price;
    }
}
