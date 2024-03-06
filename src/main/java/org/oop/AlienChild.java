package org.oop;

import java.util.List;

public class AlienChild implements HandsAbilities {
    private Object head;
    private Object torso;
    private List<Object> hands;

    @Override
    public void wave() {
        System.out.println("massive wave");
    }

    @Override
    public void shake() {
        System.out.println("massive shake");
    }
}
