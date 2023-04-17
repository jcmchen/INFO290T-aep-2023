package edu.berkeley.aep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Understands the connections between one airport and other airports
public class Airport {
    private final List<Airport> neighborAirports;

    public Airport(){
        neighborAirports = Collections.unmodifiableList(new ArrayList<>());
    }

    public Airport(Airport neighborAirport){
        List<Airport> neighborAirports = new ArrayList<>();
        neighborAirports.add(neighborAirport);
        this.neighborAirports = Collections.unmodifiableList(neighborAirports);
    }

    public Airport(List<Airport> neighborAirports){
        this.neighborAirports = Collections.unmodifiableList(neighborAirports);
    }

    public void addNeighbor(Airport newNeighbor) {
        neighborAirports.add(newNeighbor);
    }

    public boolean ifConnected(Airport other) {
        if (other == this || neighborAirports.contains(other)) {
            return true;
        }

        for (Airport neighbor : neighborAirports) {
            boolean isNeighborConnected = neighbor.ifConnected(other);
            if (isNeighborConnected) {
                return true;
            }
        }

        return false;
    }
}
