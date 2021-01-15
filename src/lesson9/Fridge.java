package lesson9;

public class Fridge {
    int temperature;
    Food[] container = new Food[10];

    void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    Fridge addFood(Food food) {
        food.setCalories(500);

        for (int i = 0; i < container.length; i++) {
            if (container[i] == null) {
                container[i] = food;
                food = null;
                return this;
            }
        }
        System.out.println("Fridge full, can't add " + food);
        return this;
    }

    void print() {
        for (Food food : container) {
            if (food != null) {
                System.out.println(food.name);
            } else {
                return;
            }
        }
    }
}
