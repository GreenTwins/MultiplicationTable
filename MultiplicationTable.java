package loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Foglea on 6/6/2017.
 */
public class MultiplicationTable {
    public static void main(String[]args){
        InputStreamReader isr= new InputStreamReader (System.in);
        BufferedReader br= new BufferedReader (isr);
        String input;
        try {
            System.out.println("Enter Number for which multiplication table is to be printed:   " );
            input = br.readLine();
            int num= Integer.parseInt(input);
            System.out.println("Multiplication table for number  " + num );
            for (int count=1; count <=10; count++){
                System.out.println(num +  "*"  + count + "=" + num*count);
            }
        }
        catch( Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();

        }
    }
}
