package sg.edu.nus.iss;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Console con = System.console();
        String name = con.readLine("What is your name?");
        //con.readLine is to expect an input

        if (name.length() > 0){
        //different ways to pring the same content to console terminal
        System.out.printf ("\nNice to meet you, %s", name);
        System.out.println ("\nNice to meet you, "+ name);

        Integer age = 80;
        System.out.printf ("\n%s is %d years old", name, age);
        System.out.println (name + "is" + age + "years old");

        String mother_name = "Esther";
        System.out.printf ("\nMy name is %s. Mother is %s.", name, mother_name);
        System.out.println ("My name is" + name + ". Mother is" + mother_name + ".");
        // \n for space, %s String, %d int

        //Slide 17
        String input = con.readLine("What is your hobby?");
        input = input.trim(); // "  swim  " --> "swim"

        if (input.equals("swim")) {
            System.out.println("The nearest swimming pool is in Clementi.");  
        } else if (input.equals("jog")){
            System.out.println("The nearest park is West Coast Park.");
        } else if (input.equals("jog")){
            System.out.println("You could cycle along the PCN.");
        } else {
            System.out.println("Seems like you are a boring person without a hobby!");
        }
        
        //Slide 18 swtich statement 
        switch (input.trim().toLowerCase()) {
            case "swim":
                System.out.println("The nearest swimming pool is in Clementi.");
                break;
            case "jog":
                System.out.println("The nearest park is West Coast Park.");
                break;
            case "cycle":
                System.out.println("You could cycle along the PCN.");
                break;
            default:
                System.out.println("Seems like you are a boring person without a hobby!");
                break;
            }

        //Slide 19
        Integer myAge = 0;
        String inputAge = con.readLine("What is your age?");

        myAge = Integer.parseInt(inputAge);

        if (myAge >= 0 && myAge <=2) {
            System.out.println("You are a baby.");
        } else if (myAge >2 && myAge <=4) {
            System.out.println("You are a toddler.");
        } else if (myAge >4 && myAge <=12) {
            System.out.println("You are a child.");
        } else if (myAge >12 && myAge <=19){
            System.out.println("You are a teen.");
        } else {
            System.out.println("You are an adult.");
        }

        //Slide 21
        Integer i = 0;
        input = con.readLine("Type a phrase");

        while (i < input.length()) {
            // do/process something here
            // e.g. Clementi --> Begin index = 0, C
            //End index - will increease based on 'i'
            //substring (beginIndex, endIndex)
            System.out.println(input.substring(0, i));
            //i++ --> i = i + 1 (increment by 1)
            //i = i + n where n is how much u wanna increment
            i++;
        }

        for (int idx=0; idx <  input.length(); idx++) {
            System.out.println(input.substring(0, i));
        }

        //Slide 23
        String [] toDo = new String [5];

        for (int pos = 0; pos < toDo.length; pos++){
            input = con.readLine("Enter to do task" + (pos + 1) +": ");
            toDo[pos] = input;
        }

        for (int pos = 0; pos < toDo.length; pos++){
            System.out.println("Task " + (pos + 1) + ": " + toDo[pos]);
        }
        
        //Slide 24
        String strName = "NUS";

        if (args.length > 0){
            strName = args[0];
        }

        } else {
        System.err.println("You have not told me your name!");
        }
}
}
