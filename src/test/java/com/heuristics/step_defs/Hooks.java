package com.heuristics.step_defs;

import com.heuristics.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void init() {

        Driver.getDriver().get("https://training.qa.learningbuilder.net/account/login");
    }

    @After
    public void terDown() {
        Driver.closeDriver();
    }
}

