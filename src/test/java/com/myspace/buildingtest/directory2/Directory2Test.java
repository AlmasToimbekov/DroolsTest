package com.myspace.buildingtest.directory2;

import com.myspace.buildingtest.BaseTest;
import com.myspace.buildingtest.Resource;
import org.junit.Test;
import org.kie.api.runtime.KieSession;

public class Directory2Test extends BaseTest {

    @Test
    public void test1() {

        KieSession kSession = this.createSession("directory2");
        Resource testRes = new Resource();
        testRes.setAmount("20");
        Resource testRes2 = new Resource();
        testRes.setAmount("25");
        Resource testRes3 = new Resource();
        testRes.setAmount("2");
        kSession.insert(testRes);
        kSession.insert(testRes2);
        kSession.insert(testRes3);
        kSession.fireAllRules();
        kSession.dispose();
    }
}
