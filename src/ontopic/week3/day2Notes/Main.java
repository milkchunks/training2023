package ontopic.week3.day2Notes;

class Main {
    public static void main(String[] args) {
        //this is allowed because jaguar is a child class of Feline
        //this probably does some nonsense with Animal inheritance
        //it's like List = new ArrayList();
        Animal cat = new Cat("black");
        Animal dog = new Dog(20, 50, "labrador");
        System.out.println(dog.age);
        System.out.println(cat.age);
        //prints "dog has died :(" because override
        dog.die();
        //prints "animal has died :(" because uses Animal.die();
        cat.die();
    }
}
