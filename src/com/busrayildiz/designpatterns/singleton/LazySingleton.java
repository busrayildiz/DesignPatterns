package com.busrayildiz.designpatterns.singleton;

public class LazySingleton {

    public static LazySingleton lazySingleton;

    private LazySingleton(){

    }

    public static LazySingleton getLazySingleton() {
        if(lazySingleton==null)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }

    public void singletonTest(){
        System.out.println("Lazy singleton method has runned");
    }
}
