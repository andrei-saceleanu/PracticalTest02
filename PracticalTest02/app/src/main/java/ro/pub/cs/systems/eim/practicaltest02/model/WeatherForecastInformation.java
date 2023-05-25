package ro.pub.cs.systems.eim.practicaltest02.model;

public class WeatherForecastInformation {


    public String rate;
    public String updated;

    public WeatherForecastInformation(String rate, String updated) {
        this.rate    = rate;
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Rate: " + rate + ", updated at: " + updated;
    }


}
