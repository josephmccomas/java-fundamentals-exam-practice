public class Cat extends Pet implements Meowable{

    private String color;

    public Cat(Integer age, Boolean isRescue, String name, String color) {
        super(age, isRescue, name);
        this.color = color;
    }

    public int getVowelCountInColor(){
        int vCount = 0;
        String str = color.toLowerCase();
        System.out.println(str);
        for (int i = 0; i < str.length(); ++i) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
        }
            }
        return vCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void meow() {
        System.out.println("This is a meow!");
    }
}
