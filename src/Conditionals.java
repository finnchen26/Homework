public class Conditionals {

    public static void main(String[] args) { //main method
        Conditionals MagicEightBall = new Conditionals();

    }

    public Conditionals(){ //constructor
        String question = "Do you like boba?";
        System.out.println(question);
        int randomInt = (int) (Math.random() * 11);
        System.out.println(randomInt);

        if ((randomInt) == 1) {
            System.out.println("Without a doubt.");
        } else if ((randomInt) == 3) {
            System.out.println("Better not tell you now.");
        } else if ((randomInt) == 5) {
            System.out.println("Very doubtful.");
        } else if ((randomInt) == 7) {
            System.out.println("As I see it, yes.");
        } else {
            System.out.println("As I see it, no.");
        }

    }

}

