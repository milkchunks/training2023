package ontopic.week3.Polymorphism;

//subclass of animal, takes age and hunger but adds color
class Cat extends Animal{
    String color;
    Cat(String color) {
        this.color = color;
    }
    Cat(int age, int hunger, String color) {
        super.age = age;
        super.hunger = hunger;
        this.color = color;
    }
}
