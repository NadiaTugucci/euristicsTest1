package com.heuristics.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features" ,
        glue = "com/heuristics/step_defs" ,
        dryRun = false,
        tags = "@wip"

)

public class CukesRunner {
}