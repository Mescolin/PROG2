/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fahrenheitexception;

public class Utils {
    public static double toCelsius(double tempF) throws FahrenheitException{
        if(tempF < -459.67){
            throw new FahrenheitException();
        }
        return (tempF - 32) * 5.0/9.0;
    }
}