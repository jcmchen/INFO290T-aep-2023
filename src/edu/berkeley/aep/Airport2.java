package edu.berkeley.aep;

import java.util.ArrayList;
import java.util.List;
//Understands the connection between one airport and another airports
public class Airport2 {
    private List<Airport2> routes;
//    private List<Route> cost;

    public Airport2() {
        routes = new ArrayList<>();
    }

    public void addRoute(Airport2 airport){ //(Airport2 airport, int cost)

        routes.add(airport);
//        cost.add(de);
    }

    public boolean ifConnected(Airport2 airport) {
        if (this == airport) {
            return true;
        }
        for (Airport2 route : routes) {
            if (route.ifConnected(airport)) {
                return true;
            }
        }
        return false;
    }

    public int getHops(Airport2 airport) {
        if (this == airport) {
            return 0;
        }
        List<Airport2> visited = new ArrayList<Airport2>();
        visited.add(this);
        return getHopsHelper(airport, visited, 0);
    }
    private int getHopsHelper(Airport2 airport, List<Airport2> visited, int numHops) {
        if (this == airport) {
            return numHops;
        }
        int minHops = -1;
        for (Airport2 route : this.routes) {
            if (!visited.contains(route)) {
                visited.add(route);
                int hops = route.getHopsHelper(airport, visited, numHops + 1);
                if (hops != -1 && (minHops == -1 || hops < minHops)) {
                    minHops = hops;
                }
            }
        }
        return minHops;
    }

}
