public class Variables {

    public static void main(String[] args){
/*      A Variable is a memory space in your computer to be used in your program
        Variable must start with a letter or _ or dollar sign
        They are case-sensitive
*/
        String name = "Name";
        int age = 18;

        String _name;
        int _age;

        _name = "Name"; // These are assignment Statements
        _age = 18;

        final int constant_; // Constant Variables are declared using Final Identifier
        constant_ = 7;

        int num1, num2, num3;

        num1 = 10;
        num2 = 25 + 20;
        num3 = num1 + num2;
        // Concatenation
        System.out.println("The value of num1 is: "+num1+".");
        System.out.println(+num2+" is the value of the container num2");
        System.out.println("The value of variable num3 is: "+(num1+num2)+".");

        int data1, data2;
        data1 = 50;
        data2 = 25;

        System.out.println("\nThe summation of data1 and data2 is: "+(data1+data2));
        System.out.println("The average value of data1 and data2 is:"+((data1+data2)/2));

        int value1, value2, value3;
        value1 = 20;
        value2 = 15;
        value3 = 25;

        int average = (value1 + value2 + value3)/3;

        System.out.println("The average value of value1, value2 and value3 is: "+average);

//        Find the sum of numbers from 1 to 100
        int sum_of_1_to_100 = (100/2)*(100+1);
        System.out.println("\nThe sum of numbers 1 to 100 is: " + sum_of_1_to_100);






    }
}
