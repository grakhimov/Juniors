package root.oop;

import java.util.List;

public class Human {
    private Object head;
    private Object torso;
    private List<Object> hands;
    private List<Object> legs;

    public Human(Object head, Object torso, List<Object> hands, List<Object> legs) {
        this.head = head;
        this.torso = torso;
        this.hands = hands;
        this.legs = legs;
    }

    public Object getHead() {
        return head;
    }

    public Object getTorso() {
        return torso;
    }

    public List<Object> getHands() {
        return hands;
    }

    public List<Object> getLegs() {
        return legs;
    }

    public void addHands(Object hand) {
        this.hands.add(hand);
    }

    public void walk() {

    }
}
