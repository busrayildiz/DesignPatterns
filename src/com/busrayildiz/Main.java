package com.busrayildiz;

import com.busrayildiz.designpatterns.singleton.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    EagerInitializationSingleton.getInstance().singletonTest();
    StaticBlockSingleton.getStaticBlockSingleton().singletonTest();
    LazySingleton.getLazySingleton().singletonTest();
    ThreadSafeSingleton.getThreadSafeSingleton().singletonTest();
    BillPughSingleton.getInstance().singletonTest();
    }
}
