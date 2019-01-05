package gps_application.i342039.gps_app;

public class LocationData {

    public double longitude;
    public double latitude;

    public LocationData(double lat, double lon) {
        this.latitude = lat;
        this.longitude = lon;
    }

    private LocationData() {}
}
