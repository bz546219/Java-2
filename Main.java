//Java Tutorial Notes

//Variables
    /*
    - String  → stores text, surrounded by double quotes ("Hello")
    - int     → stores whole numbers without decimals (123, -45)
    - float   → stores numbers with decimals (19.99f, -2.5f)
    - char    → stores a single character, surrounded by single quotes ('a', 'B')
    - boolean → stores true or false values

    syntax: type variableName = value;
    */

    //Example
    public class Main{
        public static void main(String[] args){
            int x = 5;
            int y = 6;
            int z = 50;
            System.out.println(x + y + z);
        }
    }

//Data Types
    /*
    Primitive Data Types:
    - byte → whole numbers from -128 to 127 (1 byte)
    - short → whole numbers from -32,768 to 32,767 (2 bytes)
    - int → whole numbers from -2,147,483,648 to 2,147,483,647 (4 bytes)
    - long → whole numbers from -9 quintillion to 9 quintillion (8 bytes) - add 'L' for
    large numbers
    - float → fractional numbers, 6-7 decimal digits precision (4 bytes) - add 'f' at
    the end
    - double → fractional numbers, 15-16 decimal digits precision (8 bytes) - add 'd'
    if desired
    - boolean → true or false (1 bit, but size depends on JVM)
    char → single character or ASCII value (2 bytes, supports Unicode)

    Non-Primitive Datatypes:
    String → store a sequence of characters (text)
    Arrays
    Classes
    */

    //Examples
    public class Main{
        public static void main(String[] args){
            int items = 50;
            float costPerItem = 9.99f;
            float totalCost = items * costPerItem;
            char currency = '$';
            System.out.println("Number of items: " + items);
            System.out.println("Cost per item: " + costPerItem + currency);
            System.out.println("Total cost = " + totalCost + currency);
        }
    }

//Java Type Casting
    /*
    - Widening Casting (automatically) - converting a smaller type to a larger type
    size byte -> short -> char -> int -> long -> float -> double
    - Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte
    */
    //Examples (Widen and Narrowing)
    public class Main{
        public static void main(String [] args){
            int myInt = 10;
            double myDouble = myInt;
            System.out.println(myInt);
            System.out.println(myDouble);
        }
    }
    public class Main{
        public static void main(String [] args){
            double myDouble = 9.78d;
            int myInt = (int) myDouble;
            System.out.println(myDouble);
            System.out.println(myInt);
        }
    }

//Java Operators
    /*
    Arithmetic Operators:
    - '+' → adds together two values
    - '-' → subtracts one value from another
    - '*' → multiplies two values
    - '/' → divides one value by another
    - '%' → returns the division remainder
    - '++' → increase the value of a variable by 1
    - '--' → decreases the value of a variable by 1
    - '==' → equal to
    - '!=' → not equal
    - '>' → greater than
    - '<' → less than
    - '>=' → greater than or equal to
    - '<=' → less than or equal to

    Assignment Operators:
    Operator    Example    Same As
    =           x = 5      x = 5
    +=          x += 3     x = x + 3
    /=          x /= 3     x = x / 3
    %=          x %= 3     x = x % 3
    Applies to other symbol too

    Java Logical Operators:
    - '&& (Logical and)' Returns true if both statements are true
    - '|| (Logical or)' Returns true if one of the statements is true
    - '! (Logical not)' Reverse the result, returns false if the result is true
    */
    //Examples:
    public class Main{
        public static void main(String[] args){
            int x = 10;
            x+=5;
            System.out.println(x);
        }
    }

//Java Strings
    /*
    - length() → number of characters in string
    - toUpperCase() → converts all letters to uppercase
    - toLowerCase() → converts all letters to lowercase
    - indexOf("x") → finds first position of substring "x"
    */

    //Examples:
    public class Main{
        public static void main(String[] args){
            String txt = "Please locate where 'locate' occurs!";
            System.out.println(txt.indexOf("locate"));
        }
    }

    /*
    - Known as concatenation, we can combine strings by using the + operation or the
    concat() method
    - Strings are concatenated, while numbers are added
    */

    //Examples:
    public class Main{
        public static void main(String[] args){
            String firstName = "John";
            String lastName = "Doe";
            System.out.println(firstName.concat(lastName));
        }
    }

    /*
    Strings (Special Characters):
    - \' → Single quote
    - \" → Double quote
    - \\ → Backslash
    - \n → New line
    - \r → Carriage return
    - \t → Tab
    - \b → Backspace
    - \f → Form feed
    */

    //Examples
    public class Main{
        public static void main(String[] args){
            String txt = "It\'s alright";
            System.out.println(txt);
        }
    }

//Java Math
    /*
    - Math.max → Find the highest value of x and y
    - Math.min → Find the lowest value of x and y
    - Math.sqrt → Returns the square root of x
    - Math.abs → Returns the absolute or positive value of x
    - Math.random → Returns a random number between 0.0 (inclusive) or 1.0
    (exclusive)
    */

    //Examples
    public class Main{
        public static void main(String[] args){
            int random = (int)(Math.random() * 101);
            System.out.println(random);
        }
    }

//Java Booleans
    /*
    - Boolean is a data type that returns true or false
    - A boolean expression returns a boolean value (true or false)
        EX: You can use a comparison symbol, such as >
    */

    //Examples
    public class Main{
        public static void main(String[] args){
            int myAge = 16;
            int votingAge = 18;
            System.out.println(myAge > votingAge);
        }
    }

//Java if... else
    /*
    - Use the if statement to specify a block of Java code to be executed if a
    condition is true
    - Use the else statement to specify a block of code to be executed if the
    condition is false
    - Use the else if statement to specify a new condition if the first condition
    is false
    - There is also a short-hand if else, which is known as the ternary operator
    because it consists of three operands
    */

    //Examples
    public class Main{
        public static void main(String[] args){
            int time = 22;
            if (time < 10){
                System.out.println("Good morning.");
            }
            else if (time < 18){
                System.out.println("Good day.");
            }
            else{
                System.out.println("Good evening.");
            }
        }
    }

    public class Main{
        public static void main(String[] args){
            int time = 20;
            String result = (time < 18) ? "Good day." : "Good evening.";
            System.out.println(result);
        }
    }

//Java Switch
    /*
    - Lets you replace multiple if...else if...else statements with a
    cleaner structure that selects one block of code to run based on an
    expression’s value
    - The break keyboard stops execution of the switch block after a match is
    found, prevents the code from “falling through” to the next case, saves
    execution time by skipping unnecessary checks
    - The default keyboard runs if no case matches the expression, often placed in
    the switch block, does not require break if it's the last statement
    */

    //Examples
    public class Main{
        public static void main(String[] args){
            int day = 4;
            switch (day) {
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Looking forward to the weekend!");
            }
        }
    }

//Java While Loop
    /*
    - While loop run as long as conditions are true
    - Do/While loop will run at least once, EVEN if the condition is false
    - Update the variable inside the condition or the loop will run forever
    - Do/While loop is useful when you need the code to execute before testing
    the condition
    */

    //Examples
    public class Main{
        public static void main(String[] args){
            int countdown = 3;
            while (countdown > 0){
                System.out.println(countdown);
                countdown--;
            }
            System.out.println("Happy New Year!");
        }
    }

    public class Main{
        public static void main(String[] args){
             int i = 10;
             do {
                 System.out.println("i is" + i);
                 i++;
             }
             while (i < 5);
        }
    }

//Java For Loop
    /*
    - When you know exactly how many times you want to loop through a block of
    code, use the for loop instead of a while loop
    - Statement 1 is executed (one time) before the execution of the code block
    - Statement 2 defines the condition for executing the code block
    - Statement 3 is executed (every time) after the code block has been executed

    Nested Loops:
    - A loop inside another loop
    - Outer loop runs first
    - For each outer iteration, the inner loop runs fully

    For-Each Loop:
    - Used for arrays/collections
    - iterates directly through element
    */

    //Example
    public class Main{
        public static void main(String[] args){
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
                sum = sum + i
            }
            System.out.println("Sum is " + sum);
        }
    }

    public class Main{
        public static void main(String[] args){
            for (int i = 1; i <= 3; i++){
                for (int j = 1; j<= 3; j++){
                    System.out.print(i * j + " ");
                }
                System.out.println();
            }
        }
    }

    public class Main{
        public static void main(String[] args){
            String [] cars = {"volvo", "BMW", "Ford", "Mazda"};
            for (String i : cars) {
                System.out.println(i);
            }
        }
    }

//Java Break or Continue
    /*
    Java Break:
    - Purpose: Immediately exits the entire loop when a certain condition is met
    - Use case: Stop looping once you found what you need

    Java Continue:
    - Purpose: Skips only the current iteration and continues with the next
    iteration
    - Use case: Ignore certain cases but keep looping
    */

    //Examples
    public class Main{
        public static void main(String[] args){
           for (int i = 0; i < 10; i++){
               if (i == 4) {
                   break;
               }
           System.out.println(i);
           }
        }
    }

    public class Main{
        public static void main(String [] args){
           for (int i = 0; i < 10; i++){
               if (i == 4) {
                   continue;
               }
               System.out.println(i);
           }
        }
    }

//Java Arrays

    /*
    - An array lets you store multiple values in a single variable
    - 'String [] cars;' Declares an array of String values
    (but doesn’t fill it yet)
    - You can loop through the array elements with the for loop, and use the
    length property to specify how many times the loop should run

    Multidimensional Arrays:
    - A multidimensional array is an array of arrays
    - Most common is the 2D array, which works like a table (rows & columns)
    */

    //Examples
    public class Main{
        public static void main(String [] args){
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            cars[0] = "Opel";
            System.out.println(cars[0]);
        }
    }

    public class Main{
        public static void main(String [] args){
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i]);
            }
        }
    }

    public class Main{
        public static void main(String [] args){
            int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
            for (int[] row : myNumbers) {
                 for (int i : row) {
                     System.out.println(i);
                 }
            }
        }
    }