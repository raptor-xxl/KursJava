package lesson9;

public class Lecture {
    public static void main(String[] args) {
        Food banana = new Food();
        banana.setName("banana");
        int cal = 100;
        banana.setCalories(cal);

        Food mango = new Food();
        mango.setParameters("mango", 200);

        Food eggs = new Food();
        eggs.setParameters("eggs", 300);

        Fridge fridge = new Fridge();
        Fridge f1 = fridge.addFood(banana);
        f1.addFood(mango).addFood(eggs);

        fridge.print();
    }
}
