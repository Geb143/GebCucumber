package Specs

import org.testng.TestNG
import org.testng.xml.XmlClass
import org.testng.xml.XmlInclude
import org.testng.xml.XmlSuite
import org.testng.xml.XmlTest

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
        suite.setName("Viralgains Test Suite");
        suite.setParallel("tests");
        suite.setThreadCount(thread_count)
        suite.addListener("Listeners.TestNGExecutionListener")

        XmlTest test = new XmlTest(suite);
        test.setName("Viralgains Test");
        test.setPreserveOrder("true");


        /*Create only CLASSES*/
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
        String project_properties_path = "/src/test/resources/project.properties".replace('/', File.separator)
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
