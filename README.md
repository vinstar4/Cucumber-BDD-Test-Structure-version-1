### Overview
 This project demonstrates a basic Cucumber BDD login test using Selenium WebDriver and JUnit.
 
### Project Structure

```
src/test/java
 ├── stepDefinitions
 │    └── steps.java
 └── testRunner
      └── TestRunner.java

features
 └── loginfeature.feature

pom.xml
```

---

### Dependencies

Defined in `pom.xml`:

* Selenium Java (4.20.0)
* Cucumber Java (7.17.0)
* Cucumber JUnit (7.14.1)

---

### Test Scenario

Feature: Login basics
Scenario: Successful login

* Navigate to website
* Enter username & password
* Click login
* Verify login success

---

### Step Definitions

Implemented in `steps.java`:

* Launch Chrome browser
* Navigate to site
* Perform login actions
* Validate successful login using assertion

---

### Test Runner

`TestRunner.java` uses:

* `@RunWith(Cucumber.class)`
* `@CucumberOptions` to link feature file and step definitions

---

### How to Run

1. Import project as Maven project
2. Run .feature file as Cucumber feature


