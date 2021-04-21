package lesson11;

class Food {
    private String name;
    private int calories;

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public Food(String name) {
        setName(name);
    }

    public Food() {

    }

    private void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }
}
