//`String`, `char`, `short`, `int`, `long`, `float`, `double`, and `boolean`.


public class MixMatch {
    public static void main(String[] args){

String name = "Ethan";
System.out.println(name + " <- this is the name string I created it can hold a assortment of words");
System.out.println();

char letter = 's';
System.out.println(letter + " <- this is the char variable i created it can hold single characters instead of words or sentences");
System.out.println();

short smallnumber = 10;
System.out.println(smallnumber +" <- shorts like int store whole numbers however it only has 16 bits to work with meaning it has a much lower minimum and maximum value it can store, the number is roughtly 32,000 postive and negative");
System.out.println();

int number = 40;
System.out.println(number + " <- the int data type is a 32 bit signed variable, it can hold a large number, roughtly 2.147 bilion both positive and negative");
System.out.println();

long largenumber =1000;
System.out.println(largenumber + " <- the long data type is once again like int, or short, but has more bites, this means it can hold much larger values  roughly 2^61 long values");
System.out.println();

float floatnumber = 2.33f;
System.out.println(floatnumber + " <- the float data type is used becuase it takes up half the memory of double, however it will lose sig figs at around 7 decimal places.");
System.out.println();

double doublenumber = 2.35;
System.out.println(doublenumber + " <- the double data type uses 8 bits of data and is used to store numbers that can or do contain decimal points");
System.out.println();

boolean myBool = true;
System.out.println(myBool + " <- the boolean data type is used to hold true or false, mainly used for conditional statements");

    }
}