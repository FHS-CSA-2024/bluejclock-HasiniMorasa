package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        System.out.println("Testing Clock Display");
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("\tEmpty Con. Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(2,45);
        String test2Output = test2.getTime();
        System.out.println("\t2 Arg con.Teat - " +test2Output);
        
        test2.setTime(5,15);
        
        String test3output = test2.getTime();
        System.out.println("\t set Time Test - " + test3output); 
        
        ClockDisplay tickTest1 = new ClockDisplay(3,23);
        String tickTest1Output = tickTest1.getTime();
        System.out.println("\tTickTest1 Before increment/ticking -" + tickTest1Output);
        tickTest1.timeTick();
        String AfterTickTest1Output = tickTest1.getTime();
        System.out.println("\tTickTest1 After increment -" + AfterTickTest1Output);
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        System.out.println("Testing ClockDisplaySeconds Display");
        ClockDisplaySeconds ClockDisplaySecondstest1 = new ClockDisplaySeconds(); // Empty constructor & read time
        String ClockDisplaySecondstest1Output = ClockDisplaySecondstest1.getTime(); //& read time
        System.out.println("\tEmpty Con. ClockDisplaySeconds - " + ClockDisplaySecondstest1Output);
        
        
        
    }
}
