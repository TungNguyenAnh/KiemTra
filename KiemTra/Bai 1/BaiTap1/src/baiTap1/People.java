package baiTap1;

public class People {
    public String name;
    public int age;
    public String gender;
    public double height;
    public double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public People() {
    }

    public People(String name, int age, String gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return "" +
                "Tên: " + name +
                ", Tuổi: " + age +
                ", Giới tính:: " + gender +
                ", Chiều cao: " + height +
                ", Cân nặng: " + weight
                ;
    }
}
