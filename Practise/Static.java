package Practise;

class Counter{
    private static int count = 0;

    public Counter(){
        count++;
    }


    public static void resetCount(){
        count = 0;
    } 

    public static int getCount(){
        // System.out.println("current value of count: " + count);
        return count;
    }

}

public class Static {
    public static void main(String[] args) {
        System.out.println("Initial count: " + Counter.getCount());

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Count after creating 3 objects: " + Counter.getCount());

        Counter.resetCount();
        System.out.println("Count after reset: " + Counter.getCount());

        
    }
    
}
