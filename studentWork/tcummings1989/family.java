
package tcummings1989;

import java.util.*;

public class family {
    public static void main (String[] args){
    String[] fam = new String[8];
    Scanner scanner = new Scanner(System.in);

System.out.println ("Enter family member names.");
System.out.println ("Enter your name first. What is your name?");

    fam[0]= scanner.nextLine();

    System.out.println ("Now let's enter the rest of your family one at a time");
    fam[1]= scanner.nextLine();
    fam[2]= scanner.nextLine();
    fam[3]= scanner.nextLine();
    fam[4]= scanner.nextLine();
    fam[5]= scanner.nextLine();
    fam[6]= scanner.nextLine();
    fam[7]= scanner.nextLine();

    System.out.println ("Donzo! Here is your family..." + fam[0].toString() + " ," + fam[1].toString() + " ," + fam[2].toString()+ " ," + fam[3].toString()+ " ," + fam[4].toString()+ " ," + fam[5].toString()+ " ," + fam[6].toString()+ " ," + fam[7].toString());

    }}
