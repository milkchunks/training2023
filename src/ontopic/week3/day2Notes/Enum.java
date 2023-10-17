package ontopic.week3.day2Notes;


class Enum {
    enum Planet {
        MERCURY(1),
        VENUS(2),
        EARTH(3),
        MARS(4),
        JUPITER(5),
        SATURN(6),
        URANUS(7),
        NEPTUNE(8),
        PLUTO(9);

        int number;

        Planet (int number) {
            this.number = number;
        }
    }
    public static void main(String[] args) {
        //i dont quite understand how this works or why its necessary but yeah
        Planet planet = Planet.MARS;
        habitable(planet);
    }
    static void habitable(Planet planet) {
        System.out.println("Order from the sun: " + planet.number);
        switch (planet) {
            case EARTH:
                System.out.println("you can live here");
                break;
            case MARS:
                System.out.println("you can maybe live here?");
                break;
            default:
                System.out.println("you can't live here :(");
        }
    }
}
