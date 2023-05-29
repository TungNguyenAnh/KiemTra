package baiTap1;

import baiTap1.People;

public class Main {
    public static void main(String[] args) {
        People people = new People("Tùng", 12, "Nam", 169, 61);
        System.out.println(people);
        Teacher teacher = new Teacher("Tú Anh", 24, "Nam", 169, 56, "Giảng viên", "2 năm", "CNTT");
        System.out.println(teacher);
    }
}