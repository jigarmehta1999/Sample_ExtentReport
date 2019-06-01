package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentHtmlManager {

	static ExtentHtmlReporter html;
	static ExtentReports extent;

	public static ExtentReports ExtentReports() {

		if (extent == null) {
			html = new ExtentHtmlReporter("Extent.html");
			extent = new ExtentReports();

			html.loadConfig("html-config.xml");
			html.config().setAutoCreateRelativePathMedia(true);

			extent.attachReporter(html);
		}
		return extent;

	}
}
