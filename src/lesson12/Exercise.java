package lesson12;

public class Exercise {
    public static void main(String[] args) {
        Fridge fridge = new Fridge(new Apple(), new Banana(), new Mango());
        fridge.print();
    }
}
