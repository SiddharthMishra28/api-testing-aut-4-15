package com.oopbasics.garbagecollection;

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        String myVal = "Some value";
        System.out.println(myVal);
        myVal =  null;
        System.gc();
        System.out.println("Done!");
    }

    // DOESN'T WORK IN NEWER JDKs
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("i'll be invoked on garbage collection!");
    }
}
