package web;


public class Car {
    private String model;
    private int age;
    private int price;

    public Car(String model, int age, int price) {
        this.model = model;
        this.age = age;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
