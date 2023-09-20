import java.util.Scanner; // import scanner class
// this program takes user's favorite number and manipulates it
public class FavNumber {
    int userNumber;

    public FavNumber(int number) {
        this.userNumber = number;
    }

    public void manipulateNumber() {
        int newNumber;
        if (userNumber % 2 == 0 && userNumber > 10 ) {
            newNumber = userNumber + 10;
            System.out.println("Your favorite number is even and great than 10, so I added my favorite number, 10, to it, which equal:  " + newNumber);
        } else {
            newNumber = userNumber - 10;
            System.out.println("Your favorite number is odd and less than 10, so I subtracted my favorite number, 10, to it which equals: " + newNumber);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creates a new instance of scanner

        System.out.print("What's your favorite number?: "); //ask's user's favorite number
        int userNumber= input.nextInt(); //reads line from the console
        
        FavNumber person1 = new FavNumber(userNumber);
        person1.manipulateNumber();
        
       
        


        input.close(); // closes scanner

    }
}
