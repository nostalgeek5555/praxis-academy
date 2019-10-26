# Building Java Applications Tutorial
Tutorial steps can be found in this link : https://guides.gradle.org/building-java-applications/

## Gradle Overview 
Gradle is a open-source build automation tools that builds upon the concepts of Apache Ant and Apache Maven and introduces a Groovy-based domain specific language (DSL) instead of XML form used by Maven for declaring project configuration. 
Gradle was designed for multi-project builds, which can grow to be quite large. It supports incremental builds by intelllegently determining which parts of the build tree are up to date, any task dependent only on those parts doesn't need to be re-executed. 

More of gradle can be found here: https://gradle.org/

## 1. Gradle Setup 
Before start to make gradle application make sure that gradle had installed and setup. Here i'm using Windows so I downloaded it for win distribution. Here i'm using gradle 5.6.2 version. Make 'gradle' folder in C: partition then extract gradle bundle in that directory, then set path in windows environment variables like this: 
![setup_1()](https://github.com/nostalgeek5555/praxis-academy/blob/master/Novice/Week%2001%20-%20Day%2002/Latihan/3.%20Gradle/images/1.png)

After that, make sure gradle installed correctly with type command 'gradle -v' in command line like this: 
![setup_2()](https://github.com/nostalgeek5555/praxis-academy/blob/master/Novice/Week%2001%20-%20Day%2002/Latihan/3.%20Gradle/images/2.png)

## 2. Run init gradle task 
From inside the new project directory, run the init task and select java-application project type when prompted.
![init_1()](https://github.com/nostalgeek5555/praxis-academy/blob/master/Novice/Week%2001%20-%20Day%2002/Latihan/3.%20Gradle/images/3.png)

## 3. Review the generated project files
The file src/main/java/demo/App.java is shown here:
![review_1()](https://github.com/nostalgeek5555/praxis-academy/blob/master/Novice/Week%2001%20-%20Day%2002/Latihan/3.%20Gradle/images/6.png)

The test class, src/test/java/demo/AppTest.java is shown next:
![review_2()](https://github.com/nostalgeek5555/praxis-academy/blob/master/Novice/Week%2001%20-%20Day%2002/Latihan/3.%20Gradle/images/7.png)

## 4. Execute the build 
To build the project, run the build task. I'm using regular gradle build command inside the project folder like this:
![build_1()](https://github.com/nostalgeek5555/praxis-academy/blob/master/Novice/Week%2001%20-%20Day%2002/Latihan/3.%20Gradle/images/4.png)

## 5. Run the application 
First, use the tasks task to see what task has been added by the plugin. 
![run_1()](https://github.com/nostalgeek5555/praxis-academy/blob/master/Novice/Week%2001%20-%20Day%2002/Latihan/3.%20Gradle/images/5.png)

Now run the application with command 'gradle run' like this:
![run_2()](https://github.com/nostalgeek5555/praxis-academy/blob/master/Novice/Week%2001%20-%20Day%2002/Latihan/3.%20Gradle/images/8.png)