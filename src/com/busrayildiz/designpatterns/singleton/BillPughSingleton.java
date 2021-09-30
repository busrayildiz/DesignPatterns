package com.busrayildiz.designpatterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){

    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    //When it needed to BillPugh class's components then this SingletonHelper class will be uploaded to JVM
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public void singletonTest(){
        System.out.println("BillPugh singleton method has runned");
    }
}
