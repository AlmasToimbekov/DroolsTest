package com.myspace.buildingtest.directory1;

import com.myspace.buildingtest.BaseTest;
import com.myspace.buildingtest.Resource;
import org.junit.Test;
import org.kie.api.runtime.KieSession;

public class Directory1Test extends BaseTest {

    @Test
    public void test1() {

        KieSession kSession = this.createSession("directory1");
        Resource testRes = new Resource();
        testRes.setAmount("20");
        kSession.insert(testRes);
        kSession.fireAllRules();
        kSession.dispose();
    }
}
