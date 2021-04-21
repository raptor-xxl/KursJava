package lesson11;

public class Fridge {
    private int temperature;
    private Food[] container = new Food[10];

    public Fridge(Food food) {
        addFood(food);
    }

    public Fridge(Food... food) {
        addFood(food);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Fridge addFood(Food food) {
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

    public Fridge addFood(Food... food) {
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

    public void print() {
        for (Food food : container) {
            if (food != null) {
                System.out.println(food.getName());
            } else {
                return;
            }
        }
    }

    public int getTemperature() {
        return temperature;
    }
}
