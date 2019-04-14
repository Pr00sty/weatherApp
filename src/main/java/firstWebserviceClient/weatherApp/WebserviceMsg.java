package firstWebserviceClient.weatherApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebserviceMsg {

    public WebserviceMsg() {
    }

    private String base;
    private String visibility;
    private int dt;
    private int id;
    private String name;
    private int cod;

    public String getBase() {
        return base;
    }

    public String getVisibility() {
        return visibility;
    }

    public int getDt() {
        return dt;
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
                "base='" + base + '\'' +
                ", visibility='" + visibility + '\'' +
                ", dt=" + dt +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                '}';
    }
}
