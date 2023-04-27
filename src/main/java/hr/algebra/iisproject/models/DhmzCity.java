package hr.algebra.iisproject.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class DhmzCity extends City implements Serializable {
    private String temperature;
    private String humidity;
    private String airPressure;
    private String windDirection;
    private String windSpeed;
    private String weatherDescription;

    public DhmzCity(String name, String temperature, String humidity, String airPressure, String windDirection, String windSpeed, String weatherDescription) {
        super(name);
        this.temperature = temperature;
        this.humidity = humidity;
        this.airPressure = airPressure;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.weatherDescription = weatherDescription;
    }
}
