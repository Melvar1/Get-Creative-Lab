import java.util.Scanner; // import scanner class
// this program takes user's favorite number and manipulates it
public class FavNumber {
    int userNumber; //created userNumber variable as an integer type

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
            System.out.println("Your favorite number is even and great than 10, so I added my favorite number, 10, to it, which equal:  " + newNumber);
        // or else it will subtract ten
        } else { 
            newNumber = userNumber - 10;
            System.out.println("Your favorite number is odd and less than 10, so I subtracted my favorite number, 10, to it which equals: " + newNumber);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creates a new instance of scanner

        System.out.print("What's your favorite number?: "); //ask's user's favorite number
        int userNumber= input.nextInt(); //reads line from the console
        
        FavNumber person1 = new FavNumber(userNumber); //creates new instance of FavNumber class and takes user's input as the parameter
        person1.manipulateNumber(); // calls created manipulateNumber method and applies it to created object person1
        
       
        


        input.close(); // closes scanner

    }
}
