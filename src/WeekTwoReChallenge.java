import java.util.Scanner;
import java.util.Random;

public class WeekTwoReChallenge {

    public static void main(String[] args){

    //VARIABLES - itemName, itemCat, itemPriority, itemStatus, userInput, result, etc.

    String itemName;
    String itemCat;


    String result = "";
    String userInput = "";


    Boolean itemStatus;


    String itemConcern = "";

    int totalChores = 0;
    int totalLowLevel = 0;
    int totalMediumLevel = 0;
    int totalHighLevel =0;

    int itemCompleteCount =0;
    int itemNotCompleteCount =0;



    //INITIALIZE SCANNER

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

        int itemPriority = 1+ rand.nextInt(3);

    //USER INPUT


      while (!(userInput.equalsIgnoreCase("quit") || !(!userInput.equalsIgnoreCase("q")))){
        printout("Enter the item you have to do: ");
        itemName = scan.next();

        printout("Enter the category of this item: ");
        itemCat = scan.next();

        //printout("Your assigned priority is: ");
        //itemPriority = scan.nextInt();

        printout("Is this item completed? (true or false): ");
        itemStatus = scan.nextBoolean();

        printout("Do you have another item? Enter 'q' or 'quit' to exit: ");
        userInput = scan.next();


        if (itemPriority == 1) {
            itemConcern = "Low";
            totalLowLevel = totalLowLevel+1;
        } else if (itemPriority == 2) {
            itemConcern = "Medium";
            totalMediumLevel = totalMediumLevel+1;
        } else if (itemPriority == 3) {
            itemConcern = "High";
            totalHighLevel = totalHighLevel+1;
        }
        else {
            itemConcern = "Invalid";
        }

        if (itemStatus == true){
            itemCompleteCount = itemCompleteCount+1;
        }

        if (itemStatus == false){
            itemNotCompleteCount = itemNotCompleteCount+1;
        }

        totalChores = totalChores+1;

        result += itemName + "\t\t\t" + itemCat + "\t\t\t" + itemConcern + "\t\t" + itemStatus + "\n";


    }

    //DISPLAYED

        printout("Item Name" + "\t\t" + "Category" + "\t" + "Priority" + "\t\t" + "Done?");
        printout(result+ "\n");

        printout("Low Level: "+ totalLowLevel +"\t"+ "Medium Level:  " + totalMediumLevel +"\t"+ "High Level:  "+ totalHighLevel  + "\n");
        printout("# of items completed: " + itemCompleteCount);
        printout("# of items NOT completed:  " + itemNotCompleteCount);
        printout("Total chores:  " + totalChores);


    }


    public static void printout(String printout){
        System.out.println(printout);
    }




}
