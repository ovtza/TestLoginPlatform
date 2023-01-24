
# TestLoginPlatform

Simple UI testing of example login/register page. The project uses testng for assertions, selenium webdriver to automate UI, webdrivermanager for automated chromedriver choosing and cucumber for specifying feature behaviours.

## Install the helper UI application

```bash
https://github.com/MusheAbdulHakim/User-Account-Sign-up-and-Sign-in
```
The quick installation steps are in the repository mentioned above

## Run Locally Test Platform

Clone repository and import gradle project

```bash
  git clone git@github.com:ovtza/TestLoginPlatform.git
```

Specify where on your machine you have set up a helper application in the Steps class

Example:
```bash
pageUrl = "http://localhost/netguru/User-Account-Sign-up-and-Sign-in/";
```

Tests can be run manually through intellij or gradle wrapper

```bash
  gradlew test
```
Java **11** is needed for proper testing. For the feature syntax it is necessary to install the gherkin and cucumber plugin in your IDE.



## Find me
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/szymon-owczarzak/)