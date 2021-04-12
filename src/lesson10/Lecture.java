package lesson10;

public class Lecture {
    public static void main(String[] args2) {
        Food banana = new Food("banana", 100);
        Food mango = new Food("mango");
        Food apple = new Food();
        apple.setName("apple");

        Fridge fridge = new Fridge(banana, mango, apple, banana);
    }
}
