package org.oop;

import java.util.List;

public class SickChild extends Human implements HandsAbilities{
    public SickChild(Object head, Object torso, List<Object> hands, List<Object> legs) {
        super(head, torso, hands, legs);
    }

    @Override
    public void wave() {
        System.out.println("sick wave");
    }

    @Override
    public void shake() {
        System.out.println("sick shake");
    }
}
