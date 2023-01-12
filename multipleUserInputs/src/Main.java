import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner scannedNames = new Scanner(System.in);

        String libraryNames = scannedNames.nextLine();
        System.out.println("Hello," + " " + (libraryNames) + " " + "I can already tell that you are a special one!");

    }

    public class secondQuestion{
        public static void secondQuestion (String[] args)
        {
            Scanner birthYear = new Scanner(System.in);

            int collectionBirthYear = birthYear.nextInt();
            System.out.println("So i see, you are born in" + "" + (collectionBirthYear));

        }
    }
}

