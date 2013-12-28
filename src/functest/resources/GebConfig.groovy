/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

reportsDir = "build/reports/geb-reports"

import org.openqa.selenium.safari.SafariDriver
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
	timeout = 5
}
driver = { new FirefoxDriver() }
/*
environments {
	firefox {
		driver = { new FirefoxDriver() }
	}
	safari {
		driver= { new SafariDriver() }
	}
}
*/