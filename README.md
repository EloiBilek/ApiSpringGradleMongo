---
Title: ApiSpringGradleMongo
Description: API example using Spring, Gradle and MongDB
Author: Eloi Bilek
Tags: gradle, restful, api, java, spring, mongodb
Created: 2016 Abr 11

---

# ApiSpringGradleMongo
==============================

It 's a very simple example of an RestFul API, CRUD of User.
Using:
* Java 8
* Gradle 2.12
* Spring 4
* MongoDB 3.2.4
* Tomcat 8
* Eclipse Java EE IDE - Version: Mars.1 Release (4.5.1)

## Note 1!
This project was started with: New > Gradle > Project Gradle.

![init project](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGP/init_project.png)

Using the plugin (Add in Eclipse Marketplace). 

![gradle plugin](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGP/gradle_plugin.png)

To run the project in Tomcat server linked in Eclipse, set the Project Facets in: ApiSpringGradleMongo > Properties > Project Facets.

![facets](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGP/facets.png)

... And add external dependencies on: ApiSpringGradleMongo > Properties > Deployment Assembly.

![facets](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGP/properties_deployment.png)

After importing the project to the Eclipse workspace, run build in: ApiSpringGradleMongo > Gradle > Refresh Gradle Project.
Or select task (assemble, build...) in Gradle Tasks perspective.

![gradle tasks](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGP/gradle_tasks.png)

In Tomcat server, add the project, click Publish, make sure synchronized.
Start with Play or Debug.

To test requests (post, get, put and delete), I use the following plugin for chrome:

![rest plugin](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGP/chrome_rest_plugin.png)

Request example.

![request test](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGM/request_test.png)

Response example.

![response test](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGM/response_test.png)








