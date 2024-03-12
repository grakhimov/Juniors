package org.oopv2;

import java.util.List;

public abstract class Animal {
    private Object head;
    private Object torso;
    private List<Object> paws;

    public Animal(Object head, Object torso, List<Object> paws) {
        this.head = head;
        this.torso = torso;
        this.paws = paws;
    }

    public void doSomething(Object obj1) {
        System.out.println("Do something 1");
    }

    public void doSomething(Object obj1, Object obj2) {
        System.out.println("Do something 2");
    }

    public Object getHead() {
        return head;
    }

    public void setHead(Object head) {
        this.head = head;
    }

    public Object getTorso() {
        return torso;
    }

    public void setTorso(Object torso) {
        this.torso = torso;
    }

    public List<Object> getPaws() {
        return paws;
    }

    public void setPaws(List<Object> paws) {
        this.paws = paws;
    }
}
