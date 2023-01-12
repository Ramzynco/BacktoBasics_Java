import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner scannedNames = new Scanner(System.in);
        System.out.println("Now, Who do we have here?");

        String  libraryNames = scannedNames.nextLine();
        System.out.println("Hello," + " " + (libraryNames) + " " + "I can already tell that you are a special one!");

    }

            // Find how to run the code from here on to the classes below....
    public class secondQuestion{
        public static void secondQuestion (String[] args)
        {
            Scanner birthYear = new Scanner(System.in);
                        /*
                        System.out.println("You see" + " " + (libraryNames) + "We were born millions of years ago as souls and have taken birth in physical bodies of millions of different species including the human species. Every time we take birth in a physical body,"+ " " + (libraryNames) + " " + "it is to be understood as a transmigration stage, as after death we (the soul) would get into another physical body of any other species. This means there is no permanency in any body and we cannot be guaranteed a human body all the time.\n" +
                        "\n" +
                        "This also implies that we must have no ego whatsoever of being born as a human being. It is only that temporarily we are in this body and nobody knows what we would be in our next birth: a monkey, a donkey, a bird, a snake or a fish. Or we could be a mosquito, a bacteria or a cancer cell in somebody’s body (may be in a body of a person who has been our own relative in the past birth) and kill the same person. ?");
                        */
            // Find how to call the scanned inout  libraryNames from the Main Class

            System.out.println("You see We were born millions of years ago as souls and have taken birth in physical bodies of millions of different species including the human species. Every time we take birth in a physical body,it is to be understood as a transmigration stage, as after death we (the soul) would get into another physical body of any other species. This means there is no permanency in any body and we cannot be guaranteed a human body all the time.\n" +
                    "\n" +
                    "This also implies that we must have no ego whatsoever of being born as a human being. It is only that temporarily we are in this body and nobody knows what we would be in our next birth: a monkey, a donkey, a bird, a snake or a fish. Or we could be a mosquito, a bacteria or a cancer cell in somebody’s body (may be in a body of a person who has been our own relative in the past birth) and kill the same person. Ok, Then Let's get on with it, Which year were you born??");

            int collectionBirthYear = birthYear.nextInt();

             System.out.println("So i see, you are born in" + "" + (collectionBirthYear));


        }
    }
}

