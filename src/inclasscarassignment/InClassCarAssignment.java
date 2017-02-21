/*
 * Introduction to Object Oriented Programming
 * Instructor: Jaret Wright
 * Students: Chelsea Langley, Jonah Jones, Yuriy Zhlobitskyy
 * Assignment: In-Class Car Assignment (Group)
 * Due: Tuesday, February 21st, 2017 @ 5:30 PM
 */
package inclasscarassignment;

/**
 *
 * @author Chelsea Langley, Jonah Jones, Yuriy Zhlobitskyy
 */
public class InClassCarAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Explorer Sport SUV", 2013, 27630, 31998, "V-6", (float) 3.5, 290, 255, "Automatic", "All-Wheel Drive",
        "Heated Leather Seats in Charcoal Black, Aluminum Wheels, Back-Up Camera, Satellite Radio.");
    
        car1.toString();
    }
    
}
