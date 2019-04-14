package firstWebserviceClient.weatherApp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Clouds {
    private String all;

    public String getAll() {
        return all;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "all='" + all + '\'' +
                '}';
    }
}
