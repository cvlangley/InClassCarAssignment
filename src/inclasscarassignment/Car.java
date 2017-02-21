/*
 * Introduction to Object Oriented Programming
 * Instructor: Jaret Wright
 * Students: Chelsea Langley, Jonah Jones, Yuriy Zhlobitskyy
 * Assignment: In-Class Car Assignment (Group)
 * Due: Tuesday, February 21st, 2017 @ 5:30 PM
 */

/**
 *
 * @author Chelsea Langley, Jonah Jones, Yuriy Zhlobitskyy
 */
package inclasscarassignment;
import java.time.LocalDate;

public class Car {
    String make, model, features,transmissionType, driveTrain, engineType;
    int year, mileage, horsepower, maxTorque, askingPrice;
    float engineSize;
    public Car(String make, String model, int year, int mileage, int askingPrice, String engineType, float engineSize, int horsepower, int maxTorque, String transmissionType, String driveTrain, String features)
    {
        setMake(make);
        setModel(model);
        setYear(year);
        setMileage(mileage);
        setAskingPrice(askingPrice);
        setEngineType(engineType);
        setEngineSize(engineSize);
        setHorsepower(horsepower);
        setMaxTorque(maxTorque);
        setTransmissionType(transmissionType);
        setDriveTrain(driveTrain);
        setFeatures(features);
        
    } // end of Car constructor
    /**
     * This method is used to return the make of the car (i.e. Ford)
     * @return make - the make of the vehicle.
     */
    public String getMake() {
        return make;
    }// end of getMake method
    
    /**
     * This method is used to set the make of the car (i.e. Ford)
     * @param make - the make of the car.
     */
    public void setMake(String make) {
        this.make = make;
    }// end of setMake method
    /**
     * This method is used to return the model of the car (i.e. F150)
     * @return model - the model of the car.
     */
    public String getModel() {
        return model;
    }// end of getModel method

    /**
     * This method is used to set the model of the car (i.e. F150)
     * @param model - the model of the car.
     */
    public void setModel(String model) {
        this.model = model;
    }// end of setModel method
    
    /**
     * This method is used to return the features of the car (i.e. heated leather seats, black interior, etc.)
     * @return features - the features of the car.
     */
    public String getFeatures() {
        return features;
    }// end of getFeatures method

    /**
     * This method is used to set the features of the car (i.e. heated leather seats, black interior, etc.)
     * @param features - the features of the car.
     */
    public void setFeatures(String features) {
        this.features = features;
    }// end of setFeatures method

    /**
    * This method is used to return the transmission type of the car (i.e. automatic, manual, etc.)
    * @return transmissionType - the transmission type of the car.
    */
    public String getTransmissionType() {
        return transmissionType;
    }// end of getTransmissionType method

    /**
     * This method is used to set the transmission type of the car (i.e. automatic, manual, etc.)
     * @param transmissionType - the transmission type of the car.
     */
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    } // end of setTransmissionType method

    /**
     * This method is used to return the type of drive train the car has (i.e. front wheel drive, rear wheel drive, all-wheel drive).
     * @return driveTrain - the type of drive train the car has.
     */
    public String getDriveTrain() {
        return driveTrain;
    }// end of getDriveTrain method
    
    /**
     * This method is used to set the type of drive train the car has (i.e. front wheel drive, rear wheel drive, all-wheel drive).
     * @param driveTrain - the type of drive train the car has.
     */
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }// end of setDriveTrain method

    /**
     * This method is used to return the type of engine the car has.
     * @return engineType - the type of engine the car has.
     */
    public String getEngineType() {
        return engineType;
    }// end of getEngineType method

    /**
     * This method is used to set the type of engine the car has.
     * @param engineType - the type of engine the car has.
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }// end of setEngineType method

    /**
     * This method is used to return the year the car was manufactured (i.e. 2015)
     * @return year - the year the car was manufactured.
     */
    public int getYear() {
        return year;
    }// end of getYear method
    
    /**
     * This method is used to set the year that the car was manufactured (i.e. 2015)
     * @param year - the year the car was manufactured
     */
    public void setYear(int year) {
        // make sure this car is plausible (first car made for the consumer was made in 1908)
        LocalDate today = LocalDate.now();
        int upperYear = today.getYear();
      
        if (year <= 1908 && year <= (upperYear +1)){
            this.year = year;
        }
            throw new IllegalArgumentException ("The year of the car must be between 1908, when the first car was created for the consumer,"
                    + " and " + (upperYear +1) + ".");
    }// end of setYear method

    /**
     * This method is used to return the current mileage of the car in kilometers (i.e. 100000)
     * @return mileage - the current mileage of the car in kilometers
     */
    public int getMileage() {
        return mileage;
    }// end of getMileage method

    /**
     * This method is used to set the mileage of the car (i.e. 100000).
     * @param mileage - the current milage of the car in kilometers
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }// end of setMileage method

    /**
     * This method is used to return the engine size of the car.
     * @return engineSize - the engine size of the car.
     */
    public float getEngineSize() {
        return engineSize;
    }// end of getEngineSize method
    
    /**
     * This method is used to set the engine size of the car. 
     * @param engineSize - the engine size of the car.
     */
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }// end of setEngineSize method

    /**
     * This method is used to return the horsepower of the car.
     * @return horsepower - the horsepower of the car.
     */
    public int getHorsepower() {
        return horsepower;
    }// end of getHorsepower method
    
    /**
     * This method is used to set the horsepower of the car.
     * @param horsepower - the horsepower of the car.
     */
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }// end of setHorsepower method

    /**
     * This method is used to return the maximum torque of the car.
     * @return maxTorque - the maximum torque of the car.
     */
    public int getMaxTorque() {
        return maxTorque;
    }// end of getMaxTorque method

    /**
     * This method is used to set the maximum torque of the car.
     * @param maxTorque - the maximum torque of the car.
     */
    public void setMaxTorque(int maxTorque) {
        this.maxTorque = maxTorque;
    }// end of setMaxTorque method
    
    /**
     * This method is used to return the asking price for the car (i.e. 15000).
     * @return askingPrice - the asking price for the car.
     */
    public int getAskingPrice() {
        return askingPrice;
    }// end of getAskingPrice method

    /**
     * This method is used to set the asking price for the car (i.e. 15000)
     * @param askingPrice - the asking price for the car
     */
    public void setAskingPrice(int askingPrice) {
        this.askingPrice = askingPrice;
    }// end of setAskingPrice method
    
    /**
     * This method is an overridden toString method that is used to return the make, model, year,
     * and mileage of the car.
     * @return carInfo - the make, model, year, and mileage of the car.
     */
    public String toString(){
        String carInfo;
        
        carInfo = String.format("Car Information: /n" + "Make: " + getMake() + "/nModel: " + getModel() + "/nYear: " + getYear()
                + "/nCurrent Mileage: " + getMileage());
        return carInfo;
    
    } // end of overriden toString method
}// end of Car class
