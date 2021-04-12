package lesson10;

public class Fridge {
    int temperature;
    Food[] container = new Food[10];

    Fridge(Food food) {
        addFood(food);
    }

    Fridge(Food... food) {
        addFood(food);
    }

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

    Fridge addFood(Food... food) {
        for (int i = 0; i < container.length; i++) {
            if (container[i] == null) {
                for (int j = 0; j < food.length; j++) {
                    if (i + j == container.length) {
                        System.out.println("Fridge full, can't add " + food[j]);
                        return this;
                    }
                    container[i + j] = food[j];
                }
                return this;
            }
        }
        System.out.println("Fridge full, can't add food");
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
