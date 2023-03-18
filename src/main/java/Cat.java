public class Cat extends Pet implements Meowable{

    private String color;

    public Cat(Integer age, Boolean isRescue, String name, String color) {
        super(age, isRescue, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
