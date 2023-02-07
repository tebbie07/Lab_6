import java.util.*;
public class Database{

public static void bankAccount(){
    System.out.println("Welcome");
    String[] names = new String[100];
    double[] balances = new double[100];
    while (true){
    System.out.println("Please choose an option: [n]ew account, [d]isplay balance, [q]uit:");
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    int i = 0;

    if (input.equals("n")){
        System.out.println("Enter a name: ");
        String name = in.nextLine();
        names[i] = name;
        System.out.println("Enter a starting balance: ");
        double balance = in.nextDouble();
        balances[i] = balance;
        i++;
    } 
    
    else if (input.equals("d")){
        System.out.println("Please enter the name to see the balance: ");
        String name = in.nextLine();
        double outbalance = balances[Arrays.asList(names).indexOf(name)];
        System.out.printf("Balance for " + name + " is $" + outbalance %.3f);
    } 
    
    else if (input.equals("q")){
        System.out.println("Thank you");
        break;
    } 
    
    else {
        System.out.println("Invalid Input");
    }
    }

}

}