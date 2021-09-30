package com.busrayildiz;

import com.busrayildiz.designpatterns.singleton.EagerInitializationSingleton;
import com.busrayildiz.designpatterns.singleton.LazySingleton;
import com.busrayildiz.designpatterns.singleton.StaticBlockSingleton;

public class Main {

    public static void main(String[] args) {
	// write your code here
    EagerInitializationSingleton.getInstance().singletonTest();
    StaticBlockSingleton.getStaticBlockSingleton().singletonTest();
    LazySingleton.getLazySingleton().singletonTest();
    }
}
