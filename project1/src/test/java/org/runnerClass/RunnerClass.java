package org.runnerClass;

import org.baseClass.BaseClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "C:\\Users\\muges\\git\\musz\\mugesh012\\musz.git\\project1\\src\\test\\resources\\FeatureFile\\Verify_Pending_Time_Sheet.feature",     		
                glue="org.stepDefinition",
                plugin={"html:C:\\Users\\muges\\eclipse-workspace\\project1\\All_Report\\HTML\\tet.html",
                "json:C:\\Users\\muges\\eclipse-workspace\\project1\\All_Report\\JSON\\REPORT.json",
                "junit:C:\\Users\\muges\\eclipse-workspace\\project1\\All_Report\\Junit\\repoert1.xml"                
                },
                 dryRun = false,
                 monochrome = true,
                 strict = true,
                 publish =true
		)

public class RunnerClass extends BaseClass{
	
	@AfterClass
	public static void finalReport() {
		JvmReportMake.jvmReport("C:\\Users\\muges\\eclipse-workspace\\project1\\All_Report\\JSON\\REPORT.json");
	}

}
