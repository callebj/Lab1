package com.company;

import java.awt.*;

/**
 * Create a detailed car with set parameters
 *
 * @author Calle Bjureblad
 * @version 1.0
 * @since 1.0
 * @see Saab95
 * @see Volvo240
 */
abstract class Car {

    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name

    /**
     * Creates a car with specific number of doors, engine power, color of the car, and the model name of the car.
     *
     * @param nrDoors the number of doors of the car
     * @param enginePower the engine power of the car
     * @param color the color of the car
     * @param modelName the model name of the car
     */
    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        stopEngine();
    }

    /**
     * Returns the number of doors the car.
     *
     * @return the amount of doors the car has
     */
    public int getNrDoors(){
        return nrDoors;
    }

    /**
     * Returns the engine power the car.
     *
     * @return the amount of engine power the car has
     */
    public double getEnginePower(){
        return enginePower;
    }

    /**
     * Returns the current speed the car.
     *
     * @return the current speed of the car
     */
    public double getCurrentSpeed(){
        return currentSpeed;
    }

    /**
     * Returns the current color of the car.
     *
     * @return the color of the car
     */
    public Color getColor(){
        return color;
    }

    /**
     * Sets a new color for the car.
     *
     * @param clr the new color of the car
     */
    public void setColor(Color clr){
        color = clr;
    }

    /**
     * Sets the current speed to 0.1.
     */
    public void startEngine(){
        currentSpeed = 0.1;
    }

    /**
     * Sets the current speed to 0.
     */
    public void stopEngine(){
        currentSpeed = 0;
    }

    /**
     * Returns the speed factor that is used to accelerate and decelerate the car.
     *
     * @return the speed factor
     */
    public abstract double speedFactor();

    /**
     * Sets the current speed of th car to a new value, the method ONLY increases the speed.
     *
     * @param amount the amount the car should increase speed by
     */
    public abstract void incrementSpeed(double amount);

    /**
     * Sets the current speed of the car to a new value, the method ONLY decreases the speed.
     *
     * @param amount the amount the car should decrease speed by
     */
    public abstract void decrementSpeed(double amount);

    /**
     * Increments the speed by a set amount.
     * Amount is only between 1 and 0.
     *
     * @param amount the amount to increase the speed of the car
     */
    public void gas(double amount){
        if (amount > 1 || amount < 0) return;
        //if (getCurrentSpeed() < 0 || getCurrentSpeed() > getEnginePower()) return;

        double initSpeed = getCurrentSpeed();
        incrementSpeed(amount);

        if (initSpeed > getCurrentSpeed() || getCurrentSpeed() > getEnginePower()) {
            decrementSpeed(amount);
        }
    }

    /**
     * Decrements the speed by a set amount.
     * Amount is only between 1 and 0.
     *
     * @param amount the amount to decrease the speed of the car
     */
    public void brake(double amount){
        if (amount > 1 || amount < 0) return;

        double initSpeed = getCurrentSpeed();
        decrementSpeed(amount);

        if (initSpeed < getCurrentSpeed() || getCurrentSpeed() < 0) {
            incrementSpeed(amount);
        }
    }
}
