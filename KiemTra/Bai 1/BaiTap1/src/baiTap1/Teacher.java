package baiTap1;

public class Teacher extends People {
    private String level;
    private String experience;
    private String subject;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher() {
    }

    public Teacher(String name, int age, String gender, double height, double weight, String level, String experience, String subject) {
        super(name, age, gender, height, weight);
        this.level = level;
        this.experience = experience;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "" +
                "Tên: " + name +
                ", Tuổi: " + age +
                ", Giới tính:: " + gender +
                ", Chiều cao: " + height +
                ", Cân nặng: " + weight +
                "level:" + level +
                ", experience:" + experience +
                ", subject:" + subject;
    }
}
