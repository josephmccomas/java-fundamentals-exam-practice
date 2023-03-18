public class Pet {

    public Integer age;

    public Boolean isRescue;

    public String name;

    public Pet(Integer age, Boolean isRescue, String name) {
        this.age = age;
        this.isRescue = isRescue;
        this.name = name;

        if (name == null) {
            throw new IllegalArgumentException("Name can not be null");
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getRescue() {
        return isRescue;
    }

    public void setRescue(Boolean rescue) {
        isRescue = rescue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
