package org.oop;

import java.util.List;

public class HealthyChild extends Human implements HandsAbilities{
    public HealthyChild(Object head, Object torso, List<Object> hands, List<Object> legs) {
        super(head, torso, hands, legs);
    }

    @Override
    public void wave() {
        System.out.println("wave");
    }

    @Override
    public void shake() {
        System.out.println("shake");
    }
}
