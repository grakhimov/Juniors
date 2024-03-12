package org.oopv2;

import java.util.List;

public class Dog extends Animal implements AnimalBehavior {
    public Dog(Object head, Object torso, List<Object> paws) {
        super(head, torso, paws);
    }
    private Object craziness;

    @Override
    public void voice() {
        System.out.println("Gav!");
        doSomething("obj1");
    }

    @Override
    public void meetMaster() {
        System.out.println("Coming to master");
    }
}
