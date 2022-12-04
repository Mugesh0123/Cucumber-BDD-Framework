package org.runnerClass;


import org.baseClass.BaseClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class ReRunClass {
	@RunWith(Cucumber.class)
	@CucumberOptions( features= "C:\\Users\\muges\\eclipse-workspace\\project1\\ReTest\\retest.txt",
            glue="org.stepDefinition",
            plugin={"html:C:\\Users\\muges\\eclipse-workspace\\project1\\All_Report\\HTML",
            "json:C:\\Users\\muges\\eclipse-workspace\\project1\\All_Report\\JSON\\REPORT.json",
            "junit:C:\\Users\\muges\\eclipse-workspace\\project1\\All_Report\\Junit\\repoert1.xml",
            "rerun:C:\\Users\\muges\\eclipse-workspace\\project1\\ReTest\\retest.txt"},
             dryRun = false,
             monochrome = true,
             strict = true,
             publish = true)
	public class ReRunner extends BaseClass{
		@AfterClass
		public  void finalReport() {
			JvmReportMake.jvmReport("C:\\Users\\muges\\eclipse-workspace\\project1\\All_Report\\JSON\\REPORT.json");
		}
		
}
}
