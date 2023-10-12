package ontopic.week3.day2Notes;

//subclass of Animal, takes age and hunger i think but adds breed
class Dog extends Animal{
    String breed;
    Dog(String breed) {
        this.breed = breed;
    }
    Dog (int age, int hunger, String breed) {
        this.breed = breed;
        super.age = age;
        super.hunger = hunger;
    }
    //overrides Animal.die()
    @Override
    void die() {
        System.out.println("dog has died :(");
    }
}