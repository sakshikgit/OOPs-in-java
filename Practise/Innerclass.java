package Practise;

import Practise.Robot.Arm;

interface Task{
    void execute();
}


class Robot{
    private String name;

    public Robot(String name){
        this.name = name;

    }
    public void performAction(){
        System.out.println(name + " is performing an action.");
    }

    // non static inner class
    class Arm{
        public void pickItem(){
            System.out.println("Arm picking an item.");
        }
    }

    // static nested class
    static class Processor{
        public void process() {
            System.out.println("Processor analyzing the data.");
        }
}

 // Method with local inner class
 public void manageSensors() {
    // Local inner class
    class Sensor {
        public void sense() {
            System.out.println("Sensor detecting obstacles.");
        }
    }
    Sensor sensor = new Sensor();
    sensor.sense();
}

public void executeTask() {
    Task task = new Task() {
        @Override
        public void execute() {
            System.out.println("Executing a custom task");
        }
    };

    task.execute();
}



}

public class Innerclass {
    public static void main(String[] args) {

          Robot robot = new Robot("RoboX");

        robot.performAction();

        // Using non-static inner class
        Robot.Arm arm = robot.new Arm();
        arm.pickItem();

        // Using static nested class
        Robot.Processor processor = new Robot.Processor();
        processor.process();

        // Using local inner class
        robot.manageSensors();

        // Using anonymous inner class
        robot.executeTask();
    }
}
        
    
    

