package temp.myTaskLect5_060223;

import java.util.Scanner;

public class UserInput {
String userInputText (String message){
    Scanner scanner = new Scanner(System.in);
    System.out.println(message);
    return scanner.nextLine();
}

int userInputInt(String message){
    Scanner scanner = new Scanner(System.in);
    System.out.println(message);
    return scanner.nextInt();
}

boolean userInputBool(String message){
    Scanner scanner = new Scanner(System.in);
    System.out.println(message);
    return scanner.nextBoolean();
}
}
