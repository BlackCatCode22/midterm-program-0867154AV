



public class Cat {

    public static final int MAX_LIVES = 9;
    private static int catCount = 0;

// Cat sounds
    String CatSound1 = "~~meow~~";
    String CatSound2 = "HISSSSS";
    String CatSound3 = "Meow";



    String name;

    int age;

    int weight;

    int livesRemaining;

    public void meow(){
        System.out.println("Meow");
    }
    public void meow2(){
        System.out.println(CatSound1);
    }
    public Cat () {
    catCount++;
    livesRemaining = MAX_LIVES;
    }

    public static int getCatCount() {
        return catCount;
    }



}
