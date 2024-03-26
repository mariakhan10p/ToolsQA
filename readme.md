**Getting Started**
1. Clone Project
2. Open project via pom.xml in the IDE to import dependencies

##### **Project Structure**
1. config folder:
    * **config.properties** to define main configurations like URL.
2. src/main/java/com/utils/
    * **ConfigUtil** is a file reader to read .properties file
3. src/main/java/com/tenPearls/demoproject/
    *  page classes are placed in this package.
4. src/test/java/com/tenPearls/demoproject/
    * test classes are placed in this package.
5. TestRunner.xml
    * **TestRunner.xml** is the runner file.
    * Define Test Classes that you want to execute in the runner
6. Driver set up
   * **driver** folder must have the chromedriver.
   * Define driver path in line 27 PracticeFormPage.



