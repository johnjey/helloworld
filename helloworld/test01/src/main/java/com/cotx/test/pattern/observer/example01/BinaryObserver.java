package com.cotx.test.pattern.observer.example01;

public class BinaryObserver extends Observer {

   public BinaryObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary string :"+Integer.toBinaryString(subject.getState()));
    }
}
