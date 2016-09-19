/**
 * Created by Weibin on 9/18/2016.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Nuke2 {

    public static void main(String[] arg) throws Exception

    {
        BufferedReader keyboard;

        keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter the name of a company: ");
        System.out.flush();        /* Make sure the line is printed immediately. */
        String target = keyboard.readLine();

//        Scanner UserInput = new Scanner(System.in);
//
//        String target;
//        System.out.println("Please Enter your first name: ");
//        target = UserInput.next();

        String NewTarget;
        NewTarget = target.substring(0, 1) + target.substring(2);

        System.out.print(NewTarget);

    }


    }



