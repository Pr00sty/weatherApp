package firstWebserviceClient.weatherApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebserviceMsg {

    public WebserviceMsg() {
    }

    private Coord coord;
    private String base;
    @JsonProperty("main")
    private  MainWeatherData mainWeatherData;
    private String visibility;
    private Clouds clouds;
    private int dt;
    private Sys sys;
    private int id;
    private String name;
    private int cod;

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public String getBase() {
        return base;
    }

    public void setMainWeatherData(MainWeatherData mainWeatherData) {
        this.mainWeatherData = mainWeatherData;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCod() {
        return cod;
    }

    @Override
    public String toString() {
        return "WebserviceMsg{" +
                "coord=" + coord +
                ", base='" + base + '\'' +
                ", mainWeatherData=" + mainWeatherData +
                ", visibility='" + visibility + '\'' +
                ", clouds=" + clouds +
                ", dt=" + dt +
                ", sys=" + sys +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                '}';
    }
}
