package lesson10;

public class Food {
    String name;
    int calories;

    Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    Food(String name) {
        setName(name);
    }

    Food() {

    }

    void setName(String name) {
        this.name = name;
    }

    void setCalories(int calories) {
        this.calories = calories;
    }

    void setParameters(String newName, int newCalories) {
        name = newName;
        calories = newCalories;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
