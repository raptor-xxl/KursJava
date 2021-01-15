package lesson9;

public class Food {
    String name;
    int calories;

    void setName(String name) {
        this.name = name;
    }

    void setCalories(int calories) {
        this.calories = calories;
        calories = 400;
    }

    void setParameters(String newName, int newCalories) {
        name = newName;
        calories = newCalories;
    }
}
