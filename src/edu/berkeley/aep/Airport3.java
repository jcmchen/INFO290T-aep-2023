package edu.berkeley.aep;

import java.util.*;

public class Airport3 {
    private List<Airport3> routes;

    public Airport3() {
        routes = new ArrayList<>();
    }

    public void addRoute(Airport3 airport) {
        routes.add(airport);
    }

    public boolean ifConnected(Airport3 airport) {
        if (this == airport) {
            return true;
        }
        for (Airport3 route : routes) {
            if (route.ifConnected(airport)) {
                return true;
            }
        }
        return false;
    }

    List<Integer> result = new ArrayList<>();

    public int getMinHops(Airport3 airport, Set<Airport3> visited) {
        if (this == airport) {
            return 0;
        }

        int minHops = Integer.MAX_VALUE;
        for (Airport3 route : this.routes) {
            int hops = route.getMinHops(this, new HashSet<>(visited));
            if (hops != -1 && (minHops == -1 || hops < minHops)) {
                minHops = hops;

            }

        }
        if (minHops < Integer.MAX_VALUE){
            return minHops +1;
        }
        return minHops;
    }
}
//    private void getHopsHelper(Airport3 airport, List<Airport3> visited, int numHops) {
//
//
//        if (this == airport) {
//            result.add(numHops);
//            return;
//        }
//
//        for (Airport3 route : this.routes) {
//            if (!visited.contains(route)) {
//                visited.add(route);
//                route.getHopsHelper(airport, visited, numHops + 1);
//                visited.remove(route);
//
//            }
//        }
//
//
//    }

