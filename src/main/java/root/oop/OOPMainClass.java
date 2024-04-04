package root.oop;

import java.util.List;

public class OOPMainClass {
    public static void main(String[] args) {
        HealthyChild healthyChild = new HealthyChild("head", "torso", List.of("hand1", "hand2"), List.of("leg1", "leg2"));
        SickChild sickChild = new SickChild("head", "torso", List.of("hand1", "hand2"), List.of("leg1", "leg2"));
        healthyChild.wave();
        sickChild.wave();
    }
}
