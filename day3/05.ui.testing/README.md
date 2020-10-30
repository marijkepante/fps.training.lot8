# Testing UIs with Selenium

## Agenda 

* Basic Selenium WebDriver Setup 
* 
* 

## Basic Selenium WebDriver Setup 

* Observe the dependencies declaration 
* Compile your project with command `mvn clean install -DskipTests`
* Create a run configuration with profile  `localhost chrome nogrid` and command `mvn test`
    * Uncomment the test `TestGooglePage` in the file  `src/test/resources/testng.xml`
    * Fix the test `TestGooglePage`
    * Uncomment the test `TestGoogleHomePageForElements` in the file  `src/test/resources/testng.xml`
    * Fix the test `TestGoogleHomePageForElements`
* Once accessible, you should be able to browse through the elements in the desired webpage 
   * Add 
* For parallel testing edit file `src/test/resources/testng.xml`, replace 
```xml
 <suite name="TestSuite" verbose="5">
```
```xml
 <suite name="TestSuite" verbose="5" parallel="classes" thread-count="5">
```
## 

* 
    * 
    * 
    * 

## Resources
