/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stjepan
 */
public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor: this.sensors){
            if (!sensor.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor: this.sensors){
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor: this.sensors){
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn()){
            throw new IllegalStateException("sensor is off");
        }
        
        int sum = 0;
        for (Sensor sensor: this.sensors){
            sum += sensor.read();
        }
        int average = sum / this.sensors.size();
        this.readings.add(average);
        return average;
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
    
}
