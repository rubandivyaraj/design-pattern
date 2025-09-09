package creational.builder;

public class Meal {
    private String mainCourse;
    private String sideDish;
    private String drink;

    public Meal(MealBuilder mealBuilder) {
        this.mainCourse = mealBuilder.getMainCourse();
        this.sideDish = mealBuilder.getSideDish();
        this.drink = mealBuilder.getDrink();
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mainCourse='" + mainCourse + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }

    public static class MealBuilder {
        private String mainCourse;
        private String sideDish;
        private String drink;

        public MealBuilder() {
        }

        public String getMainCourse() {
            return mainCourse;

        }

        public String getSideDish() {
            return sideDish;
        }

        public String getDrink() {
            return drink;
        }

        public MealBuilder setMainCourse(String mainCourse) {
            this.mainCourse = mainCourse;
            return this;
        }

        public MealBuilder setSideDish(String sideDish) {
            this.sideDish = sideDish;
            return this;
        }

        public MealBuilder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }


    }
}
