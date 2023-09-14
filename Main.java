//                                              NOTES
// only one main method is allowed within a script
// within "Main class" supposed to have a method named "Main"
// add another class called "Cat"
// create another class called "Cat objects"
// has attributes, describes cats, ie) name, weight, color, birth place, etc...
// create an array list of cats (About 19 or 20 cats) using the names supplied
// save code within repository I have.
// non-static is represented as an object
//


public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Oliver";
        myCat.age = 8;
        myCat.weight = 15;
        System.out.println("Hello, My name is " + myCat.name + ", I am " + myCat.age + " years old, and weigh " +myCat.weight + " lbs.");
        System.out.println("The sound of my cat is: " + myCat.CatSound1);
        System.out.println("\n\n");

        Cat myCat2 = new Cat();
        myCat2.name = "Jr";
        myCat2.age = 2;
        myCat2.weight = 8;
        System.out.println("Hello, My name is " + myCat2.name + ", I am " + myCat2.age + " years old, and weigh " +myCat2.weight + " lbs.");
        System.out.println("The sound of my cat is: " + myCat2.CatSound2);
        System.out.println("\n\n");

        Cat myCat3 = new Cat();
        myCat2.name = "Jr";
        myCat2.age = 5;
        myCat2.weight = 9;
        System.out.println("Hello, My name is " + myCat3.name + ", I am " + myCat3.age + " years old, and weigh " +myCat3.weight + " lbs.");
        System.out.println("The sound of my cat is: " + myCat2.CatSound3);
        System.out.println("\n\n");

        
    }

}