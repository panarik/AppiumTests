package com.github.panarik.appiumProject.tests;

import com.github.panarik.appiumProject.tests.base.CommonActions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOne extends CommonActions {

    @BeforeClass
    public void init() {
    }

    @Test
    public void openMenu() {
        openMainMenu();
    }

}
