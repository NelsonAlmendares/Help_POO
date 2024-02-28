import javax.swing.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;

import static java.lang.Double.valueOf;

public class Main {
    public static void main(String[] args)
    {
        double score;
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert the score: ");
        score = reader.nextDouble();

        System.out.println("You type: " + score);
    }
}

class HelpFunctions {
    public static void Helpers () {
        // To round a number I can use this code:
        double number = 3.4521345;
        DecimalFormat RoundNumber = new DecimalFormat("#.##");
        String rounded = RoundNumber.format(number);
        System.out.println("In the format we have: " + rounded);
    }
}

class ArraysLists1 {
    public static void Arrays (){
        Collection ListMarkers = new ArrayList<String>();
        ListMarkers.add("Audi");
        ListMarkers.add("Porsche");
        ListMarkers.add("Aston Martin");
        ListMarkers.add("Ferrari");
        ListMarkers.add("Mercedes");
        ListMarkers.add("Seat");

        System.out.println("Number of elements before deleting them: " + ListMarkers.size());
        System.out.println("Elements: " + ListMarkers.toString());

        ListMarkers.remove("Seat");
        ListMarkers.remove("Mercedes");

        System.out.println("Numbers of elements after Seat and Mercedes: " + ListMarkers.size());
        System.out.println("Elementos: " + ListMarkers.toString());
    }
}

class ArraysLists2 {
    public static void Arrays (){
        // Creating array list to add elements later
        ArrayList <String> ListPerson = new ArrayList();

        // Adding elements:
        ListPerson.add("Marie Curie");
        ListPerson.add("Benjamin Franklin");
        ListPerson.add("Mario Antonio");
        ListPerson.add(1, "Juan Murillo");

        // Showing content of the ArrayList:
        System.out.println("Content of the List: " + ListPerson + "\n");

        // Getting position of one element
        int pos = ListPerson.indexOf("Benjamin Franklin");
        System.out.println("The position of the element Benjamin Franklin is: " + pos);

        // Checking if the Arrays list is empty:
        boolean check = ListPerson.isEmpty();
        System.out.println("Verifying if the array list is empty");
        if (check == true){
            System.out.println("The list is empty");
        } else {
            // Getting the size of the list:
            int size = ListPerson.size();
            System.out.println("The size of the List is" + size);
        }

        // Verifying if someone element is in the list
        check =ListPerson.contains("Marco Antonio");
        System.out.println("Verifying if someone element is in the list: " + check);

        // Getting element of specific position (string)
        String item = ListPerson.get(0);
        System.out.println("The element with the index 0 is: " + item);

        // Restoring elements of the Array List:

        // -- > First way: Using for cycle
        System.out.println("Restoring elements of the array list with for cycle");
        for (int i = 0; i < ListPerson.size(); i++){
            System.out.println("Index: " + i + " - Element" + ListPerson.get(i));
        }

        // -- > Second way: Using foreach cycle
        System.out.println("Restoring elements of the array list with foreach cycle");
        for (String Person : ListPerson){
            System.out.println("Element: " + Person);
        }

        // -- > Third way: Using Iterator
        System.out.println("Restoring elements of the array list with foreach cycle");
        for (Iterator<String> it = ListPerson.iterator(); it.hasNext();) {
            System.out.println("Element: " + it.next());
        }
        // Deleting item in the position 0
        ListPerson.remove(0);
    }
}

class POO_Week2 {

}





