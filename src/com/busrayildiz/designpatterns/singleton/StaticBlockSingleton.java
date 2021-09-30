package com.busrayildiz.designpatterns.singleton;

public class StaticBlockSingleton  {

    private static StaticBlockSingleton staticBlockSingleton;

    //Runs before the instance is created
    static{
        try {
            staticBlockSingleton = new StaticBlockSingleton();
        }catch (Exception e){

        }

    }

    private StaticBlockSingleton() {
    }

    public static StaticBlockSingleton getStaticBlockSingleton() {
        return staticBlockSingleton;
    }

    public void singletonTest(){
        System.out.println("StaticBlock singleton method has runned");
    }
}
