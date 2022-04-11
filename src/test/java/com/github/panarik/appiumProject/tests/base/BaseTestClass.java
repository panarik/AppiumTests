package com.github.panarik.appiumProject.tests.base;

import com.github.panarik.appiumProject.controller.AppiumInstance;
import com.github.panarik.appiumProject.model.screen.Map;
import com.github.panarik.appiumProject.model.screen.Search;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.github.panarik.appiumProject.controller.Controller.log;

public class BaseTestClass {

    private AppiumInstance instance; // one instance

    //Setup pages
    // Add only common pages. If page is a part of scenario do not create it.
    protected Map map = new Map();
    protected Search search = new Search();

    @BeforeTest
    public void start() {
        String osName = "ANDROID";
        log.info(osName + " driver: setup.");
        instance = new AppiumInstance();
        instance.setup(osName);
        log.info(osName + " driver: ready.");
    }

    @AfterTest
    public void shutdown() {
        instance.stop();
        log.info("Driver has shutdown.");
    }

}
