/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1pbo;

/**
 *
 * @author Lenovo
 */
public class Conversion {
    double reamur(double temp){
        double tempReamur = (4*temp)/5;
        return tempReamur;
    }
    
    double fahrenheit(double temp){
        double tempFahrenheit = ((9 * temp)/5) + 32;
        return tempFahrenheit;
    }
    
    double kelvin(double temp){
        double tempKelvin = temp + 273.15;
        return tempKelvin;
    }
    
    void condition(double temp){
        if (temp <= 0){
            System.out.println("Freezing");
        }else if (temp > 0 || temp < 100){
            System.out.println("Normal");
        }else if (temp >= 100){
            System.out.println("Boiling");
        }
    }

    String fahrenheit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
