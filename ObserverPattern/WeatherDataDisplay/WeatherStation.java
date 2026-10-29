package ObserverPattern.WeatherDataDisplay;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        currentConditionDisplay.display();
        weatherData.setMeasurements(80, 65, 36.4f);
        currentConditionDisplay.display();
    }
}
