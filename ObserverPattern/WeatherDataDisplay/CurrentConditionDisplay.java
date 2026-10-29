package ObserverPattern.WeatherDataDisplay;

public class CurrentConditionDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) { // I will treat the incoming WeatherData object as a Subject
        this.weatherData = weatherData;
        weatherData.registerObserver(this);  // Add the CurrentConditionDisplay object to the observer list
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void display(){
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity " + pressure + "Pa");
    }
}
