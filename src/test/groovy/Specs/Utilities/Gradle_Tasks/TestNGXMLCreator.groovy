package Specs.Utilities.Gradle_Tasks

import org.testng.TestNG
import org.testng.xml.*

/**
 * Created by E002183 on 5/7/2016.
 */
class TestNGXMLCreator {

    public static void main(String[] args) {

        String rootDir = new File(".").getCanonicalPath();
        convertPropertiesToSystemProperties();
        String CLASSES = System.getProperty("class.name").trim()
        int thread_count = System.getProperty("threadCount").trim().toInteger();
        String testngXMLFilePath = rootDir + System.getProperty("testng.xml.file.path").replace("/", File.separator)

        TestNG myTestNG = new TestNG();
        List<XmlSuite> mySuites = new ArrayList<XmlSuite>();

        XmlSuite suite = new XmlSuite();
        suite.setName("Cucumber Suite");
        suite.setParallel("classes");
        suite.setThreadCount(thread_count)
        suite.addListener(System.getProperty("testng.listeners.path"))

        XmlTest test = new XmlTest(suite);
        test.setName("Cucumber Test");
        test.setPreserveOrder("true");

        /*Create a GROUP*/
        List<String> groupList = new ArrayList<String>();
            List<XmlClass> classList = new ArrayList<XmlClass>();
            CLASSES.split(",").each {
                classes -> classList.add(new XmlClass(classes));
            }
            test.setXmlClasses(classList);

        File file = new File(testngXMLFilePath);
        FileWriter writer = new FileWriter(file);
        writer.write(suite.toXml());
        writer.close();
        mySuites.add(suite);

        myTestNG.setXmlSuites(mySuites);
    }

    public static void convertPropertiesToSystemProperties() {
        String project_properties_path = "/src/main/resources/project.properties".replace('/', File.separator)
        String projectPropertiesPath = new File(".").getCanonicalPath() + project_properties_path;
        Properties properties = new Properties()
        properties.load(new FileInputStream(projectPropertiesPath))
        properties.each { key, value ->
            if (System.getProperty(key) == null) {
                System.setProperty(key, value);
            }
        }
    }
}
