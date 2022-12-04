package org.runnerClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.baseClass.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportMake extends BaseClass {
	public static void jvmReport(String report) {
		File file = new File("C:\\Users\\muges\\eclipse-workspace\\project1\\All_Report\\JVM");		
		Configuration config = new Configuration(file,"TestReprot");
		config.addClassifications("name", "MUGESH");
		config.addClassifications("phone", "882385XX");
		config.addClassifications("jdk version", "18.0");
		config.addClassifications("platform of OS", "windows10");
		config.addClassifications("browser", "chromeBrowser");
		config.addClassifications("IDE", "Eclipse");		
		List<String> list =new ArrayList<String>();
		list.add(report);
	    ReportBuilder builds = new ReportBuilder(list, config);
	    builds.generateReports();
		}
}
