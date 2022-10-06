public class Main {
    public static void main(String[] args) {
        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]

        System.out.printf("This is a format string %d\n", 123);
        System.out.println("########################################################");

        boolean myBoolean = true;
        char myChar = '$';
        String myString = "Mario";
        int myInt = 213;
        double myDou = 121323.2323;
        //conversion - character
        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n", myChar);
        System.out.printf("%s\n", myString);
        System.out.printf("%d\n", myInt);
        System.out.printf("%f\n", myDou);


        System.out.println("########################################################");

        //width
        // minimum number of characters to be written as output
        System.out.printf("Hello %10s\n", myString);
        System.out.println();

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %.2f", myDou);
        System.out.println();

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000
        System.out.printf("You have this much money %20f\n", myDou);
        System.out.printf("You have this much money %+f\n", myDou);
        System.out.printf("You have this much money %020f\n", myDou);
        System.out.printf("You have this much money %,f\n", myDou);

    }
}
