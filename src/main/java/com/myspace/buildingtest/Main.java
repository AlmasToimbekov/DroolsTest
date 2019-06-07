package com.myspace.buildingtest;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {
    public static void main(String[] args) {
    	Main main = new Main(); 
    	main.start();
    }
    public void start() {
    	KieServices kser = KieServices.Factory.get();
        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        KieSession kSession = kc.newKieSession("directory1");

        Resource testRes = new Resource();
        testRes.setAmount("20");
        kSession.insert(testRes);
        kSession.fireAllRules();
        kSession.dispose();
    }
}