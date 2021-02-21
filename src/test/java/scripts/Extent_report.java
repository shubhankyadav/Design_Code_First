package scripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Extent_report {

	@Test
	public void ext_report() {
		ExtentReports reports=new ExtentReports("./reports/r.html",false);
		ExtentTest test = reports.startTest("TESTING");
		test.log(LogStatus.PASS,"TC are PASS");
		test.log(LogStatus.FAIL,"TC are FAILED");
		test.log(LogStatus.SKIP,"TC are SKIPPED");
		reports.endTest(test);
		reports.flush();
		
		
		
		
	}
}
