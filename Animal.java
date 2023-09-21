public class Animal {

    public static int numOfAnimals = 0;

    //Create a constructor

    public Animal(){
        numOfAnimals++;
    }

    String name;
    String birthSeason;
    String color;

    //create a method
    public void makeNoise(){
        System.out.println("This is an animal object making noise.....");
    }
    public String makeNoise2(){
        return "This is the sound of this animal";
    }



}
