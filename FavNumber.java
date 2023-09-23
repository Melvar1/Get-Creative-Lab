import java.util.Scanner; // import scanner class
// this program takes user's favorite number and manipulates it
public class FavNumber {
    int userNumber; // first input by user
    
// creates constructor for FavNumber with an integer parameter
    public FavNumber(int number) { 
        this.userNumber = number;
    }
// created method called manipulateNumber that will manipulate user's input
    public void manipulateNumber() {
        int newNumber;
        // if user's input is even and greater than 10, it will add 10 - my favorite numbner
        if (userNumber % 2 == 0 && userNumber > 10 ) {
            newNumber = userNumber + 10;
            System.out.println("Your favorite number is even and great than 10, so I added my favorite number, 10, which equal:  " + newNumber);
        // or else it will subtract ten
        } else { 
            newNumber = userNumber - 10;
            System.out.println("Your favorite number is odd and less than 10, so I subtracted my favorite number, 10, which equals: " + newNumber);
        }
    }
    //method that multiplies user's number by 10
    public void multiplyNumber() {
        int result = userNumber * 10;
        System.out.println(userNumber + " * 10 = " + result);
    }

    //divides user's input by 10
    public void divideNumber() {
      float result = (float) userNumber / 10;
      System.out.println(userNumber + " / 10 = " + result);
    }

    //checks the user's input relation to 10
    public void relationToNumber() {
        if (userNumber == 10) {
            System.out.println("Wow, we have the same favorite number!");
        } else if (userNumber > 10) {
            System.out.println("Your favorite number is larger than 10.");
        } else if (userNumber < 10) {
            System.out.println("My favorite number is bigger than yours!");
        } else {
            System.out.println("Cool number.");
        }
    
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creates a new instance of scanner

        System.out.print("What's your favorite number?: "); //ask's user's favorite number
        int userNumber= input.nextInt(); //reads line from the console

        System.out.println("My favorite number is 10, so I created different methods to manipulate your favorite number with my favorite number! :).....");
        
        FavNumber person1 = new FavNumber(userNumber); //creates new instance of FavNumber class and takes user's input as the parameter
        person1.manipulateNumber(); // calls created manipulateNumber method and applies it to created object person1
        person1.multiplyNumber(); //multiplies user's number by 10
        person1.divideNumber(); // divides user's number by 10
        person1.relationToNumber(); //checks user's number relationship to 10

        
        System.out.println("\nNow I am just going to manipulate the number 10: ");

       
        
        // use of string type
        String ten = "ten";
        System.out.println("10 made into a string is: " + ten);
        
        // use of double type
        double myDouble = (double) 10 + 0.1234;
        System.out.println("10 made into a double = " + myDouble);

        // use of short type
        short myShort = (short) (10 * 3276);
        System.out.println("10 made into a short = " + myShort);

        // use of byte type
        byte myByte = (byte) (10 * 120);
        System.out.println("10 made into a byte = " + myByte);

        // use of char type
        char a = 'T';
        System.out.println("The first letter in 10 is " + a);

        // use of boolean type and use of logical operators 
        boolean bool = 10 >= 20 || 10 != 30;
        System.out.println("Is 10 greater than or equal to 20, or not equal to 30?");
        System.out.println("The answer = " + bool);

       
       
        System.out.println("\n Now for assignment and unary operators: ");

        // Assignment operators
        int number = 10; // Initialize a variable with the value 10

        number += 5; // number is now 15 (equivalent to number = number + 5)
        System.out.println("10 += 5: " + number);

        number -= 3; // number is now 12 (equivalent to number = number - 3)
        System.out.println("10 -= 3: " + number);

        number *= 2; // number is now 24 (equivalent to number = number * 2)
        System.out.println("10 *= 2: " + number);

        number /= 4; // number is now 6 (equivalent to number = number / 4)
        System.out.println("10 /= 4: " + number);

        number %= 5; // number is now 1 (equivalent to number = number % 5)
        System.out.println("10 %= 5: " + number);

        // Unary operators
        number++; // Post-increment
        System.out.println("10++ (post-increment): " + number);

        ++number; // Pre-increment
        System.out.println("++10 (pre-increment): " + number);

        number--; // Post-decrement
        System.out.println("10-- (post-decrement): " + number);

        --number; // Pre-decrement
        System.out.println("--10 (pre-decrement): " + number);


        input.close(); // closes scanner

    }
}
