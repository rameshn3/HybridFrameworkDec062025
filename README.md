# HybridFrameworkDec062025
this is java selenium hybrid framework with POM pattern
E-Commerce UI Automation Framework – TutorialsNinja Demo Application

This repository contains a Hybrid Selenium Automation Framework built using
Java, Selenium WebDriver, TestNG, Maven, and Page Object Model (POM) design pattern.

The framework automates workflows for the demo e-commerce site:
🔗 https://tutorialsninja.com/demo/index.php?route=common/home
🚀 Tech Stack

Java 21

Selenium WebDriver 4.38.0

TestNG

Maven

Page Object Model (POM)

Apache POI (Excel Data Handling)

WebDriverManager

JavaScript Utilities

Extent Reports - chaintest reports
HybridFrameworkDec062025
│
├── src/main/java
    
│   ├── pages
│   │   ├── HomePage.java
│   │   ├── LoginPage.java
│   │   ├── RegisterPage.java
│   │   ├── LogoutPage.java
│   │   ├── MyAccountPage.java
│   │   ├── ProductDetailsPage.java
│   │
│   ├── utils
│   │   ├── WebDriverUtils.java
│   │   ├── JavaScriptUtils.java
│   │   ├── ExcelUtils.java
│   │   ├── Constants.java
│   │
│   ├── base
│   │   └── BaseTest.java
│
├── src/test/java
│   ├── testcases
│   │   ├── LoginTest.java
│   │   ├── RegistrationTest.java
│   │   ├── LogoutTest.java
│   │   ├── ProductSearchTest.java
│   │   ├── AddToCartTest.java
│   │
│   ├── data
│   │   └── TestData.xlsx
│── src/test/resource
       --config.properties
       --chaintest.properties
       --log4j2.xml
       --allure.properties
       testsuites
        testng.xml
├── pom.xml
└── README.md
Framework Features
✔ Page Object Model (POM)

Each page is implemented as a dedicated class:

HomePage

LoginPage

RegisterPage

LogoutPage

MyAccountPage

ProductDetailsPage

✔ Reusable Utility Classes

WebDriverUtils – waits, browser setup, navigation

JavaScriptUtils – scroll, click using JS, highlight elements
ExcelUtils – read/write Excel test data

Constants – URLs, credentials, timeout values

✔ Data-Driven Testing

Framework can read:

User credentials

Product names

Registration data
from Excel sheet under /data/TestData.xlsx

✔ Cross-Browser Support
Chrome, Edge, Firefox through WebDriverManager.

✔ Maven Integration

Easy dependency management

Supports CI/CD (GitHub Actions, Jenkins, etc.)

✔ TestNG Features

Annotations

Parallel execution

Retry mechanism (optional)
TestNG XML Suite execution
Demo Application Credentials

For demo login tests:

Username : rameshqaonline@gmail.com
Password : <your password or dummy placeholder>
How to Execute Tests
1️⃣ Clone repository
git clone https://github.com/rameshn3/HybridFrameworkDec062025.git
Navigate to project
cd HybridFrameworkDec062025
Run Maven test
mvn clean test

4️⃣ Run specific TestNG XML
mvn clean test -DsuiteXmlFile=testng.xml
Test Scenarios Covered
🔹 User Authentication

Login with valid/invalid credentials

Logout scenario

MyAccount navigation verification

🔹 User Registration

Register new user from Excel data

Duplicate account handling

Mandatory field validations

🔹 Product & Shopping

Search product

Open product details page

Add product to cart (if implemented)
Validate product details
Reports

TestNG default reports generated at:

/test-output/
target
---chaintestreports
     ---index.html
     ---emailablereport.html

Configuration (Config.properties)

Contains:

Base URL

Browser type

Timeouts

Paths for Excel sheet

Example:

public static final String BASE_URL = "https://tutorialsninja.com/demo/index.p


Enhancements Planned

Extent Report / Allure report integration

Grid execution (Selenium Grid / BrowserStack)

Retry Analyzer enhancement

Logging with Log4j2